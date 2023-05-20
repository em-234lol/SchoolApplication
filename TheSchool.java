/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_application;

public class TheSchool {
    private String schoolName;
    private String address;
    private int contactNumber;
    private PlayGround playGround;
    private Department department;
    private Bus bus;
     private Teacher teacher;

    // Constructor
    public TheSchool(String schoolName, String address, int contactNumber) {
        this.schoolName = schoolName;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    // Method to display school details
    public void schoolDetails() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
    }

    // Method to check if the school is open
    public boolean isOpen() {
        // Add your code here to check if the school is open
        // You can use conditions and logic to determine the status
        // Return true if the school is open, false otherwise
        return true;
    }
        // Getter for the playground associated with the school
    public playGround getplayGround() {
        return playGround;
    }

    // Setter for the playground associated with the school
    public void setplayGround(playGround playGround) {
        this.playGround = playGround;
    }
     // Getter for the bus associated with the school
    public Bus getBus() {
        return bus;
    }

    // Setter for the bus associated with the school
    public void setBus(Bus bus) {
        this.bus = bus;
    }
    // Getter for the department associated with the school
    public Department getDepartment() {
        return department;
    }

    // Setter for the department associated with the school
    public void setDepartment(Department department) {
        this.department = department;
    }
    // Getter for the teacher associated with the school
    public Teacher getTeacher() {
        return teacher;
    }

    // Setter for the teacher associated with the school
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}