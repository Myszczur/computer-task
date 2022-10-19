package pl.urbanik.computerapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.urbanik.computerapp.models.FactureXml;

import java.util.List;

@Repository
public interface FactureXmlRepository extends JpaRepository<FactureXml, Long> {

    @Query("SELECT f FROM FactureXml f WHERE CONCAT(f.name, ' ', f.accountingDate) LIKE %?1%")
    List<FactureXml> search(String keyword);
}
