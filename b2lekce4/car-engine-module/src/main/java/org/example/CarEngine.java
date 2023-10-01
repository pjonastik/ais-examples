package org.example;

import java.util.Objects;

public class CarEngine {
    private final FuelType type;
    private final float volume;
    private final int cylinderCount;


    public CarEngine(FuelType type, float volume, int cylinderCount) {
        this.type = type;
        this.volume = volume;
        this.cylinderCount = cylinderCount;
    }

    public static CarEngine newDieselCar(float volume, int cylinderCount) {
        return new CarEngine(FuelType.DIESEL, volume, cylinderCount);
    }

    public static CarEngine newGasolineCar(float volume, int cylinderCount) {
        return new CarEngine(FuelType.GASOLINE, volume, cylinderCount);
    }

    public FuelType getType() {
        return type;
    }

    public float getVolume() {
        return volume;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarEngine carEngine = (CarEngine) o;
        return Float.compare(carEngine.volume, volume) == 0 && cylinderCount == carEngine.cylinderCount && type == carEngine.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, volume, cylinderCount);
    }

    @Override
    public String toString() {
        return "CarEngine{" +
                "type=" + type +
                ", volume=" + volume +
                ", cylinderCount=" + cylinderCount +
                '}';
    }
}
