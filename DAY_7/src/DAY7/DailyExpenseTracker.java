package DAY7;

import java.util.Scanner;

public class DailyExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] expenses = new double[7];
        double total = 0;
        int overBudgetDays = 0;

        for (int i = 0; i < 7; i++) {
            double value;
            do {
                System.out.print("Enter expense for Day " + (i + 1) + ": ");
                value = sc.nextDouble();
                if (value < 0) {
                    System.out.println("Invalid! Expense cannot be negative. Try again.");
                }
            } while (value < 0);
            expenses[i] = value;
            total += value;
        }

        double budget;
        do {
            System.out.print("Enter your daily budget limit: ");
            budget = sc.nextDouble();
            if (budget <= 0) {
                System.out.println("Invalid! Budget must be positive. Try again.");
            }
        } while (budget <= 0);

        for (int i = 0; i < 7; i++) {
            if (expenses[i] > budget) {
                overBudgetDays++;
            }
        }

        double average = total / 7;
        for (int i = 0; i < 7; i++) {
            System.out.printf("Day %d: Rs. %.2f%n", (i + 1), expenses[i]);
        }
        System.out.println("\nEXPENSE REPORT");
        System.out.printf("Total Spending: Rs. %.2f%n", total);
        System.out.printf("Average Daily Spending: Rs. %.2f%n", average);
        System.out.println("Days Above Budget: " + overBudgetDays);

        sc.close();
    }
}
