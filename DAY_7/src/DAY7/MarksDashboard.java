package DAY7;
import java.util.Scanner;

public class MarksDashboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;
        int passed = 0;
        int failed = 0;

        System.out.println("Enter marks for 5 subjects (0 - 100):");

        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Subject " + (i+1) + ": ");
                int value = sc.nextInt();

                if (value >= 0 && value <= 100) {
                    marks[i] = value;
                    total += value;
                    if (value >= 40) {
                        passed++;
                    } else {
                        failed++;
                    }
                    break;
                } else {
                    System.out.println("Invalid input! Marks must be between 0 and 100.");
                }
            }
        }

        double average = total / 5.0;

        System.out.println("\nMARKS DASHBOARD");
        System.out.print("Marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("\nTotal: " + total);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Passed Subjects: " + passed);
        System.out.println("Failed Subjects: " + failed);

        sc.close();
    }
}
