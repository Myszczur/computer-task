package pl.urbanik.computerapp.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.urbanik.computerapp.services.FactureXmlService;

@Controller
@AllArgsConstructor
@RequestMapping("/facture")
public class FactureXmlController {

    private final FactureXmlService factureXmlService;

    @GetMapping()
    public String getAllFactures(Model model) {
        model.addAttribute("factures", factureXmlService.getAllFactures());
        return "/facture/list";
    }

    @PostMapping()
    public String search(@RequestParam String keyword, Model model) {
        model.addAttribute("factures", factureXmlService.searchFactures(keyword));
        return "/facture/list";
    }

    @GetMapping(value = "/list-data")
    public String getAllFacturesByData(Model model) {
        model.addAttribute("factures", factureXmlService.getAllFacturesByData());
        return "facture/list-data";
    }

    @GetMapping(value = "/list-data-rev")
    public String getAllFacturesByDataRev(Model model) {
        model.addAttribute("factures", factureXmlService.getAllCFacturesByDataRev());
        return "facture/list-data-rev";
    }

    @GetMapping(value = "/list-name")
    public String getAllFacturesByName(Model model) {
        model.addAttribute("factures", factureXmlService.getAllFacturesByName());
        return "/facture/list-name";
    }

    @GetMapping(value = "/list-reverse")
    public String getAllFacturesByNameReverse(Model model) {
        model.addAttribute("factures", factureXmlService.getAllFacturesByNameReverse());
        return "/facture/list-reversed";
    }
}
