package org.example;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public final class CarEngineMatcher extends TypeSafeMatcher<CarEngine> {
    private final EngineType type;
    private final double volume;
    private final int cylinderCount;

    public CarEngineMatcher(EngineType type, double volume, int cylinderCount) {
        this.type = type;
        this.volume = volume;
        this.cylinderCount = cylinderCount;
    }

    public static Matcher<CarEngine> carEngineMatcher(EngineType type, double volume, int cylinderCount) {
        return new CarEngineMatcher(type, volume, cylinderCount);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("not a valid engine");
    }

    @Override
    protected boolean matchesSafely(CarEngine carEngine) {
        if (type != carEngine.getType()) {
            return false;
        }

        if (cylinderCount != carEngine.getCylinderCount()) {
            return false;
        }

        if (volume != carEngine.getVolume()) {
            return false;
        }

        return true;
    }


}
