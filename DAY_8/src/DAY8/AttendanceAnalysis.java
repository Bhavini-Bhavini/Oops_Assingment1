package DAY8;
import java.util.Scanner;

public class AttendanceAnalysis {

    public static void readAttendance(double[] values, Scanner sc) {
        System.out.println("Enter attendance percentages:");

        for (int i = 0; i < values.length; i++) {
            while (true) {
                System.out.print("Student " + (i + 1) + ": ");
                double attendance = sc.nextDouble();

                if (attendance >= 0 && attendance <= 100) {
                    values[i] = attendance;
                    break;
                } else {
                    System.out.println("Invalid attendance! Please enter a value between 0 and 100.");
                }
            }
        }
    }

    public static double calculateAverage(double[] values) {
        double sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum / values.length;
    }

    public static int countShortage(double[] values, double limit) {
        int count = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] < limit) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        while (true) {
            System.out.print("Enter number of students: ");
            n = sc.nextInt();

            if (n > 0) {
                break;
            } else {
                System.out.println("Number of students must be greater than 0.");
            }
        }

        double[] attendance = new double[n];

        readAttendance(attendance, sc);

        double average = calculateAverage(attendance);
        int shortage = countShortage(attendance, 75);

        System.out.println("\nCLASS ATTENDANCE");
        System.out.printf("Class Average: %.2f%%\n", average);
        System.out.println("Students Below 75%: " + shortage);

        sc.close();
    }
}