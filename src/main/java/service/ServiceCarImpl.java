package service;

import model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class ServiceCarImpl implements ServiceCar{

    @Override
    public List<Car> findCars(List<Car> list, int number) {
        if (number == 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }
}
