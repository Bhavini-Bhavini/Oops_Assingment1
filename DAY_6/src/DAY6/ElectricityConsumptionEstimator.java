package DAY6;

import java.util.Scanner;

public class ElectricityConsumptionEstimator {
    public static double calculateBill(int units) {
        return units * 6.0;
    }

    public static double calculateBill(int units, double equipmentCharge) {
        return (units * 6.0) + equipmentCharge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice (1: Room / 2: Laboratory):");
        int choice = sc.nextInt();

        System.out.print("Enter Units: ");
        int units = sc.nextInt();
        if (units <= 0) {
            System.out.println("Units must be positive");
          
        }

        double energyCharge = units * 6.0;
        double equipmentCharge = 0.0;
        double totalCost = 0;

        if (choice == 1) {
            totalCost = calculateBill(units);
            System.out.println("\nELECTRICITY ESTIMATE");
            System.out.println("Type: Room");
            System.out.printf("Energy Charge: Rs. %.2f\n", energyCharge);
            System.out.printf("Total Cost: Rs. %.2f\n", totalCost);

        } else if (choice == 2) {
            System.out.print("Enter Fixed Equipment Charge: ");
            equipmentCharge = sc.nextDouble();
            if (equipmentCharge < 0) {
                System.out.println("Charge should be positive");
               
            }
            totalCost = calculateBill(units, equipmentCharge);

            System.out.println("\nELECTRICITY ESTIMATE");
            System.out.println("Type: Laboratory");
            System.out.printf("Energy Charge: Rs. %.2f\n", energyCharge);
            System.out.printf("Equipment Charge: Rs. %.2f\n", equipmentCharge);
            System.out.printf("Total Cost: Rs. %.2f\n", totalCost);

        } else {
            System.out.println("Please enter 1 or 2.");
        }

        sc.close();
    }
}
