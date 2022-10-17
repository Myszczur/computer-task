package pl.urbanik.computerapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.urbanik.computerapp.models.Computer;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long> {
}
