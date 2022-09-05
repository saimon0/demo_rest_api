package com.example.demo_rest_api.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Car {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "mark_id")
    private int markId;
    @Basic
    @Column(name = "model")
    private String model;
    @Basic
    @Column(name = "production_year")
    private int productionYear;
    @Basic
    @Column(name = "engine_id")
    private Integer engineId;
    @Basic
    @Column(name = "mileage")
    private Integer mileage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarkId() {
        return markId;
    }

    public void setMarkId(int markId) {
        this.markId = markId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Integer getEngineId() {
        return engineId;
    }

    public void setEngineId(Integer engineId) {
        this.engineId = engineId;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && markId == car.markId && productionYear == car.productionYear && Objects.equals(model, car.model) && Objects.equals(engineId, car.engineId) && Objects.equals(mileage, car.mileage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, markId, model, productionYear, engineId, mileage);
    }
}
