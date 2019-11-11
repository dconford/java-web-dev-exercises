package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    //public static final double PIE = 3.14;
    public static void main(String[] args) {
        //public static final float PIE = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius of the circle to calculate:");
        double circleRadius = input.nextDouble();
        input.close();

        double areaOfCircle = Circle.getArea(circleRadius);
        //String message = Message.getMessage("");
        //System.out.println(message);
        //double areaOfCircle = PIE * (circleRadius * circleRadius);
        System.out.println("The Area of a Circle with Radius " + circleRadius + " is " + areaOfCircle);
    }
}
