/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_application;

public class HigherSecondaryStudent extends Student {
    private final String stream;

    // Constructor
    public HigherSecondaryStudent(int studentID, String studentName, int classID, String section, int busID, String stream) {
        super(studentID, studentName, classID, section, busID);
        this.stream = stream;
    }

    // Method to display higher secondary student details
    public void higherSecondaryStudentDetails() {
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Class ID: " + getClassID());
        System.out.println("Section: " + getSection());
        System.out.println("Bus ID: " + getBusID());
        System.out.println("Stream: " + stream);
    }
}

