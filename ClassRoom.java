/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_application;

import java.util.ArrayList;

public class ClassRoom {
    private final int classID;
    private String className;
    private int teacherID;
    private int studentCount;
    private int equipmentID;
    private ArrayList<Student> students;

    // Constructor
    public ClassRoom(int classID, String className, int teacherID, int studentCount, int equipmentID) {
        this.classID = classID;
        this.className = className;
        this.teacherID = teacherID;
        this.studentCount = studentCount;
        this.equipmentID = equipmentID;
        this.students = new ArrayList<Student>();
    }

    // Method to add a student to the classroom
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display classroom details
    public void classDetails() {
        System.out.println("Class ID: " + classID);
        System.out.println("Class Name: " + className);
        System.out.println("Teacher ID: " + teacherID);
        System.out.println("Student Count: " + studentCount);
        System.out.println("Equipment ID: " + equipmentID);
    }
}

