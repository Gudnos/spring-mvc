package service;

import model.Car;

import java.util.List;

public interface ServiceCar {

    List<Car> findCars(List<Car> list, int count);
}
