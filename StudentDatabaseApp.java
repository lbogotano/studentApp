import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        // Student stu1 = new Student();

        // stu1.enroll();

        // stu1.payTuition();

        // System.out.println(stu1.toString());


        // Ask how many users we want to add

        System.out.print("Enter number of new students to enroll: ");

        Scanner in = new Scanner (System.in);
        int numberOfStudents = in.nextInt();
        Student [] students = new Student [numberOfStudents];

        // Create n number new students

        for (int n = 0; n< numberOfStudents; n ++){
            
            students[n] = new Student();
            
            students[n].enroll();

            students[n].payTuition();

        }

        for (int n = 0; n< numberOfStudents; n ++){
            System.out.println(students[n].toString());
        }

        
    }
    
}