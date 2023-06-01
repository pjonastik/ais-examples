package org.example;

public class Car {
    private static final String ENGINE = "v2";

    private static int counter;

    private String model;
    private String brand;
    private int year;
    private String color;


    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        counter++;
    }

    public Car(String brand, int year) {
        this(null, brand, year);
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
                ", engine= '" + ENGINE + '\'' +
                '}';
    }


    public static int getCounter() {
        return counter;
    }
}
