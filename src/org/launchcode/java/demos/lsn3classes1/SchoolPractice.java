package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        //String[] choiceKeys = new String[choices.size()];
        Student meStudent = new Student("Bo the Dog", 99, 1, 4.0);
        Course myLaunchCode = new Course("LaunchCode Java Unit", "LC101", "Mr Tibbs", 1 );
        Teacher theTeacher = new Teacher("Joe", "Tibbs",35);

        System.out.println(meStudent.getNumberOfCredits());
        System.out.println(meStudent.getName() + "\n");

        System.out.println(myLaunchCode.getCoursePreReqs());
        System.out.println(myLaunchCode.getCourseInstructor() + "\n");

        System.out.println(theTeacher.toString());
    }


}
