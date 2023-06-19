package org.main;

//example 01:
//import org.example.*; //it does not work (packages are not hierarchical)
import org.example.access.a.ApparentHierarchy;

//example 02:

import org.example.access.b.InterfaceA;

//example 03:
import org.example.car.Car;
import org.example.car.CarEngine;
import static org.example.car.CarEngine.EngineType.DIESEL;
import static org.example.car.CarEngine.newDieselCar;
import static org.example.car.CarEngine.newGasolineCar;

public class Main {

    public static void main(String[] args) {
        //example 00,s see ClassInUnnamedPacakage
        example01_apparentHierarchy();
        example02_theSameTypeName();
        example03_staticImport();

        //look at org.example.access.c.Example and
        //        org.example.access.d.InWorldUse and
        //        org.example.access.d.PublicClassAChild


    }

    /**
     * Need to frequent access to static final fields (constants) and static methods from one or two classes
     */
    private static void example03_staticImport() {
//        import org.example.car.Car;
//        import org.example.car.CarEngine;

//        Car dieselCar = new Car("Octavia", "Škoda", 2023,
//                new CarEngine(CarEngine.EngineType.GASOLINE, 1.9F,  4));

//        ---------------------------------------------------------------------
//        import org.example.car.Car;
//        import org.example.car.CarEngine;
//        import org.example.car.CarEngine.EngineType;

//        Car dieselCar = new Car("Octavia", "Škoda", 2023,
//                new CarEngine(EngineType.DIESEL, 1.9F,  4));

//        ---------------------------------------------------------------------
//  import org.example.car.Car;
//  import org.example.car.CarEngine;
//  import static org.example.car.CarEngine.EngineType.DIESEL;
//  import static org.example.car.CarEngine.newDieselCar;
//  import static org.example.car.CarEngine.newGasolineCar;

        Car dieselCar = new Car("Octavia", "Škoda", 2023,
                new CarEngine(DIESEL, 1.9F,  4));

        Car gasolineCar = new Car("Octavia", "Škoda", 2023,
                newGasolineCar(1.9F, 4));

        Car dieselCar2 = new Car("Octavia", "Škoda", 2023,
                newDieselCar(1.9F, 4));

        //Note: Use static import very sparingly. Overusing static import can result in code
        //      that is difficult to read and maintain, because readers of the code won't know
        //      which class defines a particular static object. Used properly, static import
        //      makes code more readable by removing class name repetition.
    }

    private static void example02_theSameTypeName() {
        InterfaceA a; //org.example.engeto.InterfaceA;
        org.example.access.a.InterfaceA a2;
    }

    private static void example01_apparentHierarchy() {
        new ApparentHierarchy();
    }
}
