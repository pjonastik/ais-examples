package org.example.calculator4;

public class Divider {
    public double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("You cannot divide by zero! Divisor is " + divisor);
        }
        return dividend / (double) divisor;
    }
}
