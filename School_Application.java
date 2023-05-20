

package school_application;

/**
 *
 * @author DELL
 */
public class School_Application {

    public static void main(String[] args) {
   
         // Create a new Student instance
        Student student1 = new Student(1, "John Doe", 10, "A", 123);

        
        // Display student details
        student1.studentDetails();

        // Pay fees for the student
        student1.payFees();

        // Create a new TheSchool instance
        TheSchool school = new TheSchool("Example School", "123 Example Street", 1234567890);

        // Display school details
        school.schoolDetails();

        // Check if the school is open
        boolean isOpen = school.isOpen();
        System.out.println("Is the school open? " + isOpen);
        
                // Check if the playground is occupied
        boolean isOccupied = playGround.isOccupied();
        System.out.println("Is the playground occupied? " + isOccupied);
    }
}

