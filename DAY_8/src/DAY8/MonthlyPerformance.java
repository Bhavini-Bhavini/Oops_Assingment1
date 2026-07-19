package DAY8;
import java.util.Scanner;

public class MonthlyPerformance {

    public static void readSales(double[] sales, Scanner sc) {
        System.out.println("Enter monthly sales:");
        for (int i = 0; i < sales.length; i++) {
            while (true) {
                System.out.print("Month " + (i + 1) + ": ");
                double val = sc.nextDouble();
                if (val >= 0) {
                    sales[i] = val;
                    break;
                } else {
                    System.out.println("Sales must be non-negative.");
                }
            }
        }
    }

    public static double calculateTotal(double[] sales) {
        double sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public static double calculateAverage(double[] sales) {
        return calculateTotal(sales) / sales.length;
    }

    public static int countTargetMonths(double[] sales, double target) {
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] sales = new double[12];
        readSales(sales, sc);
        System.out.print("Enter target sales: ");
        
        double target = sc.nextDouble();
        double total = calculateTotal(sales);
        double average = calculateAverage(sales);
        int targetMonths = countTargetMonths(sales, target);
        
        
        System.out.println("\nSALES PERFORMANCE");
        System.out.printf("Annual Sales: Rs. %.2f\n", total);
        System.out.printf("Average Monthly Sales: Rs. %.2f\n", average);
        System.out.println("Months Achieving Target: " + targetMonths);
        sc.close();
    }
}
