package kg.megacom.employees.repository;

import kg.megacom.employees.models.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRep extends JpaRepository<Phone,Long> {
}
