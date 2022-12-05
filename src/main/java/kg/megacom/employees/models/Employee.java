package kg.megacom.employees.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String name;

    @OneToOne
    @JoinColumn(name = "position_id", referencedColumnName = "id")
    Position positionId;

    @OneToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    Account accountId;


}
