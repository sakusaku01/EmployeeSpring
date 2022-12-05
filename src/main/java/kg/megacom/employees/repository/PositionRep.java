package kg.megacom.employees.repository;

import kg.megacom.employees.models.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRep extends JpaRepository<Position,Long> {
}
