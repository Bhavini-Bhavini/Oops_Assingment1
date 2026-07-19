package DAY4;
import java.util.Scanner;
public class ScholarshipDecision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your percentage and Attendance");
		System.out.print("Percentage :");
		int percentage = sc.nextInt();
		
		System.out.print("Attendance :");
		int Attendance = sc.nextInt();
		
		if (percentage < 0 || percentage > 100 || Attendance < 0 || Attendance > 100) {
            System.out.println("ACADEMIC DECISION");
            System.out.println(" Values must be between 0 and 100.");
            
        }
        String grade;
        if (percentage >= 85) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        String scholarship;
        if (percentage >= 85 && Attendance >= 90) {
            scholarship = "Eligible";
        } else {
            scholarship = "Not Eligible";
        }

        System.out.println("\nACADEMIC DECISION");
        System.out.println("Grade: " + grade);
        System.out.println("Scholarship:" + scholarship);
        System.out.println("Validation : Input accepted");

        sc.close();
	}

}
