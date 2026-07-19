package DAY8;

import java.util.Scanner;

public class TaxAdjustedArray {

    public static double[] addTax(double[] prices, double taxRate) {
        double[] adjusted = new double[prices.length];

        for (int i = 0; i < prices.length; i++) {
            adjusted[i] = prices[i] + (prices[i] * taxRate / 100);
        }

        return adjusted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of items: ");
        int n = sc.nextInt();

        double[] prices = new double[n];

        System.out.println("Enter item prices:");
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Item " + (i + 1) + ": ");
                double val = sc.nextDouble();

                if (val >= 0) {
                    prices[i] = val;
                    break;
                } else {
                    System.out.println("Price should ot be negative.");
                }
            }
        }

        System.out.print("GST percentage: ");
        double gst = sc.nextDouble();

        double[] adjusted = addTax(prices, gst);

        System.out.print("\nORIGINAL PRICES: ");
        for (int i = 0; i < prices.length; i++) {
            System.out.printf("%.2f ", prices[i]);
        }

        System.out.print("\nGST-ADJUSTED PRICES: ");
        for (int i = 0; i < adjusted.length; i++) {
            System.out.printf("%.2f ", adjusted[i]);
        }

        sc.close();
    }
}