package com.example.demo_rest_api.repository;

import com.example.demo_rest_api.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class CarRepository {
    private ArrayList<Car> cars;

    public CarRepository() {
        this.cars = new ArrayList<>();
    }

    public void persistCar(Car car) {

    }
}
