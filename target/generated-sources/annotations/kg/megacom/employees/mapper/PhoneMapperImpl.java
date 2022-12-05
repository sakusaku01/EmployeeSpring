package kg.megacom.employees.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import kg.megacom.employees.models.Account;
import kg.megacom.employees.models.Employee;
import kg.megacom.employees.models.Phone;
import kg.megacom.employees.models.Position;
import kg.megacom.employees.models.dtos.AccountDto;
import kg.megacom.employees.models.dtos.EmployeeDto;
import kg.megacom.employees.models.dtos.PhoneDto;
import kg.megacom.employees.models.dtos.PositionDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-05T10:46:22+0600",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.16 (Oracle Corporation)"
)
public class PhoneMapperImpl implements PhoneMapper {

    @Override
    public Phone toEntity(PhoneDto d) {
        if ( d == null ) {
            return null;
        }

        Phone phone = new Phone();

        phone.setId( d.getId() );
        phone.setNumber( d.getNumber() );
        phone.setEmployeeId( employeeDtoToEmployee( d.getEmployeeId() ) );

        return phone;
    }

    @Override
    public PhoneDto toDto(Phone e) {
        if ( e == null ) {
            return null;
        }

        PhoneDto phoneDto = new PhoneDto();

        phoneDto.setId( e.getId() );
        phoneDto.setNumber( e.getNumber() );
        phoneDto.setEmployeeId( employeeToEmployeeDto( e.getEmployeeId() ) );

        return phoneDto;
    }

    @Override
    public List<Phone> toEntities(List<PhoneDto> d) {
        if ( d == null ) {
            return null;
        }

        List<Phone> list = new ArrayList<Phone>( d.size() );
        for ( PhoneDto phoneDto : d ) {
            list.add( toEntity( phoneDto ) );
        }

        return list;
    }

    @Override
    public List<PhoneDto> toDtos(List<Phone> e) {
        if ( e == null ) {
            return null;
        }

        List<PhoneDto> list = new ArrayList<PhoneDto>( e.size() );
        for ( Phone phone : e ) {
            list.add( toDto( phone ) );
        }

        return list;
    }

    protected Position positionDtoToPosition(PositionDto positionDto) {
        if ( positionDto == null ) {
            return null;
        }

        Position position = new Position();

        position.setId( positionDto.getId() );
        position.setDef( positionDto.getDef() );

        return position;
    }

    protected Account accountDtoToAccount(AccountDto accountDto) {
        if ( accountDto == null ) {
            return null;
        }

        Account account = new Account();

        account.setId( accountDto.getId() );
        account.setLogin( accountDto.getLogin() );
        account.setPassword( accountDto.getPassword() );
        account.setCount( accountDto.getCount() );
        account.setAccountStatus( accountDto.getAccountStatus() );
        account.setExpiredDate( accountDto.getExpiredDate() );
        account.setUpdateDate( accountDto.getUpdateDate() );

        return account;
    }

    protected Employee employeeDtoToEmployee(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( employeeDto.getId() );
        employee.setName( employeeDto.getName() );
        employee.setPositionId( positionDtoToPosition( employeeDto.getPositionId() ) );
        employee.setAccountId( accountDtoToAccount( employeeDto.getAccountId() ) );

        return employee;
    }

    protected PositionDto positionToPositionDto(Position position) {
        if ( position == null ) {
            return null;
        }

        PositionDto positionDto = new PositionDto();

        positionDto.setId( position.getId() );
        positionDto.setDef( position.getDef() );

        return positionDto;
    }

    protected AccountDto accountToAccountDto(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountDto accountDto = new AccountDto();

        accountDto.setId( account.getId() );
        accountDto.setLogin( account.getLogin() );
        accountDto.setPassword( account.getPassword() );
        accountDto.setCount( account.getCount() );
        accountDto.setAccountStatus( account.getAccountStatus() );
        accountDto.setExpiredDate( account.getExpiredDate() );
        accountDto.setUpdateDate( account.getUpdateDate() );

        return accountDto;
    }

    protected EmployeeDto employeeToEmployeeDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setId( employee.getId() );
        employeeDto.setName( employee.getName() );
        employeeDto.setPositionId( positionToPositionDto( employee.getPositionId() ) );
        employeeDto.setAccountId( accountToAccountDto( employee.getAccountId() ) );

        return employeeDto;
    }
}
