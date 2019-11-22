package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Arrays;

public class Teacher {

    private String firstName;
    private String lastName;
    private ArrayList<String> subjectsTeaching = new ArrayList<>(Arrays.asList("History", "Critical Thinking", "Logic"));
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        //this.subjectsTeaching = subjectsTeaching;
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<String> getSubjectsTeaching() {
        return subjectsTeaching;
    }

    private void setSubjectsTeaching(ArrayList<String> subjectsTeaching) {
        this.subjectsTeaching = subjectsTeaching;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    private void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }


    @Override
    public String toString() {
        return "Teacher Name = " + firstName + " " + lastName + "\n" +
                "Teaches the Following Subjects = " + subjectsTeaching + "\n" +
                "Years Teaching = " + yearsTeaching;
    }
}
