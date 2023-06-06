package org.example;


public class App {

    public static void main(String[] args) {
        exercise00_objectComposition();

        example01_MethodInvocationByValue();
        example02_MethodInvocationByReference();
        example03_UtilClassesCanNotCreateInstance();
        example04_getInstanceStaticMethod();
    }

    public static void exercise00_objectComposition() {
        Car dieselCar = new Car("Octavia", "Škoda", 2023,
                new CarEngine(CarEngine.EngineType.DIESEL, 1.9F,  4));
        dieselCar.setColor("black");
        System.out.println(dieselCar);

        Car gasCar = new Car("Avant", "Audi", 2020,
                new CarEngine(CarEngine.EngineType.GASOLINE, 2.9F,  6));
        gasCar.setColor("gray");

        System.out.println(gasCar);
    }

    private static void example01_MethodInvocationByValue() {
        Car car = new Car("Octavia", "Škoda", 2023,
                new CarEngine(CarEngine.EngineType.DIESEL, 1.9F,  4));
        car.setColor("black");

        int kilometers = 5;
        car.drive(kilometers);
        car.drive(kilometers);
        car.drive(kilometers);

        System.out.println(car);
        System.out.println("local variable 'kilometers': " + kilometers);
    }

    private static void example02_MethodInvocationByReference() {
        Car dieselCar = new Car("Octavia", "Škoda", 2023,
                new CarEngine(CarEngine.EngineType.DIESEL, 1.9F,  4));
        System.out.println(dieselCar);

        HighwayUtil.driveFiveKilometers(dieselCar);
        HighwayUtil.driveFiveKilometers(dieselCar);
        HighwayUtil.driveTenKilometers(dieselCar);

        System.out.println(dieselCar);
    }

    private static void example03_UtilClassesCanNotCreateInstance() {
//        new HighwayUtil();
//        Java Example: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
        System.out.println(Math.abs(-2));
        System.out.println(Math.max(-2, 1));
        System.out.println(Math.min(-2, 1));
        System.out.println(Math.random());
    }

    private static void example04_getInstanceStaticMethod() {
        Car dieselCar = new Car("Octavia", "Škoda", 2023,
                new CarEngine(CarEngine.EngineType.DIESEL, 1.9F,  4));
        System.out.println(dieselCar);

        Car dieselCar2 = new Car("Octavia", "Škoda", 2023,
                CarEngine.newDieselCar(1.9F, 4));
        System.out.println(dieselCar2);
    }

}
