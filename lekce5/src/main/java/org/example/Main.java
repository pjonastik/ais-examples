package org.example;


import org.example.calculator.Calculator;
import org.example.calculator.Divider;
import org.example.tasks.NumberReader;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
//        exampleO1_divisionByZero_RuntimeException();
//        example02_CatchExceptionAndLogIt();
//        example03_FinallyInTry();
//        example04_catchingInCalculator();
//        example05_catchingInDivider();
//        example06_propagatingException();

        task01_FixNumberReader();
    }

    private static void task01_FixNumberReader() {
        NumberReader.readInt("Write integer: ");
    }

    private static void example06_propagatingException() {
        org.example.calculator4.Divider divider = new org.example.calculator4.Divider();
        org.example.calculator4.Calculator cal = new org.example.calculator4.Calculator(divider);

        Random random = new Random(); //simulate user inputs

        for (int i = 0; i < 10; i++) {
            int input = random.nextInt(6); // number from 0 to 5
            try {
                double result = cal.divide(5, input);
                System.out.printf("%d run: 5/%d = %g\n", i, input, result);
            } catch (IllegalArgumentException ex) {
              System.out.printf("%d run: You cannot provide zero as divisor \n", i);
            }
        }

    }

    private static void example05_catchingInDivider() {
        org.example.calculator3.Divider divider = new org.example.calculator3.Divider();
        org.example.calculator3.Calculator calculator = new org.example.calculator3.Calculator(divider);
        calculator.divide(1, 0);
    }

    private static void example04_catchingInCalculator() {
        Divider divider = new Divider();
        org.example.calculator2.Calculator calculator = new org.example.calculator2.Calculator(divider);
        calculator.divide(1, 0);
    }

    private static void example03_FinallyInTry() {
        try {
            Divider divider = new Divider();
            Calculator calculator = new Calculator(divider);
            calculator.divide(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            //do some cleanup if necessary (close open files, etc.)
            System.out.println("Finished successfully");
        }

    }

    private static void example02_CatchExceptionAndLogIt() {
        try {
            Divider divider = new Divider();
            Calculator calculator = new Calculator(divider);
            calculator.divide(1, 0);
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Finished successfully");
    }

    /**
     * https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
     */
    private static void exampleO1_divisionByZero_RuntimeException() {
        Divider divider = new Divider();
        Calculator calculator = new Calculator(divider);

        double result = calculator.divide(5, 5);
        System.out.printf("%d/%d =: %g\n", 5 ,5, result);

        result = calculator.divide(5, 0);
        System.out.printf("%d/%d =: %g\n", 5 ,0, result);

        System.out.println("Finished successfully");
    }
}
