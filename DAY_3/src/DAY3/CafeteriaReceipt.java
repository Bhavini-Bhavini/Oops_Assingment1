package DAY3;
import java.util.Scanner;
public class CafeteriaReceipt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("item name : ");
		String item = sc.next();
		
		System.out.println("Unit price :");
		double price = sc.nextInt();
		
		System.out.println("Quantity :");
		int Quantity = sc.nextInt();
		
		System.out.println("GST rate :");
		double gstrate = sc.nextInt();
		
		
		double Subtotal = price * Quantity;
		double GSTrate = Subtotal * gstrate /100;
		double grandtotal = Subtotal + GSTrate;
		
		System.out.println("CAFETERIA RECEIPT");
		System.out.println("Item : " + item);
		System.out.printf("Subtotal : Rs. %.2f\n", Subtotal);
		System.out.printf("GST : Rs. %.2f\n", GSTrate);
		System.out.printf("Grand Total : Rs. %.2f\n", grandtotal);

		
		sc.close();
		
	}

}
