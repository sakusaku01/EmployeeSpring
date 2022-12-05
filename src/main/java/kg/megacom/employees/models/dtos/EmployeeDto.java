package kg.megacom.employees.models.dtos;

import kg.megacom.employees.models.Account;
import kg.megacom.employees.models.Position;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
public class EmployeeDto {
    Long id;
    String name;
    PositionDto positionId;
    AccountDto accountId;
}
