package org.example;

import org.example.color.ShapeColor;
import org.example.inheritance.Circle;
import org.example.inheritance.Rectangle;
import org.example.inheritance.Shape;


import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
//        floatVsDouble();
//        equalsExample();

        inheritance_shapeExample();
    }

    private static void inheritance_shapeExample() {
        Shape shape = new Shape(ShapeColor.BLUE);
        shape.draw();

        Circle circle = new Circle(ShapeColor.RED);
        circle.draw();

        Shape rectangle = new Rectangle(ShapeColor.GREEN); //notice that we assign Rectangle type to Shape type!
        rectangle.draw();
    }


    private static void equalsExample() {
        LightCar car = new LightCar("BMW");
        LightCar car2 = new LightCar("BMW");

        ArrayList<LightCar> list = new ArrayList<>();
        list.add(car);
        System.out.println("list.contains : " + list.contains(car2)); //comment out equals method and run to see difference
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
