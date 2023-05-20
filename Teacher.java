/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_application;

public class Teacher extends Employees {
    private String subject;

    // Constructor
    public Teacher(int employeesID, String employeesName, float salary, int departmentID, String subject) {
        super(employeesID, employeesName, salary, departmentID);
        this.subject = subject;
    }

    // Method to display teacher details
    public void teacherDetails() {
        employeesDetails();
        System.out.println("Subject: " + subject);
    }
}
