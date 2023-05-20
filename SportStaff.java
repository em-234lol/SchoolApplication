/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_application;


    
    public class SportStaff extends Employees {
    private String sportType;

    // Constructor
    public SportStaff(int employeesID, String employeesName, float salary, int departmentID, String sportType) {
        super(employeesID, employeesName, salary, departmentID);
        this.sportType = sportType;
    }

    // Method to display sport staff details
    public void sportStaffDetails() {
        System.out.println("Employee ID: " + getEmployeesID());
        System.out.println("Employee Name: " + getEmployeesName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department ID: " + getDepartmentID());
        System.out.println("Sport Type: " + sportType);
    }
}


