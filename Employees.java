/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_application;

public class Employees {
    private int employeesID;
    private String employeesName;
    private float salary;
    private int departmentID;

    // Constructor
    public Employees(int employeesID, String employeesName, float salary, int departmentID) {
        this.employeesID = employeesID;
        this.employeesName = employeesName;
        this.salary = salary;
        this.departmentID = departmentID;
    }

    // Method to display employee details
    public void employeesDetails() {
        System.out.println("Employee ID: " + employeesID);
        System.out.println("Employee Name: " + employeesName);
        System.out.println("Salary: " + salary);
        System.out.println("Department ID: " + departmentID);
    }

    // Method to perform employee check-in
    public void checkIn() {
        // Add your code here to perform employee check-in
        // You can implement the logic to track the employee's attendance
        System.out.println("Employee " + employeesName + " has checked in.");
    }

    // Method to receive salary for the employee
    public void receiveSalary() {
        // Add your code here to process salary payment for the employee
        // You can implement the logic to calculate and process the salary payment
        System.out.println("Salary received for employee " + employeesName + ".");
    }
}

