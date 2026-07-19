package DAY12;
import java.util.Scanner;

class Enrollment {
    private String id;
    private String learner;
    private String course;
    private double fee;
    private String status;

    public Enrollment(String id, String learner, String course, double fee, String status) {
        this.id = id;
        this.learner = learner;
        this.course = course;
        this.fee = fee;
        this.status = status;
    }

    public void display() {
        System.out.println("\nENROLLMENT RECORD");
        System.out.println("ID: " + id);
        System.out.println("Learner: " + learner);
        System.out.println("Course: " + course);
        System.out.printf("Fee: Rs. %.2f%n", fee);
        System.out.println("Payment Status: " + status);
    }
}

public class CourseEnrollmentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Enrollment ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Learner Name: ");
        String learner = sc.nextLine();
        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();
        System.out.print("Enter Fee: ");
        double fee = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Enter Payment Status: ");
        String status = sc.nextLine();

        Enrollment e = new Enrollment(id, learner, course, fee, status);
        e.display();

        sc.close();
    }
}
