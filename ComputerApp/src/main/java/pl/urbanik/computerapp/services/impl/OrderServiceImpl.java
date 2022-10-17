package pl.urbanik.computerapp.services.impl;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanik.computerapp.models.Computer;
import pl.urbanik.computerapp.models.Facture;
import pl.urbanik.computerapp.nbp.exchange.ExchangeRate;
import pl.urbanik.computerapp.nbp.exchange.RateDto;
import pl.urbanik.computerapp.nbp.exchange.TableDto;
import pl.urbanik.computerapp.repository.ComputerRepository;
import pl.urbanik.computerapp.services.OrderService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final ExchangeRate exchangeRate;
    private final ComputerRepository computerRepository;

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
    public void saveOrder() {

        XStream xstream = new XStream();
        xstream.alias("komputer", Computer.class);
        xstream.alias("faktura", Facture.class);
        xstream.addImplicitCollection(Facture.class, "list");

        Facture list = new Facture();
        for(Computer computer : this.computersList){
            list.add(computer);
        }

        String xml = xstream.toXML(list);
        System.out.println(xml);

        computerRepository.saveAll(this.computersList);
    }
}

