package org.example;

import java.util.Objects;

public class LightCar {
    private String brand;

    public LightCar(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightCar lightCar = (LightCar) o;
        return Objects.equals(brand, lightCar.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }
}
