package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentIdHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> studentIdKeys = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int newStudentId;
        //String newStudentName;

        System.out.println("Please enter a unique Id Number (Enter 0 to finish):)");

        do {
            System.out.print("Student ID Number: ");
            newStudentId = input.nextInt();
            input.nextLine();

            if (newStudentId != 0) {
                System.out.print("Student Name: ");
                String newStudentName = input.nextLine();
                studentIdKeys.put(newStudentId, newStudentName);
            }

        } while(newStudentId != 0);

        // Print class ID and name
        System.out.println("\nClass Id and Name:");

        for (Map.Entry<Integer, String> studentIdKey : studentIdKeys.entrySet()) {
            System.out.println(studentIdKey.getKey() + " (" + studentIdKey.getValue() + ")");
        }
    }
}