package kg.megacom.employees.models;

import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Service;


@Getter
@ToString
public enum AccountStatus {
     BLOCKED,
     ACTIVE,
     DELETED;

}
