package kg.megacom.employees.mapper;

import kg.megacom.employees.models.Account;
import kg.megacom.employees.models.dtos.AccountDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper extends BaseMapper<Account, AccountDto>{

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);
}
