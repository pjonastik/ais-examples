package org.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.example.CarEngineMatcher.carEngineMatcher;

class CarTest {

    @Test
    void createCar() {
        float consumptionSize = 6.5f;
        int cylinderCount = 6;
        float volume = 2.9F;
        int tankSize = 40;

        CarEngine dieselEngine = new CarEngine(EngineType.DIESEL, volume, cylinderCount);
        Car car = new Car("Octavia", "Škoda", 2023, dieselEngine, tankSize, consumptionSize);
        car.setColor("black");

        assertThat(dieselEngine, is(carEngineMatcher(EngineType.DIESEL, volume, cylinderCount)));
        assertThat(car.getBrand(), is("Škoda"));
        assertThat(car.getModel(), is("Octavia"));
        assertThat(car.getYear(), is(2023));
        assertThat(car.getTankSize(), is(tankSize));
        assertThat(car.getConsumptionSize(), is(consumptionSize));

        CarEngine carEngine = car.getCarEngine();
        assertThat(carEngine.getType(), is(EngineType.DIESEL));
        assertThat(carEngine.getVolume(), is(volume));
        assertThat(carEngine.getCylinderCount(), is(cylinderCount));
    }

    @Test
    void mileageCalculation() {
        CarEngine dieselEngine = new CarEngine(EngineType.DIESEL,2.9F,  6);
        Car car = new Car("Octavia", "Škoda", 2023, dieselEngine, 0, 0.0f);
        car.drive(2.2F);
        car.drive(2.8F);

        assertThat(car.getMileage(), is(5d));
    }

    @Test
    void fillCarTank() {
        CarEngine dieselEngine = new CarEngine(EngineType.DIESEL, 2.9F, 6);
        Car car = new Car("Octavia", "Škoda", 2023, dieselEngine, 40, 6.5f);

        car.tank(EngineType.DIESEL, 20f); //TODO refactor engine type to be more generic

        assertThat(car.getActualTankCapacity(), is(20f));
    }

    // TODO I cannot fill more than totalCapacity
    // TODO drive method should should decrese actualTankCapaacity acording to consumptionSize
    // TODO drive should throw exception if drive method is invoked but we don't have enough gas in tank

    //TODO implement method percentageOfTank (e.g. if my getActualTankCapacity is 20 and tankSize is 40 then is should
    //     return 50%

    //TODO task:
    // implement warning feature for user that after x-kilometers new method called 'Car.shouldGoToService()'
    // and 'service()' which reset the kilometer counter

}