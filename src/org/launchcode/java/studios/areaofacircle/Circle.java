package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;

class Circle {

    static Double getArea(Double radius) {
        if (radius < 0) {
            System.err.println("Error 999! Negative Number Entered.");
            return 0.0;
        }  else {
            return 3.14 * radius * radius;
        }

    }
}

/*
     if (radius >= 0) {
            return 3.14 * radius * radius;
        } else {
            System.err.println("Error 999! Negative Number Entered.");
            return 0.0;
        }
 */