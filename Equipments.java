/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_application;

public class Equipments {
    private int equipmentsID;
    private int cost;
    private String equipmentsDetails;

    // Constructor
    public Equipments(int equipmentsID, int cost, String equipmentsDetails) {
        this.equipmentsID = equipmentsID;
        this.cost = cost;
        this.equipmentsDetails = equipmentsDetails;
    }

    // Method to display equipment details
    public void equipmentsDetails() {
        System.out.println("Equipment ID: " + equipmentsID);
        System.out.println("Cost: " + cost);
        System.out.println("Equipment Details: " + equipmentsDetails);
    }
}
