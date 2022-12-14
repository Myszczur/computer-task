package pl.urbanik.computerapp.services.impl;

import com.thoughtworks.xstream.XStream;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanik.computerapp.models.Computer;
import pl.urbanik.computerapp.models.Facture;
import pl.urbanik.computerapp.models.FactureXml;
import pl.urbanik.computerapp.nbp.ExchangeRate;
import pl.urbanik.computerapp.nbp.RateDto;
import pl.urbanik.computerapp.nbp.TableDto;
import pl.urbanik.computerapp.repository.ComputerRepository;
import pl.urbanik.computerapp.repository.FactureXmlRepository;
import pl.urbanik.computerapp.services.OrderService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private static final String SAVE_XML_PATH = "/home/myszczur/Pulpit/computer-task/ComputerApp/src/main/resources/factures/";
    private final ExchangeRate exchangeRate;
    private final ComputerRepository computerRepository;

    private final FactureXmlRepository factureXmlRepository;

    private List<Computer> computersList = new ArrayList<>();

    @Override
    public void saveComputerToList(Computer computer) {
        TableDto tableDto = exchangeRate.getDataFromTable();

        List<RateDto> rateList = tableDto.getRates();
        RateDto rateDto = rateList.get(0);
        double result = Math.round((computer.getUsdCost() * rateDto.getBid()) * 100.0) / 100.0;
        computer.setPlnCost(result);
        computer.setDataRate(rateDto.getEffectiveDate());
        this.computersList.add(computer);
    }

    @Override
    public List<Computer> getSummaryList() {
        return this.computersList;
    }

    @Override
    public void saveOrder() throws IOException {

        XStream xstream = new XStream();
        xstream.alias("komputer", Computer.class);
        xstream.alias("faktura", Facture.class);
        xstream.addImplicitCollection(Facture.class, "list");

        Facture list = new Facture();
        for (Computer computer : this.computersList) {
            list.add(computer);
        }

        String xml = xstream.toXML(list);
        LocalDateTime time = LocalDateTime.now();
        Path pathXMLFile = Paths.get(SAVE_XML_PATH + time + ".XML");
        Files.write(pathXMLFile, xml.getBytes(), StandardOpenOption.WRITE, StandardOpenOption.APPEND, StandardOpenOption.CREATE);

        FactureXml factureXml = new FactureXml();
        factureXml.setName(time.toString());
        factureXmlRepository.save(factureXml);

        computerRepository.saveAll(this.computersList);
        this.computersList.clear();
    }

    @Override
    public double summaryUsd() {
        Stream<Computer> notNullObjs =
                this.computersList.stream().filter(obj -> obj.getUsdCost() != null);

        return notNullObjs.mapToDouble(Computer::getUsdCost).sum();
    }

    @Override
    public double summaryPln() {
        Stream<Computer> notNullObjs =
                this.computersList.stream().filter(obj -> obj.getPlnCost() != null);

        return notNullObjs.mapToDouble(Computer::getPlnCost).sum();
    }
}

