package DAY3;

import java.util.Scanner;

public class TrainingFeedbackSummary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Content rating (1-5): ");
        int content = sc.nextInt();
        if (content < 1 || content > 5) {
            System.out.println("Invalid input! Rating must be between 1 and 5.");
            return ;
        }

        System.out.print("Explanation rating (1-5): ");
        int explanation = sc.nextInt();
        if (explanation < 1 || explanation > 5) {
            System.out.println("Invalid input! Rating must be between 1 and 5.");
            return;
        }

        System.out.print("Practical rating (1-5): ");
        int practical = sc.nextInt();
        if (practical < 1 || practical > 5) {
            System.out.println("Invalid input! Rating must be between 1 and 5.");
            return;
        }   

        int total = content + explanation + practical;
        double average = total / 3.0;

        System.out.println("\nTRAINING FEEDBACK");
        System.out.println("Student: " + studentName);
        System.out.println("Content: " + content + "/5");
        System.out.println("Explanation: " + explanation + "/5");
        System.out.println("Practical Work: " + practical + "/5");
        System.out.printf("Average Rating: %.2f/5\n", average);

        sc.close();
    }
}
