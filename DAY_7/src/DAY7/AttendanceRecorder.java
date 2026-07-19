package DAY7;
import java.util.Scanner;

public class AttendanceRecorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] attendance = new int[7];
        int presentDays = 0;

        System.out.println("Enter attendance for 7 days (1 = Present, 0 = Absent):");

        for (int i = 0; i < 7; i++) {
            while (true) {
                System.out.print("Day " + (i+1) + ": ");
                int value = sc.nextInt();

                if (value == 0 || value == 1) {
                    attendance[i] = value;
                    if (value == 1) presentDays++;
                    break; 
                } else {
                    System.out.println("Invalid input! Enter only 0 or 1.");
                }
            }
        }

        int absentDays = 7 - presentDays;
        double percentage = (presentDays / 7.0) * 100;

        System.out.println("\nWEEKLY ATTENDANCE");
        System.out.println("Present Days: " + presentDays);
        System.out.println("Absent Days: " + absentDays);
        System.out.printf("Attendance: %.2f%%\n", percentage);

        sc.close();
    }
}

