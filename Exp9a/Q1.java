package Exp9a;

interface Resume {
    void displayInfo();
}

class Teacher implements Resume {
    @Override
    public void displayInfo() {
        System.out.println("Teacher's information in printed.");
        // Additional components specific to the Teacher class
    }
}

class Student implements Resume {
    @Override
    public void displayInfo() {
        System.out.println("Student's information is printed.");
        // Additional components specific to the Student class
    }
}

public class Q1 {
    public static void main(String[] args) {
        // Creating objects of Teacher and Student
        Teacher teacher = new Teacher();
        Student student = new Student();

        // Calling displayInfo for Teacher
        System.out.println("Teacher's information:");
        teacher.displayInfo();

        // Calling displayInfo for Student
        System.out.println("\nStudent's information:");
        student.displayInfo();
    }
}