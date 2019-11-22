package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    @Override
    public String toString() {
        return "{" +
                "topic='" + topic + '\'' +
                ", instructor=" + instructor +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;

        Course course = (Course) o;

        if (!getTopic().equals(course.getTopic())) return false;
        if (!getInstructor().equals(course.getInstructor())) return false;
        return getEnrolledStudents().equals(course.getEnrolledStudents());
    }

    @Override
    public int hashCode() {
        int result = getTopic().hashCode();
        result = 31 * result + getInstructor().hashCode();
        result = 31 * result + getEnrolledStudents().hashCode();
        return result;
    }
}

