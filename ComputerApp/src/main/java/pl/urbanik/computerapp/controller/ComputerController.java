package pl.urbanik.computerapp.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.urbanik.computerapp.services.ComputerService;

@Controller
@AllArgsConstructor
@RequestMapping("/computer")
public class ComputerController {

//    private final ComputerService computerService;



//    @RequestMapping(value = "/del/{id}", method = RequestMethod.GET)
//    public String delMsg(Model model, @PathVariable Long id) {
//        model.addAttribute("paints", paintService.getPaint(id));
//        return "paint/del";
//    }
//
//    @RequestMapping(value = "/del", method = RequestMethod.GET)
//    public String delete(@RequestParam Long id) {
//        paintService.deletePaint(id);
//        return "redirect:/paint/list";
//    }
//
//    @RequestMapping(value = "/edit", method = RequestMethod.GET)
//    public String edit(Model model, @RequestParam Long id) {
//        model.addAttribute("paints", paintService.getPaint(id));
//        model.addAttribute("paintsType", paintsTypeService.listAllPaintsType());
//        model.addAttribute("destination", destinationService.findAllDestinations());
//        return "/paint/edit";
//    }
//
//    @RequestMapping(value = "/edit", method = RequestMethod.POST)
//    public String editPaint(@Valid Paints paints, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            model.addAttribute("paintsType", paintsTypeService.listAllPaintsType());
//            model.addAttribute("destination", destinationService.findAllDestinations());
//            return "paint/edit";
//        }
//        paintService.savePaint(paints);
//        return "redirect:/paint/list";
//    }
//
//    @RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
//    public String show(Model model, @PathVariable Long id) {
//        model.addAttribute("paints", paintService.getPaint(id));
//        return "paint/show";
//    }
//
//    @RequestMapping(value = "/income", method = RequestMethod.GET)
//    public String income(Model model, @RequestParam Long id) {
//        model.addAttribute("paints", paintService.getPaint(id));
//        model.addAttribute("paintsType", paintsTypeService.listAllPaintsType());
//        model.addAttribute("destination", destinationService.findAllDestinations());
//        return "/paint/income";
//    }
//
//    @RequestMapping(value = "/income", method = RequestMethod.POST)
//    public String income(@Valid Paints paints, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            model.addAttribute("paintsType", paintsTypeService.listAllPaintsType());
//            model.addAttribute("destination", destinationService.findAllDestinations());
//            return "paint/income";
//        }
//        paintService.paintIncome(paints);
//        return "redirect:/paint/list";
//    }
//
//    @RequestMapping(value = "/release", method = RequestMethod.GET)
//    public String release(Model model, @RequestParam Long id) {
//        model.addAttribute("project", projectsService.listAllProjects());
//        model.addAttribute("paints", paintService.getPaint(id));
//        model.addAttribute("paintsType", paintsTypeService.listAllPaintsType());
//        model.addAttribute("wzpaints", new WzPaint());
//        return "/paint/release";
//    }
//
//    @RequestMapping(value = "/release", method = RequestMethod.POST)
//    public String release(@Valid WzPaint wzPaint, BindingResult result, Model model, @RequestParam Long id) {
//        if (result.hasErrors()) {
//            model.addAttribute("project", projectsService.listAllProjects());
//            model.addAttribute("paints", paintService.getPaint(id));
//            return "paint/release";
//        }
//        paintService.paintRelease(wzPaint, id);
//        return "redirect:/paint/list";
//    }
//
//    @RequestMapping(value = "/search", method = RequestMethod.POST)
//    public String search(@RequestParam String id, Model model) {
//        try {
//            model.addAttribute("paints", paintService.searchPaints(id));
//            return "paint/list";
//        } catch (StringIndexOutOfBoundsException e) {
//            return "redirect:/paint/list";
//        }
//    }
}