package DAY13;
import java.util.Scanner;

class CartItem {

    String itemName;
    double unitPrice;
    int quantity;

    CartItem(String itemName, double unitPrice, int quantity) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    CartItem updateQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    double calculateAmount() {
        return unitPrice * quantity;
    }

    void display() {
        System.out.println("\nCART ITEM");
        System.out.println("Item: " + itemName);
        System.out.printf("Unit Price: Rs. %.2f\n", unitPrice);
        System.out.println("Updated Quantity: " + quantity);
        System.out.printf("Current Total: Rs. %.2f\n", calculateAmount());
    }
}

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Item Name: ");
        String item = sc.nextLine();

        double price;
        do {
            System.out.print("Unit Price: ");
            price = sc.nextDouble();
            if (price <= 0)
                System.out.println("Invalid price.");
        } while (price <= 0);

        int qty;
        do {
            System.out.print("Initial Quantity: ");
            qty = sc.nextInt();
            if (qty <= 0)
                System.out.println("Invalid quantity.");
        } while (qty <= 0);

        CartItem cart = new CartItem(item, price, qty);

        int newQty;
        do {
            System.out.print("Updated Quantity: ");
            newQty = sc.nextInt();
            if (newQty <= 0)
                System.out.println("Invalid quantity.");
        } while (newQty <= 0);

        cart.updateQuantity(newQty).display();

        sc.close();
    }
}
