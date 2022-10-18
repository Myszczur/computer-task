package pl.urbanik.computerapp.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.urbanik.computerapp.services.ComputerService;

@Controller
@AllArgsConstructor
@RequestMapping("/computer")
public class ComputerController {

    private final ComputerService computerService;

    @GetMapping()
    public String getAllComputers(Model model) {
        model.addAttribute("computers", computerService.getAllComputers());
        return "/computer/list";
    }
    @PostMapping()
    public String search(@RequestParam String keyword, Model model) {
        model.addAttribute("computers", computerService.searchComputers(keyword));
            return "/computer/list";
    }

    @GetMapping(value = "/list-data")
    public String getAllComputersByData(Model model) {
        model.addAttribute("computers", computerService.getAllComputersByData());
        return "computer/list-data";
    }

    @GetMapping(value = "/list-data-rev")
    public String getAllComputersByDataRev(Model model) {
        model.addAttribute("computers", computerService.getAllComputersByDataRev());
        return "computer/list-data-rev";
    }

    @GetMapping(value = "/list-name")
    public String getAllComputersByName(Model model) {
        model.addAttribute("computers", computerService.getAllComputersByName());
        return "/computer/list-name";
    }

    @GetMapping(value = "/list-reverse")
    public String getAllComputersByNameReverse(Model model) {
        model.addAttribute("computers", computerService.getAllComputersByNameReverse());
        return "/computer/list-reversed";
    }

    @GetMapping(value = "/show/{id}")
    public String showComputer(Model model, @PathVariable Long id) {
        model.addAttribute("computer", computerService.getComputerById(id));
        return "computer/show";
    }
}