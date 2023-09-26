package org.example;

import java.util.Objects;

public class Car {

    private static int counter;

    private String model;
    private String brand;
    private int year;
    private String color;
    private CarEngine carEngine;
    private double mileage;


    public Car(String model, String brand, int year, CarEngine carEngine) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.carEngine = carEngine;
        counter++;
    }

    public Car(String brand, int year, CarEngine engine) {
        this(null, brand, year, engine);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public CarEngine getCarEngine() {
        return carEngine;
    }

    public String getColor() {
        return color;
    }

    public void drive(byte kilometers) {
        mileage += kilometers;
    }

    public void drive(short kilometers) {
        mileage += kilometers;
    }

    public void drive(int kilometers) {
        mileage += kilometers;
    }

    public void drive(float kilometers) {
        mileage += kilometers;
    }

    public void drive(double kilometers) {
        mileage += kilometers;
    }

    public double getMileage() {
        return mileage;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Double.compare(car.mileage, mileage) == 0 && Objects.equals(model, car.model) && Objects.equals(brand, car.brand) && Objects.equals(color, car.color) && Objects.equals(carEngine, car.carEngine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, brand, year, color, carEngine, mileage);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", carEngine=" + carEngine +
                ", mileage=" + mileage +
                '}';
    }

    public static int getCounter() {
        return counter;
    }
}
