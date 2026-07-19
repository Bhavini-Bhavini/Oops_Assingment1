package DAY6;

import java.util.Scanner;

public class CourierChargeCalculator {

    static double calculateCharge(double weight) {
        return weight * 50;
    }

    static double calculateCharge(double weight, double distance) {
        return (weight * 50) + (distance * 1.0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Delivery Type (1=Local, 2=Outstation): ");
        int type = sc.nextInt();

        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();
        if (weight <= 0) {
            System.out.println("Invalid input! Weight must be positive.");
        }

        double charge;
        String deliveryType;

        switch (type) {
            case 1:
                deliveryType = "Local";
                charge = calculateCharge(weight);
                System.out.println("\nCOURIER CHARGE");
                System.out.println("Delivery: " + deliveryType);
                System.out.println("Weight: " + weight + " kg");
                System.out.printf("Charge: Rs. %.2f\n", charge);
                break;

            case 2:
                deliveryType = "Outstation";
                System.out.print("Enter Distance (km): ");
                double distance = sc.nextDouble();
                if (distance <= 0) {
                    System.out.println("Invalid input! Distance must be positive.");
                   
                }
                charge = calculateCharge(weight, distance);
                System.out.println("\nCOURIER CHARGE");
                System.out.println("Delivery: " + deliveryType);
                System.out.println("Weight: " + weight + " kg");
                System.out.println("Distance: " + (int)distance + " km");
                System.out.printf("Charge: Rs. %.2f\n", charge);
                break;

            default:
                System.out.println("Invalid delivery type! Please enter 1 or 2.");
        }

        sc.close();
    }
}

