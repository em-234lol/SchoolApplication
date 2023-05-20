/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_application;

public class Bus {
    private int busID;
    private int driverID;
    private String areaList;
    private int busNumber;
    private int capacity;
    private TheSchool school;

    // Constructor
    public Bus(int busID, int driverID, String areaList, int busNumber, int capacity, TheSchool school) {
        this.busID = busID;
        this.driverID = driverID;
        this.areaList = areaList;
        this.busNumber = busNumber;
        this.capacity = capacity;
        this.school = school;
    }

    // Method to display bus details
    public void busDetails() {
        System.out.println("Bus ID: " + busID);
        System.out.println("Driver ID: " + driverID);
        System.out.println("Area List: " + areaList);
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Capacity: " + capacity);
    }

    // Method to show available seats in the bus
    public void showSeats() {
        // Add your code here to show available seats in the bus
        // You can use conditions and logic to determine seat availability
        System.out.println("Available seats: 20");
    }

    // Getter for the school associated with the bus
    public TheSchool getSchool() {
        return school;
    }

    // Setter for the school associated with the bus
    public void setSchool(TheSchool school) {
        this.school = school;
    }
}

