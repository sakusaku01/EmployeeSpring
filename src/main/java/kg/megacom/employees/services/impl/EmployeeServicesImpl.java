package kg.megacom.employees.services.impl;

import kg.megacom.employees.mapper.AccountMapper;
import kg.megacom.employees.mapper.EmployeeMapper;
import kg.megacom.employees.models.Employee;
import kg.megacom.employees.models.dtos.AccountDto;
import kg.megacom.employees.models.dtos.EmployeeDto;
import kg.megacom.employees.repository.EmployeeRep;
import kg.megacom.employees.services.AccountServices;
import kg.megacom.employees.services.EmployeeServices;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServicesImpl implements EmployeeServices {
   @Autowired
    private EmployeeRep employeeRep;

   @Autowired
    AccountServices accountServices;

    @Transactional
    @Override
    public EmployeeDto save(EmployeeDto dto) {
        return EmployeeMapper.INSTANCE.toDto(employeeRep.save(EmployeeMapper.INSTANCE.toEntity(dto)));
    }

    @Override
    public EmployeeDto findById(Long id) {
        return EmployeeMapper.INSTANCE.toDto
                (employeeRep.findById(id).orElseThrow(
                        ()->new RuntimeException("Не найден сотрудник с таким id")));
    }

    @Override
    public List<EmployeeDto> findAll() {
        return EmployeeMapper.INSTANCE.toDtos(employeeRep.findAll());
    }
}
