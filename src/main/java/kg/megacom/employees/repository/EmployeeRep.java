package kg.megacom.employees.repository;


import kg.megacom.employees.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRep extends JpaRepository<Employee,Long> {

}
