package bg.soft.pathfinder.web;

import bg.soft.pathfinder.model.Route;
import bg.soft.pathfinder.service.RouteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final RouteService routeService;

    public HomeController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Route> routes = routeService.getMostCommented();

        model.addAttribute("mostCommented", routes.get(0));

        return "index";
    }
}
