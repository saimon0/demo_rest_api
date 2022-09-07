package com.example.demo_rest_api.controller;
import com.example.demo_rest_api.model.Car;
import com.example.demo_rest_api.service.CarManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/cars")
public class ApiController {

    private final CarManager carManager;

    ApiController(CarManager carManager) {
        this.carManager = carManager;
    }
    @RequestMapping("")
    public String getCars() {
        return "all cars returned";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Car getCars(@PathVariable("id") Integer id) {
        return "car with id: " + id + " returned or http 404";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void createCar(@RequestBody Car car) {
        carManager.addCar(car);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteCar(@PathVariable("id") Integer id) {
        return "car with id: " + id + " will be deleted and will return 204 or 404 if car doesnt exists";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String putCar(@PathVariable("id") Integer id) {
        return "car with rendered id will be created and will return 201 or some http code if car payload will be incorrect";
    }

        @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public String patchCar(@PathVariable("id") Integer id) {
        return "car with rendered id will be created and will return 201 or some http code if car payload will be incorrect";
    }

}
