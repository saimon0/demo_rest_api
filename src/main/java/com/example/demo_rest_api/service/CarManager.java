package com.example.demo_rest_api.service;

import com.example.demo_rest_api.model.Car;
import org.springframework.stereotype.Service;

@Service
public class CarManager {
    //private final CarRepository carRepository;

    CarManager() {
        //this.carRepository = carRepository;
    }

    public String addCar(Car car) {
        return "car with rendered id will be created and will return 201 or some http code if car payload will be incorrect";
    }
}
