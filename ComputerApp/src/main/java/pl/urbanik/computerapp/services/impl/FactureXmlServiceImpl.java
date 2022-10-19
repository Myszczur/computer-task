package pl.urbanik.computerapp.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanik.computerapp.models.FactureXml;
import pl.urbanik.computerapp.repository.FactureXmlRepository;
import pl.urbanik.computerapp.services.FactureXmlService;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FactureXmlServiceImpl implements FactureXmlService {

    private final FactureXmlRepository factureXmlRepository;

    @Override
    public List<FactureXml> getAllFactures() {
        return factureXmlRepository.findAll();
    }

    @Override
    public List<FactureXml> searchFactures(String keyword) {
        if (keyword != null) {
            return factureXmlRepository.search(keyword);
        }
        return factureXmlRepository.findAll();
    }

    @Override
    public List<FactureXml> getAllFacturesByData() {
        List<FactureXml> factureXml = factureXmlRepository.findAll();
        factureXml.sort(Comparator.comparing(FactureXml::getAccountingDate));
        return factureXml;
    }

    @Override
    public List<FactureXml> getAllCFacturesByDataRev() {
        List<FactureXml> factureXml = factureXmlRepository.findAll();
        factureXml.sort(Comparator.comparing(FactureXml::getAccountingDate).reversed());
        return factureXml;
    }

    @Override
    public List<FactureXml> getAllFacturesByName() {
        List<FactureXml> factureXml = factureXmlRepository.findAll();
        factureXml.sort(Comparator.comparing(FactureXml::getName));
        return factureXml;
    }

    @Override
    public List<FactureXml> getAllFacturesByNameReverse() {
        List<FactureXml> factureXml = factureXmlRepository.findAll();
        factureXml.sort(Comparator.comparing(FactureXml::getName).reversed());
        return factureXml;
    }
}
