package kg.megacom.employees.repository;

import kg.megacom.employees.models.Account;
import kg.megacom.employees.models.AccountStatus;
import kg.megacom.employees.models.dtos.AccountDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;

@Repository
public interface AccountRep extends JpaRepository<Account,Long> {

    @Transactional
    Optional<Account> findByLogin(String login);


    @Transactional
    @Modifying
    @Query("update Account a set a.expiredDate = ?1, a.accountStatus = ?2, a.count = ?3 where a.id = ?4")
    int update(Date expiredDate, AccountStatus accountStatus, int count, Long id);

    @Transactional
    @Modifying
    @Query("update Account a set a.count = ?1 where a.id = ?2")
    int updateCount(int count, Long id);











}
