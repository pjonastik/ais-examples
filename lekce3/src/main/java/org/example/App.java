package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        floatVsDouble();
    }

    private static void floatVsDouble() {
        //smaller data type to bigger data type
        int length = 5;
        double lengthDecimal = length; //auto conversion
        double width = 10;            //auto conversion

        //bigger data time to smaller data type
        double double2 = 5.3D;
        int length2 = (int) double2; // explicit conversion (.3 removed)
        System.out.println("length2 : " + length2);

        FloatNumber floatNumber = new FloatNumber(1.0F);

//        floatNumber.setNumber(2.0D); //won't compile
        floatNumber.setNumber((float) 2.0D); //explicit conversion
    }
}
