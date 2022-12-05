package kg.megacom.employees.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import kg.megacom.employees.models.Account;
import kg.megacom.employees.models.dtos.AccountDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-05T10:46:12+0600",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.16 (Oracle Corporation)"
)
public class AccountMapperImpl implements AccountMapper {

    @Override
    public Account toEntity(AccountDto d) {
        if ( d == null ) {
            return null;
        }

        Account account = new Account();

        account.setId( d.getId() );
        account.setLogin( d.getLogin() );
        account.setPassword( d.getPassword() );
        account.setCount( d.getCount() );
        account.setAccountStatus( d.getAccountStatus() );
        account.setExpiredDate( d.getExpiredDate() );
        account.setUpdateDate( d.getUpdateDate() );

        return account;
    }

    @Override
    public AccountDto toDto(Account e) {
        if ( e == null ) {
            return null;
        }

        AccountDto accountDto = new AccountDto();

        accountDto.setId( e.getId() );
        accountDto.setLogin( e.getLogin() );
        accountDto.setPassword( e.getPassword() );
        accountDto.setCount( e.getCount() );
        accountDto.setAccountStatus( e.getAccountStatus() );
        accountDto.setExpiredDate( e.getExpiredDate() );
        accountDto.setUpdateDate( e.getUpdateDate() );

        return accountDto;
    }

    @Override
    public List<Account> toEntities(List<AccountDto> d) {
        if ( d == null ) {
            return null;
        }

        List<Account> list = new ArrayList<Account>( d.size() );
        for ( AccountDto accountDto : d ) {
            list.add( toEntity( accountDto ) );
        }

        return list;
    }

    @Override
    public List<AccountDto> toDtos(List<Account> e) {
        if ( e == null ) {
            return null;
        }

        List<AccountDto> list = new ArrayList<AccountDto>( e.size() );
        for ( Account account : e ) {
            list.add( toDto( account ) );
        }

        return list;
    }
}
