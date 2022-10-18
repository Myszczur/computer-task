package pl.urbanik.computerapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.urbanik.computerapp.models.Computer;

import java.util.List;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long> {

    @Query("SELECT c FROM Computer c WHERE CONCAT(c.name, ' ', c.accountingDate) LIKE %?1%")
    List<Computer> search(String keyword);
}
