package org.example;


public class App {
    public static void main(String[] args) {
        exercise00_objectComposition();

        example01_MethodInvocationByValue();
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
}
