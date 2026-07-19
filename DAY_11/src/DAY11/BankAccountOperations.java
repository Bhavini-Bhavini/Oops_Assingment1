package DAY11;
import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    void assignData(int accNo, String name, double openingBalance) {
        accountNumber = accNo;
        holderName = name;
        balance = openingBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Invalid withdrawal. Check amount or balance.");
        }
    }

    void displayAccount() {
        System.out.println("\nACCOUNT SUMMARY");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.printf("Final Balance: Rs. %.2f\n", balance);
    }
}

public class BankAccountOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc1 = new BankAccount();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Opening Balance: ");
        double bal = sc.nextDouble();

        acc1.assignData(accNo, name, bal);

        System.out.print("Enter Deposit Amount: ");
        double dep = sc.nextDouble();
        acc1.deposit(dep);

        System.out.print("Enter Withdrawal Amount: ");
        double wd = sc.nextDouble();
        acc1.withdraw(wd);

        acc1.displayAccount();

        sc.close();
    }
}
