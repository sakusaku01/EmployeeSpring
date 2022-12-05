package kg.megacom.employees.mapper;

import kg.megacom.employees.models.Employee;
import kg.megacom.employees.models.dtos.EmployeeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee, EmployeeDto>{

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

}
