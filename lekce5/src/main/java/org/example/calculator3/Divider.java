package org.example.calculator3;

public class Divider {
    public double divide(int dividend, int divisor) {
        double result = Double.POSITIVE_INFINITY;
        try {
            result = dividend / divisor;
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Finished successfully inside Divider");
        return result;
    }
}
