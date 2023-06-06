package org.example;

public class App {

    public static void main(String[] args) {
        Car car = new Car("Ocatavia", "Škoda", 2023);
        car.setColor("black");
//        System.out.println("brand: " + car.getBrand());
//        System.out.println("model: " + car.getModel());
//        System.out.println("year: " + car.getYear());
//        System.out.println("color: " + car.getColor());
        System.out.println(car);

        Car car2 = new Car("Škoda", 2023);
        System.out.println(car2);

        System.out.println("Number of created cars: " + Car.getCounter());
    }


}
