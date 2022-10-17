package pl.urbanik.computerapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.urbanik.computerapp.models.Computer;
import pl.urbanik.computerapp.services.OrderService;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;


    @GetMapping()
    public String addComputer(Model model) {
        model.addAttribute("computer", new Computer());
        return "/order/add";
    }

    @PostMapping()
    public String saveToOrderList(@Valid Computer computer, BindingResult result) {
        if (result.hasErrors()) {
            return "order/add";
        }
        orderService.saveComputerToList(computer);
        return "redirect:/order";
    }

    @GetMapping(value = "/order-summary")
    public String orderList(Model model) {
        model.addAttribute("summary", orderService.getSummaryList());
        return "order/order-summary";
    }
}
