/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_application;

public class ClassEquipments extends Equipments {
    private int classID;
    private int benchCount;
    private int lightCount;

    // Constructor
    public ClassEquipments(int equipmentsID, int cost, String equipmentsDetails, int classID, int benchCount, int lightCount) {
        super(equipmentsID, cost, equipmentsDetails);
        this.classID = classID;
        this.benchCount = benchCount;
        this.lightCount = lightCount;
    }

    // Method to display class equipment details
    public void classEquipmentsDetails() {
        super.equipmentsDetails();
        System.out.println("Class ID: " + classID);
        System.out.println("Bench Count: " + benchCount);
        System.out.println("Light Count: " + lightCount);
    }
}
