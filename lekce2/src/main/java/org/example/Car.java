package org.example;

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
//        kilometers = 2; //this declaration does not have any effect on variable out of scope
    }

    public void drive(short kilometers) {
        mileage += kilometers;
//        kilometers = 2; //this declaration does not have any effect on variable out of scope
    }

    public void drive(int kilometers) {
        mileage += kilometers;
//        kilometers = 2; //this declaration does not have any effect on variable out of scope
    }

    public void drive(float kilometers) {
        mileage += kilometers;
//        kilometers = 2; //this declaration does not have any effect on variable out of scope
    }

    public void drive(double kilometers) {
        mileage += kilometers;
    }

    public double getMileage() {
        return mileage;
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
