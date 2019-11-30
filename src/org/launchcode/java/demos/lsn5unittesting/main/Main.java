package org.launchcode.java.demos.lsn5unittesting.main;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Prius", 100, 50);
        car.addGas(5);
        System.out.println(car.getMake() + " - " + car.getModel());
    }
}
