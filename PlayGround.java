/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_application;

public class PlayGround {
    private float area;
    private int classID;
    private TheSchool school;

    // Constructor
    public PlayGround(float area, int classID, TheSchool school) {
        this.area = area;
        this.classID = classID;
        this.school = school;
    }

    // Method to check if the playground is occupied
    public boolean isOccupied() {
        // Add your code here to check if the playground is occupied
        // You can use conditions and logic to determine the status
        // Return true if the playground is occupied, false otherwise
        return false;
    }

    // Getter for the school associated with the playground
    public TheSchool getSchool() {
        return school;
    }

    // Setter for the school associated with the playground
    public void setSchool(TheSchool school) {
        this.school = school;
    }
}
