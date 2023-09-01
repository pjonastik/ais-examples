package org.example;


import org.example.calculator.Calculator;
import org.example.calculator.Divider;
import org.example.tasks.NumberReader;
import org.example.tasks.exception.HandleException;
import org.example.tasks.handler.Handler;
import org.example.tasks.handler.InnerHandler;
import org.example.tasks.handler.MidHandler;
import org.example.tasks.handler.OuterHandler;
import org.example.tasks.light.BuggyEvaluator;
import org.example.tasks.light.LightBulb;
import org.example.worker.AisWorker;
import org.example.worker.EngetoWorker;
import org.example.worker.Worker;
import org.example.worker.WorkerException;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    private static final Logger LOGGER = Logger.getLogger("Main");
    public static void main(String[] args) {
//        exampleO1_divisionByZero_RuntimeException();
//        example02_CatchExceptionAndLogIt();
//        example03_FinallyInTry();
//        example04_catchingInCalculator();
//        example05_catchingInDivider();
//        example06_propagatingException();


//        example08_checkedExceptions();
//        example09_checkedExceptionsAndInterfaces();
//        example10_eatException();



//        task01_FixNumberReader();
//        task02_exceptionChanning();
//        task03_modifyTask02();
        task04_refactorToUseFinally();
    }

    private static void task04_refactorToUseFinally() {
        LightBulb light = new LightBulb();
        BuggyEvaluator evaluator = new BuggyEvaluator();
        try {
            light.on();
            evaluator.buggyMethod();//code that can throw exception
        } catch (RuntimeException e) {
            LOGGER.log(Level.SEVERE, "There was an issue", e);
        } finally {
            light.off();
        }
    }



    private static void example10_eatException() {
        try{
            int a [] = new int[2];
            a[2] = -1;
        } catch (ArrayIndexOutOfBoundsException e) {
            //Program eats information about error and continue

            //NOTE: Do not do this throw it or log it like following:
            LOGGER.log(Level.INFO, "important message to log");
        }
    }


    private static void task01_FixNumberReader() {
        NumberReader.readInt("Write integer: ");
    }

    private static void task02_exceptionChanning() {
        Handler handler = new OuterHandler(
                                new MidHandler(
                                        new InnerHandler()
                                ));

        try {
            handler.handle();
        } catch (HandleException e) {
            e.printStackTrace();
        }
    }

    /**
     * Composition:
     *   Modify solved task2 so exceptions MidHandler delegates handle call to OutHandler and OuterHandler delegates call to InnerHandler
     */
    private static void task03_modifyTask02() {
        Handler handler = new OuterHandler(
                new MidHandler(
                        new InnerHandler()
                ));

        try {
            handler.handle();
        } catch (HandleException e) {
            e.printStackTrace();
        }
    }




    /**
     *  Comment out error handler -> to show that compiler screams
     */
    private static void example09_checkedExceptionsAndInterfaces() {
        //This part of code is usually in Main (object creation and initialization of program)
//        Worker worker = new AisWorker();
        Worker worker = new EngetoWorker();

        //###################################################################
        //this part is usually somewhere in some class which is part of program
        try {
            worker.work();
        } catch (WorkerException e) { //I have to catch it even it DOES NOT throw anything!
            throw new RuntimeException("Worker failed!", e); //exception channing!
        }
    }

    /**
     * Notice that I HAVE TO catch checked exception!
     */
    private static void example08_checkedExceptions() {
        AisWorker worker = new AisWorker();

        try {
            worker.work();
        } catch (WorkerException e) { //I have to catch it
            throw new RuntimeException("Worker failed!", e); //exception channing!
        }
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
