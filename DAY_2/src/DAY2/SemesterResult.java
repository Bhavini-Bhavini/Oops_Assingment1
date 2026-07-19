package DAY2;
import java.util.Scanner;
public class SemesterResult {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SEMESTER RESULT");
        System.out.print("Enter the marks for 5 subjects ");
        int subject1 = sc.nextInt();
        int subject2 = sc.nextInt();
        int subject3 = sc.nextInt();
        int subject4 = sc.nextInt();
        int subject5 = sc.nextInt();
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        System.out.println("Total Marks: " + totalMarks);
        double percentage = (totalMarks / 500.0) * 100;
        System.out.println("Percentage: " + percentage + "%");
        if (percentage>= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        sc.close();
    }
}
