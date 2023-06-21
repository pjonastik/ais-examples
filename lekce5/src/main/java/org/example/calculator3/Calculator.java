package org.example.calculator3;

public class Calculator {
    private org.example.calculator3.Divider divider;

    public Calculator(Divider divider) {
        this.divider = divider;
    }

    public double divide(int dividend, int divisor) {
        return divider.divide(dividend, divisor);
    }
}
