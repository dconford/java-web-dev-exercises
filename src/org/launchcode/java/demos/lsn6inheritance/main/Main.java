package org.launchcode.java.demos.lsn6inheritance.main;

import org.launchcode.java.demos.lsn6inheritance.main.Cat;
import org.launchcode.java.demos.lsn6inheritance.main.HouseCat;

public class Main {
    public static void main(String[] args) {

        HouseCat joe = new HouseCat("Joe Spizz");
        System.out.println(joe.noise());
        System.out.println(joe.getWeight());
        Cat leo = new Cat(165);
        System.out.println(leo.noise());
        System.out.println("isHungry " + leo.isHungry());
        System.out.println("isTired " + leo.isTired());
        leo.eat();
        System.out.println("isHungry " + leo.isHungry());
        System.out.println("isTired " + leo.isTired());
        leo.eat();
        System.out.println("isHungry " + leo.isHungry());
        System.out.println("isTired " + leo.isTired());
        leo.eat();

        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.noise());
        System.out.println("isTired " + garfield.isTired());
        System.out.println("isHungry " + garfield.isHungry());
        garfield.eat();
        System.out.println(garfield.noise());
        System.out.println("isTired " + garfield.isTired());
        System.out.println("isHungry " + garfield.isHungry());
        garfield.eat();
        System.out.println(garfield.noise());
        System.out.println("isTired " + garfield.isTired());
        System.out.println("isHungry " + garfield.isHungry());
    }
}
