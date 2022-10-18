package pl.urbanik.computerapp.nbp;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
public class RateDto {
    private String no;
    private LocalDate effectiveDate;
    private Double bid;
    private Double ask;
}
