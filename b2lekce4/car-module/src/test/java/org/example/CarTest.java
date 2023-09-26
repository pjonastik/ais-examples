package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.example.CarEngineMatcher.carEngineMatcher;

class CarTest {

    @Test
    void createCar() {
        //TODO 1) extend this with tank size [liters]
        //TODO 2) extend this with consumption size [liters]
        CarEngine dieselEngine = new CarEngine(CarEngine.EngineType.DIESEL,2.9F,  6);
        Car car = new Car("Octavia", "Škoda", 2023, dieselEngine);
        car.setColor("black");

        assertThat(dieselEngine, is(carEngineMatcher(CarEngine.EngineType.DIESEL, 2.9F, 6)));
        assertThat(car.getBrand(), is("Škoda"));
        assertThat(car.getModel(), is("Octavia"));
        assertThat(car.getYear(), is(2023));


        CarEngine carEngine = car.getCarEngine();
        assertThat(carEngine.getType(), is(CarEngine.EngineType.DIESEL));
        assertThat(carEngine.getVolume(), is(2.9F));
        assertThat(carEngine.getCylinderCount(), is(6));
    }

    @Test
    void testMileageCalculation() {
        CarEngine dieselEngine = new CarEngine(CarEngine.EngineType.DIESEL,2.9F,  6);
        Car car = new Car("Octavia", "Škoda", 2023, dieselEngine);
        car.drive(2.2F);
        car.drive(2.8F);

        assertThat(car.getMileage(), is(5d));
    }

    //TODO list for me:
    // * add method fill the tank


    // * drive method should decrease gas in tank
    // *    drive throw exception if drive method is invoked but we don't have enough gas in tank

    //TODO for students:

    //implement method should percentageOfTank

    //TODO task:
    // implement warning feature for user that after x-kilometers new method called 'Car.shouldGoToService()'
    // and 'service()' which reset the kilometer counter

}