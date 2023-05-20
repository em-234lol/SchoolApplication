/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_application;

public class PrimaryStudent extends Student {
    private final String gradeLevel;

    // Constructor
    public PrimaryStudent(int studentID, String studentName, int classID, String section, int busID, String gradeLevel) {
        super(studentID, studentName, classID, section, busID);
        this.gradeLevel = gradeLevel;
    }

    // Method to display primary student details
    public void primaryStudentDetails() {
        System.out.println("Primary Student ID: " + getStudentID());
        System.out.println("Primary Student Name: " + getStudentName());
        System.out.println("Class ID: " + getClassID());
        System.out.println("Section: " + getSection());
        System.out.println("Bus ID: " + getBusID());
        System.out.println("Grade Level: " + gradeLevel);
    }
}

