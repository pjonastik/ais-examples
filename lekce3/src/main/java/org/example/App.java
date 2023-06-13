package org.example;

import org.example.color.ShapeColor;
import org.example.inheritance.Circle;
import org.example.inheritance.Rectangle;
import org.example.inheritance.Shape;
import org.example.interfaces.IShape;
import org.example.interfaces.MyCircle;
import org.example.interfaces.MyRectangle;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        floatVsDouble();
//        equalsExample();
//        inheritance_shapeExample();
//        polymorphismInPractise();
        interfaceExample();
    }

    private static void interfaceExample() {
        List<IShape> shapes = new ArrayList<>();
        shapes.add(new MyRectangle(ShapeColor.GREEN));
        shapes.add(new MyCircle(ShapeColor.BLUE));

        for (IShape shape : shapes) {
            shape.draw();
        }

    }

    private static void polymorphismInPractise() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(ShapeColor.RED));
        shapes.add(new Rectangle(ShapeColor.BLUE));
//        shapes.add(new Shape(ShapeColor.GREEN));

        for (Shape shape : shapes) {
            shape.draw();
        }

        List<Circle> shapes2 = new ArrayList<>();
//        shapes2.add(new Rectangle(ShapeColor.RED)); you cannot assign Rectangle into Circle
    }

    private static void inheritance_shapeExample() {
//        Shape shape = new Shape(ShapeColor.BLUE);
//        shape.draw();

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
