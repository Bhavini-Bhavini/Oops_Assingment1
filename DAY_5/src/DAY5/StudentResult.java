package DAY5;
import java.util.Scanner;
public class StudentResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("STUDENT RESULT");
		System.out.println("Enter your Marks of 5 Subjects :");
		int Marks1 = sc.nextInt();
		int Marks2 = sc.nextInt();
		int Marks3 = sc.nextInt();
		int Marks4 = sc.nextInt();
		int Marks5 = sc.nextInt();
		
		int CalculateTotal = Marks1 + Marks2 + Marks3 + Marks4 + Marks5 ;
		double CalculatePercentage = (CalculateTotal / 500.0) *100;
		String Status = null;
		if (CalculatePercentage >= 75 ) {
			Status ="PASS";
		}else {
			Status ="FAIL";
		}
		
		System.out.println("STUDENT RESULT");
		System.out.println("Total :"+CalculateTotal);
		System.out.printf("Percentage : %.2f%%\n", CalculatePercentage);
		System.out.println("Status :" + Status);
		
		sc.close();
	
	}

}
