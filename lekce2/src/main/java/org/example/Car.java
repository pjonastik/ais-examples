package org.example;

public class Car {

    private static int counter;

    private String model;
    private String brand;
    private int year;
    private String color;
    private CarEngine carEngine;


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

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engine= '" + carEngine + '\'' +
                '}';
    }


    public static int getCounter() {
        return counter;
    }
}
