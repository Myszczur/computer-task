package pl.urbanik.computerapp.nbp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TableDto {

    private char table;
    private String currency;
    private String code;
    private List<RateDto> rates;
}
