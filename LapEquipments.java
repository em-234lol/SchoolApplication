/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_application;

public class LapEquipments extends Equipments {
    private String equipmentName;

    // Constructor
    public LapEquipments(int equipmentsID, int cost, String equipmentsDetails, String equipmentName) {
        super(equipmentsID, cost, equipmentsDetails);
        this.equipmentName = equipmentName;
    }

    // Method to display lap equipment details
    public void lapEquipmentDetails() {
        System.out.println("Equipment Name: " + equipmentName);
        equipmentsDetails();
    }
}
