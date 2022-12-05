package kg.megacom.employees.models.dtos;

import kg.megacom.employees.models.AccountStatus;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class AccountDto {
    Long id;
    String login;
    String password;
    int count;
    AccountStatus accountStatus;
    Date expiredDate;
    Date updateDate;


}
