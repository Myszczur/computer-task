package pl.urbanik.computerapp.nbp.exchange;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class NbpService implements ExchangeRate {
    private static final String NBP_API_TABLE = "http://api.nbp.pl/api/exchangerates/rates/c/usd/2022-01-03/?format=json";

    @Override
    public TableDto getDataFromTable() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<TableDto> forEntity = restTemplate.getForEntity(NBP_API_TABLE, TableDto.class);
        return forEntity.getBody();
    }
}
