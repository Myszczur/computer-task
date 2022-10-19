package pl.urbanik.computerapp.services;

import org.springframework.stereotype.Service;
import pl.urbanik.computerapp.models.FactureXml;

import java.util.List;

@Service
public interface FactureXmlService {
    List<FactureXml> getAllFactures();

    List<FactureXml> searchFactures(String keyword);

    List<FactureXml> getAllFacturesByData();

    List<FactureXml> getAllCFacturesByDataRev();

    List<FactureXml> getAllFacturesByName();

    List<FactureXml> getAllFacturesByNameReverse();
}
