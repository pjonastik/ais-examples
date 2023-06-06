package org.example;

import java.util.Objects;

public class CarEngine {
    private final EngineType type;
    private final float volume;
    private final int cylinderCount;


    public CarEngine(float volume, int cylinderCount) {
        type = EngineType.DIESEL;
        this.volume = volume;
        this.cylinderCount = cylinderCount;
    }

    enum EngineType {
        DIESEL, GASOLINE
    }

    public EngineType getType() {
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