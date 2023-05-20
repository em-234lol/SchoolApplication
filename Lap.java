/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_application;

public class Lap {
    private int lapID;
    private int inChargeID;
    private String lapName;
    private int equipmentID;
    private LapEquipments LapEquipments ;

    // Constructor
    public Lap(int lapID, int inChargeID, String lapName, int equipmentID) {
        this.lapID = lapID;
        this.inChargeID = inChargeID;
        this.lapName = lapName;
        this.equipmentID = equipmentID;
    }

    // Method to display lap details
    public void lapDetails() {
        System.out.println("Lap ID: " + lapID);
        System.out.println("In Charge ID: " + inChargeID);
        System.out.println("Lap Name: " + lapName);
        System.out.println("Equipment ID: " + equipmentID);
    }

    // Method to check if the lap is occupied
    public boolean isOccupied() {
        // Add your code here to check if the lap is occupied
        // You can implement the logic to determine the status of the lap
        return false;
    }

    // Method to process the final payment for the lap
    public void payFinal() {
        // Add your code here to process the final payment for the lap
        // You can implement the logic to calculate and process the payment
        System.out.println("Final payment processed for lap " + lapName);
    }
   
    public LapEquipments getLapEquipments() {
        return LapEquipments;
    }

    // Setter for the LapEquipments associated with the lab
    public void setLapEquipments(LapEquipments LapEquipments) {
        this.LapEquipments = LapEquipments;
    }
}
