package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;

class Circle {

    static Double getArea(Double radius) {
        if (radius < 0 ) {
            System.err.println("Error 999! Negative Number Entered.");
        }
        return 3.14 * radius * radius;
    }
}

/*
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



 while (students <= 0) {

         try {
            System.out.print("Enter the number of students: ");

            students = input1.nextInt();

         }

         catch (InputMismatchException e) {
             input1.nextLine();
         }
     }
 */
//System.err.println("The bicycle has already stopped!");

//    public static String getMessage(String lang) {
//
//        if (lang.equals("sp")) {
//            return "¡Hola, Mundo!";
//        } else if (lang.equals("fr")) {
//            return "Bonjour, le monde!";
//        } else if (lang.equals("it")) {
//            return "Ciao, Mundi!";
//        } else {
//            return "Hello, World!";
//        }
//    }