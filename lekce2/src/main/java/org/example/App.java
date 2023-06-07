package org.example;


public class App {

    public static void main(String[] args) {
//        exercise00_objectComposition();
//        exercise01_newGasolineCar();
//        exercise02_overridingMethod();
//
//        example01_MethodInvocationByValue();
//        example02_MethodInvocationByReference();
//        example03_UtilClassesCanNotCreateInstance();
//        example04_getInstanceStaticMethod();
//        example05_inheritance();
        example06_equalsAndHashCode();
    }

    private static void example06_equalsAndHashCode() {
        Car dieselCar = new Car("Octavia", "Škoda", 2023,
                new CarEngine(CarEngine.EngineType.GASOLINE, 1.9F,  4));

        Car dieselCar2 = new Car("Octavia", "Škoda", 2023,
                new CarEngine(CarEngine.EngineType.GASOLINE, 1.9F,  4));

        Car dieselCar3 = new Car("Octavia", "Škoda", 2023,
                new CarEngine(CarEngine.EngineType.DIESEL, 1.9F,  4));

        System.out.println(dieselCar.equals(dieselCar2));
        System.out.println(dieselCar.equals(dieselCar3));
    }

    private static void example05_inheritance() {
        Child car = new Child();
        System.out.println(car);
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


    private static void exercise01_newGasolineCar() {
        Car dieselCar = new Car("Octavia", "Škoda", 2023,
                new CarEngine(CarEngine.EngineType.GASOLINE, 1.9F,  4));
        System.out.println(dieselCar);

        Car dieselCar2 = new Car("Octavia", "Škoda", 2023,
                CarEngine.newCasolineCar(1.9F, 4));
        System.out.println(dieselCar2);

        //https://www.selenium.dev/documentation/webdriver/getting_started/first_script/
        //https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/By.ById.html
    }

    private static void exercise02_overridingMethod() {
        Car dieselCar = new Car("Octavia", "Škoda", 2023,
                new CarEngine(CarEngine.EngineType.DIESEL, 1.9F,  4));
        System.out.println(dieselCar);

        dieselCar.drive((byte)1);
        dieselCar.drive((short)1);
        dieselCar.drive(1);
        dieselCar.drive(1L);
        dieselCar.drive(1F);
        dieselCar.drive(1D);

        System.out.println(dieselCar);
        //primitive data types: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        //Java overloading in action: https://docs.oracle.com/javase/8/docs/api/java/util/List.html
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
