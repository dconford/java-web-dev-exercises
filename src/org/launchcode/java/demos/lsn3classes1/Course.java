package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Course {
    private String courseName;
    private String courseId;
    private String courseInstructor;
    private int courseCredits = 2;
    private ArrayList<String> coursePreReqs = new ArrayList<>(Arrays.asList("English 101", "Writing 200", "Critical Thinking", "Logic 101"));
    private ArrayList<HashMap<Integer, String>> courseStudents;

    public Course(String courseName, String courseId, String courseInstructor, int courseCredits) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseInstructor = courseInstructor;
        this.courseCredits = courseCredits;
        //this.coursePreReqs = coursePreReqs;
        //this.courseStudents = courseStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    private void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    private void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    private void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    private void setCourseCredits(int courseCredits) {
        this.courseCredits = courseCredits;
    }

    public ArrayList<String> getCoursePreReqs() {
        return coursePreReqs;
    }

    private void setCoursePreReqs(ArrayList<String> coursePreReqs) {
        this.coursePreReqs = coursePreReqs;
    }

    public ArrayList<HashMap<Integer, String>> getCourseStudents() {
        return courseStudents;
    }

    private void setCourseStudents(ArrayList<HashMap<Integer, String>> courseStudents) {
        this.courseStudents = courseStudents;
    }
}
/*
In the school package, create a class Course with at least three fields. Before diving into IntelliJ,
try using pen and paper to work through what these might be. At least one of your fields should be an ArrayList
or HashMap, and you should use your Student class.
 */