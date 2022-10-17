package pl.urbanik.computerapp.nbp.exchange;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@AllArgsConstructor
public class RateController {

    private final ExchangeRate exchangeRate;

    @RequestMapping("/nbp")
    @ResponseBody
    public TableDto getCurrencyTable() {
        return exchangeRate.getDataFromTable();
    }
}
