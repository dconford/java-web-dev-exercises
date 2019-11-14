package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isInputGood = false;
        while (!isInputGood) {
            try {
                System.out.println("Enter the Radius of the circle to calculate:");
                double circleRadius = input.nextDouble();
                double areaOfCircle = Circle.getArea(circleRadius);
                if (areaOfCircle != 0.0) {
                    System.out.println("The Area of a Circle with Radius " + circleRadius + " is " + areaOfCircle);
                    isInputGood = true;
                } else {
                    System.out.println("Zero or Negative Value Entered. Please Enter a Positive Number.");
                }
            }
            catch (InputMismatchException e) {
                System.err.println("Error 997! Non-Numeric Entered.");
                input.next();
                System.out.println("Non-Numeric Value Entered. Please Enter a Positive Number.");
            }
        }
        input.close();
    }
}


/*
Scanner input = new Scanner(System.in);
    System.out.println("Enter Student ID:");

    String sID = null;
    if (input.hasNextInt()==false){
        System.out.println("Please re-check the student number inputted. Student number can only be digits.");
        throw new BadUserInputException("Student number can not contain non-digits.");
    }else if (input.next()==""){
        throw new BadUserInputException("Student number can not be empty");
    }


public class TakeInput {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean success = false;
        while (!success) {
            try {
                System.out.print("Enter an integer: ");
                int num = s.nextInt();
                System.out.println("You entered " + num);
                success = true;
            } catch (InputMismatchException e) {
                s.next();
                System.out.println("You have entered invalid data");
            }
        }
    }
}

 */