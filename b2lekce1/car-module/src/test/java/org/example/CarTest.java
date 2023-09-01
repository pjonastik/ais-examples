package org.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class CarTest {

    @Test
    void createCar() {
        CarEngine dieselEngine = new CarEngine(CarEngine.EngineType.DIESEL,2.9F,  6);
        Car car = new Car("Octavia", "Škoda", 2023, dieselEngine);
        car.setColor("black");

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

        assertThat(car.getMileage(), is(5F));
    }
}