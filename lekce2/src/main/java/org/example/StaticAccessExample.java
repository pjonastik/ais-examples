package org.example;

public class StaticAccessExample {
    private static int classVariable;
    private int instanceVariable;

    public static void staticMethod() {
        System.out.println("StaticAccessExample.staticMethod");
    }

    public static void staticMethod2() {
        System.out.println("StaticAccessExample.staticMethod2");
        staticMethod(); //static method invocation is OK in static method

        classVariable++; //static variable can be accessed
//        int i = instanceVariable; //instance variable CANNOT be accessed
        int i2 = new StaticAccessExample().getInstanceVariable(); //we need to have object and getter to access this!
    }


    public int calculateSomething() {
        staticMethod(); //static methods are accessible from instance method

        return instanceVariable + //instance variable can be accessed from instance method
                classVariable;    //class variable can be accessed from instance method
    }


    public int getInstanceVariable() {
        return instanceVariable;
    }
}
