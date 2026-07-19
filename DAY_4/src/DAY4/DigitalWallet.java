package DAY4;
import java.util.Scanner;

public class DigitalWallet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;
        int choice;       

        do {
        	
            System.out.println("\nMenu");
            System.out.println("1. Add money");
            System.out.println("2. Make payment");
            System.out.println("3. View balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to add: ");
                    double addAmount = sc.nextDouble();
                    if (addAmount > 0) {
                        balance += addAmount;
                        System.out.println("DIGITAL WALLET");
                        System.out.println("Money added successfully.");
                        System.out.println("Payment completed.");
                        System.out.printf("Current Balance: Rs. %.2f\n", balance);
                        System.out.println("Thank you.");
                    } else {
                        System.out.println("Invalid amount. Must be positive.");
                    }
                    break;

                case 2:
                	System.out.println("DIGITAL WALLET");
                    System.out.print("Enter payment amount: ");
                    double payAmount = sc.nextDouble();
                    if (payAmount > 0 && payAmount <= balance) {
                        balance -= payAmount;
                        System.out.println("Payment completed.");
                        System.out.printf("Current Balance: Rs. %.2f\n", balance);
                        System.out.println("Thank you.");
                    } else {
                        System.out.println("Payment failed. Check amount.");
                    }
                    break;

                case 3:
                	System.out.println("DIGITAL WALLET");
                    System.out.printf("Current Balance: Rs. %.2f\n", balance);
                    System.out.println("Thank you.");
                    break;

                case 4:
                    System.out.println("Thank you.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
