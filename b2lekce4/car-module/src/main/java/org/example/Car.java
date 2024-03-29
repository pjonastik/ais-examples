package org.example;

import java.util.Objects;

public class Car {

    private final String model;
    private final String brand;
    private final int year;
    private final CarEngine carEngine;
    private final int tankCapacity;
    private final float consumptionSize;    //per 100 km
    private float mileage;
    private String color;
    private float actualTankCapacity;

    public Car(String model, String brand, int year, CarEngine carEngine, int tankCapacity, float consumptionSize) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.carEngine = carEngine;
        this.tankCapacity = tankCapacity;
        this.consumptionSize = consumptionSize;
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
        drive((float) kilometers);
    }

    public void drive(short kilometers) {
        drive((float) kilometers);
    }

    public void drive(int kilometers) {
        drive((float) kilometers);
    }

    public void drive(float kilometers) {
        float availableKilometers = (actualTankCapacity/consumptionSize)*100;
        if (availableKilometers < kilometers) {
            throw new NotEnoughFuelException(
                    String.format("Not enough fuel [%s/%s] liters in tank to drive '%s' kilometers. Missing '%.2f' liters.",
                            actualTankCapacity, tankCapacity, kilometers,
                            (kilometers-availableKilometers) * consumptionSize / 100));
        }
        mileage += kilometers;
        actualTankCapacity = actualTankCapacity - (kilometers * consumptionSize/100);
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

    public int getTankCapacity() {
        return tankCapacity;
    }

    public float getConsumptionSize() {
        return consumptionSize;
    }

    public float getActualTankCapacity() {
        return actualTankCapacity;
    }

    public void refuel(FuelType fuelType, float liters) {
        if ((actualTankCapacity + liters) > tankCapacity) {
            throw new TankOverflowException(
                    String.format("Tank capacity overflow ('%s' liters)! The tank capacity is '%d' liters.",
                            (Math.abs(tankCapacity - (actualTankCapacity + liters))) , tankCapacity));
        }
        actualTankCapacity += liters;
    }
}
