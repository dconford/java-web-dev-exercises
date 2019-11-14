package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isInputGood = false;
        String inputTest = "";
        while (!isInputGood) {
            try {
                System.out.println("Enter the Radius of the circle to calculate:");
                inputTest = input.nextLine();
                if (!inputTest.isBlank()) {
                    double circleRadius = Double.valueOf(inputTest);

                    //double circleRadius = input.nextDouble();
                    double areaOfCircle = Circle.getArea(circleRadius);
                    if (areaOfCircle != 0.0) {
                        System.out.println("The Area of a Circle with Radius " + circleRadius + " is " + areaOfCircle);
                        isInputGood = true;
                    } else {
                        System.out.println("Zero or Negative Value Entered. Please Enter a Positive Number.");
                    }
                } else {
                    System.out.println("Nothing was entered. Please Enter a Positive Number");
                }
            }

            catch (NumberFormatException e) {
                System.err.println("Error 997! Number Format Non-Numeric Entered.");
                System.out.println("Non-Numeric Value Entered. Please Enter a Positive Number.");
                //input.nextLine();
            }
        }
        input.close();
    }
}


/*
cheese = ""; // empty 'cheese' of prior input
cheese = in.nextLine(); //read in a line of input

//if user didn't enter anything (or just spacebar and return)
if(cheese.isEmpty()) {
System.out.println("Nothing was entered. Please try again");
}
//user entered something
else {
[enter code here checking validity of input]
}

I tried implementing this check for integer input and discovered it's better to accept String type input and convert it to int type with a wrapper class. If you have

int eger = 0; //initialize to zero

then you would put this code in the else statement above:

else{
eger = Integer.valueOf(cheese);
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