package DAY5;
import java.util.Scanner;

public class LoanEMI_Estimator {

	    public static double calculateInterest(double principal, double rate, int years) {
	        return (principal * rate * years) / 100;
	    }

	    public static double calculateTotalPayable(double principal, double interest) {
	        return principal + interest;
	    }

	    public static double calculateMonthlyInstallment(double totalPayable, int months) {
	        return totalPayable / months;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Principal amount: ");
	        double principal = sc.nextDouble();

	        System.out.print("Enter Annual interest rate: ");
	        double rate = sc.nextDouble();

	        System.out.print("Enter Loan period in years : ");
	        int years = sc.nextInt();

	        System.out.print("Enter Number of months: ");
	        int months = sc.nextInt();

	        if (principal <= 0 || rate <= 0 || years <= 0 || months <= 0) {
	            System.out.println("Invalid input ");
	            sc.close();
	            return;
	        }

	        double interest = calculateInterest(principal, rate, years);
	        double totalPayable = calculateTotalPayable(principal, interest);
	        double monthlyInstallment = calculateMonthlyInstallment(totalPayable, months);

	        System.out.println("\nLOAN ESTIMATE");
	        System.out.printf("Simple Interest: Rs. %.2f\n", interest);
	        System.out.printf("Total Payable: Rs. %.2f\n", totalPayable);
	        System.out.printf("Monthly Instalment: Rs. %.2f\n", monthlyInstallment);

	        sc.close();
	    }
	}

