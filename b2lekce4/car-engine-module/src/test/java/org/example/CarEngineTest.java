package org.example;

import org.junit.jupiter.api.Test;

import static org.example.CarEngineMatcher.carEngineMatcher;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class CarEngineTest {

    @Test
    public void createDieselCarEngine() {
        CarEngine carEngine = CarEngine.newDieselCar(3f, 6);

        assertThat(carEngine, is(carEngineMatcher(FuelType.DIESEL, 3F, 6)));
    }

    @Test
    public void createGasolineCarEngine() {
        CarEngine carEngine = CarEngine.newGasolineCar(2f, 4);

        assertThat(carEngine.getType(), equalTo(FuelType.GASOLINE));
        assertThat(carEngine.getVolume(), equalTo(2F));
        assertThat(carEngine.getCylinderCount(), equalTo(4));
    }
}
