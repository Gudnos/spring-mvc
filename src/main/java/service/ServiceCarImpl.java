package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceCarImpl implements ServiceCar{

    @Override
    public List<Car> findCars(int number) {
        List<Car> list = new ArrayList<>();
        list.add(new Car(1, "White", "BMW"));
        list.add(new Car(2, "Black", "Audi"));
        list.add(new Car(3, "Grey", "Ford"));
        list.add(new Car(4, "Red", "Nissan"));
        list.add(new Car(5, "Green", "Toyota"));
        if (number <= 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }
}
