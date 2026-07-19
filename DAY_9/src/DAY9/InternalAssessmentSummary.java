package DAY9;
import java.util.Scanner;

public class InternalAssessmentSummary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[5][3];

        System.out.println("Enter marks for 5 students , 3 assessments each :");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                int m;
                do {
                    m = sc.nextInt();  
                } while (m < 0 || m > 100);
                marks[i][j] = m;
            }
        }

        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            double avg = (double) total / 3;
            System.out.printf("Student %d: Total %d, Average %.2f%n", (i + 1), total, avg);
            sc.close();
        }
    }
}
