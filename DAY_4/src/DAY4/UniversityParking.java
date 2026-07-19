package DAY4;
import java.util.Scanner;

public class UniversityParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("VEHICLE TYPES");
        System.out.println("1. Two-Wheeler");
        System.out.println("2. Car");

        System.out.print("Enter vehicle type (1 or 2): ");
        int vehicleType = sc.nextInt();

        System.out.print("Enter parking hours (1-12): ");
        int hours = sc.nextInt();

        if (hours < 1 || hours > 12) {
            System.out.println("Invalid hours! Must be between 1 and 12.");
            return;
        }

        String vehicleName = "";
        int fee = 0;

        switch (vehicleType) {
            case 1:
                vehicleName = "Two-Wheeler";
                if (hours == 1) {
                    fee = 10;
                } else {
                    fee = 10 + (hours - 1) * 5;
                }
                break;

            case 2:
                vehicleName = "Car";
                if (hours == 1) {
                    fee = 20;
                } else {
                    fee = 20 + (hours - 1) * 10;
                }
                break;

            default:
                System.out.println("Invalid vehicle type! Choose 1 or 2.");
                return;
        }

        System.out.println("\nPARKING FEE");
        System.out.println("Vehicle: " + vehicleName);
        System.out.println("Hours  : " + hours);
        System.out.println("Fee    : Rs. " + fee);
  sc.close();
    }
}
