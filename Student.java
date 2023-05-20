/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_application;

public class Student {
    private int studentID;
    private String studentName;
    private int classID;
    private String section;
    private int busID;

    // Constructor
    public Student(int studentID, String studentName, int classID, String section, int busID) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.classID = classID;
        this.section = section;
        this.busID = busID;
    }

    // Method to display student details
    public void studentDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Class ID: " + classID);
        System.out.println("Section: " + section);
        System.out.println("Bus ID: " + busID);
    }

    // Method to pay fees
    public void payFees() {
        // Add your code here to handle fee payment logic
        System.out.println("Fees paid successfully!");
    }
}
