package org.example.calculator2;

import org.example.calculator.Divider;

public class Calculator {
    private Divider divider;

    public Calculator(Divider divider) {
        this.divider = divider;
    }

    public double divide(int divident, int divisor) {
        try {
            divider.divide(divident, divisor);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Finished successfully inside Calculator");
        return Double.POSITIVE_INFINITY;
    }
}
