package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.example.CarEngineMatcher.carEngineMatcher;
import static org.hamcrest.Matchers.*;

class CarTest {

    @Test
    void createCar() {
        float consumptionSize = 6.5f;
        int cylinderCount = 6;
        float volume = 2.9F;
        int tankSize = 40;

        CarEngine dieselEngine = new CarEngine(FuelType.DIESEL, volume, cylinderCount);
        Car car = new Car("Octavia", "Škoda", 2023, dieselEngine, tankSize, consumptionSize);
        car.setColor("black");

        assertThat(dieselEngine, is(carEngineMatcher(FuelType.DIESEL, volume, cylinderCount)));
        assertThat(car.getBrand(), is("Škoda"));
        assertThat(car.getModel(), is("Octavia"));
        assertThat(car.getYear(), is(2023));
        assertThat(car.getTankCapacity(), is(tankSize));
        assertThat(car.getConsumptionSize(), is(consumptionSize));

        CarEngine carEngine = car.getCarEngine();
        assertThat(carEngine.getType(), is(FuelType.DIESEL));
        assertThat(carEngine.getVolume(), is(volume));
        assertThat(carEngine.getCylinderCount(), is(cylinderCount));
    }

    @Test
    void driveShouldAddDrivenKilometersToMileage() {
        CarEngine dieselEngine = new CarEngine(FuelType.DIESEL,2.9F,  6);
        Car car = new Car("Octavia", "Škoda", 2023, dieselEngine, 0, 0.0f);
        car.drive(2.2F);
        car.drive(2.8F);

        assertThat(car.getMileage(), is(5d));
    }

    @Test
    void driveShouldDecreaseFuelAccordingToConsumption() {
        CarEngine dieselEngine = new CarEngine(FuelType.DIESEL,2.9F,  6);
        Car car = new Car("Octavia", "Škoda", 2023, dieselEngine, 40, 5.0f);
        car.refuel(FuelType.DIESEL, 40);

        car.drive(100f);
        assertThat(car.getActualTankCapacity(), is(35f));

        car.drive(100);
        assertThat(car.getActualTankCapacity(), is(30f));

        car.drive((short)100);
        assertThat(car.getActualTankCapacity(), is(25f));

        car.drive((byte)100);
        assertThat(car.getActualTankCapacity(), is(20f));
    }

    @Test
    void driveIsAvailableOnlyWhenCarHasEnoughFuel() {
        CarEngine dieselEngine = new CarEngine(FuelType.DIESEL, 2.9F, 6);
        Car car = new Car("Octavia", "Škoda", 2023, dieselEngine, 40, 6.0f);
        car.refuel(FuelType.DIESEL, 5);

        NotEnoughFuelException thrown = Assertions.assertThrows(NotEnoughFuelException.class, () -> {
            car.drive(100);
        });

        assertThat(thrown.getMessage(), containsString("Not enough fuel"));
        assertThat(thrown.getMessage(), containsString("[5.0/40]"));
        assertThat(thrown.getMessage(), containsString("liters"));
        assertThat(thrown.getMessage(), containsString("in tank to drive"));
        assertThat(thrown.getMessage(), containsString("100"));
        assertThat(thrown.getMessage(), containsString("kilometers"));
        assertThat(thrown.getMessage(), containsString("Missing"));
        assertThat(thrown.getMessage(), containsString("1.00"));
    }

    @Test
    void refuelCarTank() {
        CarEngine dieselEngine = new CarEngine(FuelType.DIESEL, 2.9F, 6);
        Car car = new Car("Octavia", "Škoda", 2023, dieselEngine, 40, 6.5f);

        car.refuel(FuelType.DIESEL, 20f);
        car.refuel(FuelType.DIESEL, 20f);

        assertThat(car.getActualTankCapacity(), is(40f));
    }

    @Test
    void refuelShouldBeCapped() {
        CarEngine dieselEngine = new CarEngine(FuelType.DIESEL, 2.9F, 6);
        Car car = new Car("Octavia", "Škoda", 2023, dieselEngine, 40, 6.5f);

        TankOverflowException thrown = Assertions.assertThrows(TankOverflowException.class, () -> {
            car.refuel(FuelType.DIESEL, 41f);
        });

        assertThat(thrown.getMessage(), containsString("Tank capacity overflow"));
        assertThat(thrown.getMessage(), containsString("The tank capacity is"));
        assertThat(thrown.getMessage(), containsString("1.0"));
        assertThat(thrown.getMessage(), containsString("40"));
    }

    //TODO implement method percentageOfTank (e.g. if my getActualTankCapacity is 20 and tankSize is 40 then is should
    //     return 50%

    //TODO task:
    // implement warning feature for user that after x-kilometers (Car.drive method), new method called 'Car.shouldGoToService()' should return true, otherwise false
    // and 'service()' method which resets (new) service counter
}