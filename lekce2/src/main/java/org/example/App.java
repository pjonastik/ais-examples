package org.example;


public class App {
    public static void main(String[] args) {
        exercise01_objectComposition();
    }

    public static void exercise01_objectComposition() {
        Car dieselCar = new Car("Octavia", "Škoda", 2023,
                new CarEngine(CarEngine.EngineType.DIESEL, 1.9F,  4));
        dieselCar.setColor("black");
        System.out.println(dieselCar);

        Car gasCar = new Car("Avant", "Audi", 2020,
                new CarEngine(CarEngine.EngineType.GASOLINE, 2.9F,  6));
        gasCar.setColor("gray");

        System.out.println(gasCar);
    }





}
