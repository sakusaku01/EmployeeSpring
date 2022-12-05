package kg.megacom.employees.models;


import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String login;
    String password;
    int count;
    @Enumerated(EnumType.STRING)
    AccountStatus accountStatus;
    @Temporal(TemporalType.TIME)
    Date expiredDate;
    @Temporal(TemporalType.TIME)
    Date updateDate;


    @PrePersist
    protected void onCreate(){
        accountStatus = AccountStatus.ACTIVE;
        expiredDate = new Date();
        updateDate = new Date();
        count = 0;
    }

    @PreUpdate
    private void onUpdate(){
        updateDate=new Date();
    }






}
