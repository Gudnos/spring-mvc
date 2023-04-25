package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceCarImpl implements ServiceCar{
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1, "White", "BMW"));
        cars.add(new Car(2, "Black", "Audi"));
        cars.add(new Car(3, "Grey", "Ford"));
        cars.add(new Car(4, "Red", "Nissan"));
        cars.add(new Car(5, "Green", "Toyota"));
    }

    @Override
    public List<Car> findCars(int number) {
        if (number <= 0 || number > 5) return cars;
        return cars.stream().limit(number).collect(Collectors.toList());
    }
}
