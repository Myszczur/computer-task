package pl.urbanik.computerapp.nbp.exchange;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@ToString
public class RateDto {
    @JsonProperty("no")
    private String number;
    @JsonProperty("effectiveDate")
    private LocalDate created;
    private BigDecimal bid;
    private BigDecimal ask;
}
