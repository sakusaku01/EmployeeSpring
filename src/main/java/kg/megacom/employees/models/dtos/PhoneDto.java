package kg.megacom.employees.models.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhoneDto {
    Long id;
    String number;
    EmployeeDto employeeId;
}
