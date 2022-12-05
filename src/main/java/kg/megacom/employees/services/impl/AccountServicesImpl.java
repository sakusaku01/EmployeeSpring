package kg.megacom.employees.services.impl;

import kg.megacom.employees.mapper.AccountMapper;
import kg.megacom.employees.models.Account;
import kg.megacom.employees.models.AccountStatus;
import kg.megacom.employees.models.dtos.AccountDto;
import kg.megacom.employees.models.requests.AuthRequest;
import kg.megacom.employees.models.responses.Response;
import kg.megacom.employees.repository.AccountRep;
import kg.megacom.employees.services.AccountServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AccountServicesImpl implements AccountServices {

    @Autowired
    private AccountRep accountRep;


    @Override
    public AccountDto save(AccountDto dto) {
        return AccountMapper.INSTANCE.toDto(accountRep.save(AccountMapper.INSTANCE.toEntity(dto)));
    }

    @Override
    public  AccountDto findById(Long id) {
        return AccountMapper.INSTANCE.toDto(accountRep.findById(id).orElseThrow(()->new RuntimeException("Не найден аккаунт с таким id")));
    }

    @Override
    public List<AccountDto> findAll() {
        return AccountMapper.INSTANCE.toDtos(accountRep.findAll());
    }

    @Override
    public Response auth(AuthRequest authRequest) {

        AccountDto accountDto=getByLogin(authRequest.getLogin());
        switch (accountDto.getAccountStatus()){

            case DELETED:
                throw new RuntimeException("account is deleted");
            case BLOCKED:
                if(checkDate(accountDto.getUpdateDate())){
                    accountDto.setCount(0);
                    accountDto.setAccountStatus(AccountStatus.ACTIVE);
                    break;
                }
                throw new RuntimeException("account is blocked ");
            case ACTIVE:
                break;
            default:
                throw new RuntimeException("Ошибка");
        }
        if(!accountDto.getPassword().equals(authRequest.getPassword())){
            if(accountDto.getCount()>=3){
                accountDto.setAccountStatus(AccountStatus.BLOCKED);
                save(accountDto);
                throw new RuntimeException("Неверный пароль.Ваш аккаунт заблокирован.Попробуйте через минуту");
            }
            accountDto.setCount(accountDto.getCount()+1);
            save(accountDto);
            throw new RuntimeException("Неверный пароль");
        }

        Response response = new Response("Успешно", "Token");


        return response;

    }

    private Boolean  checkDate(Date updateDate) {
        Calendar checkDate=Calendar.getInstance();
        checkDate.setTime(updateDate);
        checkDate.add(Calendar.HOUR,1);
        return new Date().after(checkDate.getTime());

    }

    public AccountDto getByLogin(String login) {
        return AccountMapper.INSTANCE.toDto(accountRep.findByLogin(login).orElseThrow
                (()->new RuntimeException("Пользователь не найден")));
    }
}
