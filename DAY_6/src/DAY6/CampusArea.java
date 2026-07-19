package DAY6;
import java.util.Scanner;

public class CampusArea {

    public static double area(double side) {
        return side * side;
    }

    public static double area(double length, double width) {
        return length * width;
    }

    public static double area(int radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice (1: Square / 2: Rectangle / 3: Circle):");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                if (side <= 0) {
                    System.out.println("Invalid input! Side must be greater than 0.");
                } else {
                    System.out.println("\nAREA RESULT");
                    System.out.println("Shape: Square");
                    System.out.printf("Area: %.2f square units%n", area(side));
                }
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                if (length <= 0 || width <= 0) {
                    System.out.println("Invalid input! Length and width must be greater than 0.");
                } else {
                    System.out.println("\nAREA RESULT");
                    System.out.println("Shape: Rectangle");
                    System.out.printf("Area: %.2f square units%n", area(length, width));
                }
                break;

            case 3:
                System.out.print("Enter radius: ");
                int radius = sc.nextInt();
                if (radius <= 0) {
                    System.out.println("Invalid input! Radius must be greater than 0.");
                } else {
                    System.out.println("\nAREA RESULT");
                    System.out.println("Shape: Circle");
                    System.out.printf("Area: %.2f square units%n", area(radius));
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
