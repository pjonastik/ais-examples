package org.example.calculator;

public class Calculator {
    private Divider divider;

    public Calculator(Divider divider) {
        this.divider = divider;
    }

    public double divide(int divident, int divisor) {
        return divider.divide(divident, divisor);
    }
}
