package org.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CarEngineTest {

    @Test
    public void createDieselCarEngine() {
        CarEngine carEngine = CarEngine.newDieselCar(3f, 6);

        assertThat(carEngine.getType(), equalTo(CarEngine.EngineType.DIESEL));
        assertThat(carEngine.getVolume(), equalTo(3F));
        assertThat(carEngine.getCylinderCount(), equalTo(6));
    }

    @Test
    public void createGasolineCarEngine() {
        CarEngine carEngine = CarEngine.newGasolineCar(2f, 4);

        assertThat(carEngine.getType(), equalTo(CarEngine.EngineType.GASOLINE));
        assertThat(carEngine.getVolume(), equalTo(2F));
        assertThat(carEngine.getCylinderCount(), equalTo(4));
    }
}
