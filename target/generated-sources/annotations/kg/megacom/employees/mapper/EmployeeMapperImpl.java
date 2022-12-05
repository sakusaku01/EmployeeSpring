package kg.megacom.employees.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import kg.megacom.employees.models.Account;
import kg.megacom.employees.models.Employee;
import kg.megacom.employees.models.Position;
import kg.megacom.employees.models.dtos.AccountDto;
import kg.megacom.employees.models.dtos.EmployeeDto;
import kg.megacom.employees.models.dtos.PositionDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-05T10:46:16+0600",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.16 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee toEntity(EmployeeDto d) {
        if ( d == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( d.getId() );
        employee.setName( d.getName() );
        employee.setPositionId( positionDtoToPosition( d.getPositionId() ) );
        employee.setAccountId( accountDtoToAccount( d.getAccountId() ) );

        return employee;
    }

    @Override
    public EmployeeDto toDto(Employee e) {
        if ( e == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setId( e.getId() );
        employeeDto.setName( e.getName() );
        employeeDto.setPositionId( positionToPositionDto( e.getPositionId() ) );
        employeeDto.setAccountId( accountToAccountDto( e.getAccountId() ) );

        return employeeDto;
    }

    @Override
    public List<Employee> toEntities(List<EmployeeDto> d) {
        if ( d == null ) {
            return null;
        }

        List<Employee> list = new ArrayList<Employee>( d.size() );
        for ( EmployeeDto employeeDto : d ) {
            list.add( toEntity( employeeDto ) );
        }

        return list;
    }

    @Override
    public List<EmployeeDto> toDtos(List<Employee> e) {
        if ( e == null ) {
            return null;
        }

        List<EmployeeDto> list = new ArrayList<EmployeeDto>( e.size() );
        for ( Employee employee : e ) {
            list.add( toDto( employee ) );
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
}
