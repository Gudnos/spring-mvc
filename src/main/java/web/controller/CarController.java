package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ServiceCar;
import service.ServiceCarImpl;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        ServiceCar sc = new ServiceCarImpl();
        List<Car> cars = sc.findCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
