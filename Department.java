/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_application;

import java.util.ArrayList;

public class Department {
    private int deptID;
    private String deptName;
    private String inChargeName;
    private String departmentDetails;
    private TheSchool school;
    private ArrayList<Employees> employeesList;

    // Constructor
    public Department(int deptID, String deptName, String inChargeName, String departmentDetails, TheSchool school) {
        this.deptID = deptID;
        this.deptName = deptName;
        this.inChargeName = inChargeName;
        this.departmentDetails = departmentDetails;
        this.school = school;
    }

    // Method to display department details
    public void departmentDetails() {
        System.out.println("Department ID: " + deptID);
        System.out.println("Department Name: " + deptName);
        System.out.println("In Charge Name: " + inChargeName);
        System.out.println("Department Details: " + departmentDetails);
    }

    // Getter for the school associated with the department
    public TheSchool getSchool() {
        return school;
    }

    // Setter for the school associated with the department
    public void setSchool(TheSchool school) {
        this.school = school;
    }
    // Method to add an employee to the department
    public void addEmployee(Employees employee) {
        employeesList.add(employee);
    }
}
