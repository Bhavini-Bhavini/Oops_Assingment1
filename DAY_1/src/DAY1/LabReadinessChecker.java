
package DAY1;
import java.util.Scanner;

public class LabReadinessChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("JAVA LAB READINESS CHECK");
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter Laboratory Name: ");
        String labName = sc.nextLine();

        System.out.println("Student Name: " + studentName);
        System.out.println("Laboratory: " + labName);
        System.out.println("Status: Java environment is ready.");
        System.out.println("Compile: javac LabReadinessChecker.java");
        System.out.println("Run: java LabReadinessChecker");

        sc.close();
    }
}
