package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ServiceCar;
import service.ServiceCarImpl;

@Controller
public class CarController {

    private ServiceCar sc = new ServiceCarImpl();

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", sc.findCars(count));
        return "cars";
    }

}
