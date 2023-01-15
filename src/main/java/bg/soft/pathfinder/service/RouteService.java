package bg.soft.pathfinder.service;

import bg.soft.pathfinder.model.Route;
import bg.soft.pathfinder.repository.RouteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {
    private RouteRepository routeRepository;

    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }


    public List<Route> getMostCommented() {
        return routeRepository.findMostCommented();
    }
}
