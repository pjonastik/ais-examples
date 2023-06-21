package org.example.calculator4;

public class Calculator {
    private Divider divider;

    public Calculator(Divider divider) {
        this.divider = divider;
    }

    public double divide(int divident, int divisor) {
        // do not handle exception throw it to client
        return divider.divide(divident, divisor);
    }
}
