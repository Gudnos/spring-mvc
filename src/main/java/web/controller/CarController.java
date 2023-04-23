package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ServiceCar;
import service.ServiceCarImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        ServiceCar sc = new ServiceCarImpl();
        cars.add(new Car(1, "White", "BMW"));
        cars.add(new Car(2, "Black", "Audi"));
        cars.add(new Car(3, "Grey", "Ford"));
        cars.add(new Car(4, "Red", "Nissan"));
        cars.add(new Car(5, "Green", "Toyota"));
        cars = sc.findCars(cars, count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
