package com.example.demo_rest_api.repository;

import com.example.demo_rest_api.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
