package org.launchcode.java.demos.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public String getGradeLevel() {
        if (this.numberOfCredits >= 90) {
            return (this.name + " is a Senior.\n********\n");
        } else if (this.numberOfCredits >= 60) {
            return (this.name + " is a Junior.\n********\n");
        } else if (this.numberOfCredits >= 30) {
            return (this.name + " is a Sophomore.\n********\n");
        } else {
            return (this.name + " is a Freshman.\n*********\n");
        }
    }

    public void addGrade(int courseCredits, double grade) {
        double newQualityScore = ((this.gpa * this.numberOfCredits) + (grade * courseCredits));
        this.numberOfCredits += courseCredits;
        this.gpa = newQualityScore / this.numberOfCredits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    @Override
    public String toString() {
        return "Student Name = " + name + "\n" +
                "Student Id = " + studentId + "\n" +
                "Number Of Credits = " + numberOfCredits + "\n" +
                "GPA = " + gpa;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("\nThe Student class works! " + sally.getName() + " is a student!\n");
        System.out.println(sally);
        System.out.println(sally.getGradeLevel());
        sally.addGrade(12, 3.5);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
        System.out.println(sally.getGradeLevel());
        System.out.println(sally.studentInfo());
    }
}
