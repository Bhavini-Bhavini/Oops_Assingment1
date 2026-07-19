package DAY13;

import java.util.Scanner;

class Product {
    String productId;
    String name;
    double price;
    int quantity;

    Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalValue() {
        return price * quantity;
    }

    void displayProduct() {
        System.out.println("\nPRODUCT BILL");
        System.out.println("Product: " + productId + " - " + name);
        System.out.printf("Price: Rs. %.2f\n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Value: Rs. %.2f\n", calculateTotalValue());
    }
}

public class ProductBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n;

        do {
            n = sc.nextInt();
            if (n <= 0)
                System.out.print("Enter a valid number: ");
        } while (n <= 0);

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nProduct " + (i + 1));

            System.out.print("Product ID: ");
            String id = sc.next();

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            double price;
            do {
                System.out.print("Price: ");
                price = sc.nextDouble();
                if (price <= 0)
                    System.out.println("Price must be greater than 0.");
            } while (price <= 0);

            int qty;
            do {
                System.out.print("Quantity: ");
                qty = sc.nextInt();
                if (qty <= 0)
                    System.out.println("Quantity must be greater than 0.");
            } while (qty <= 0);

            products[i] = new Product(id, name, price, qty);
        }
        for (int i = 0; i < n; i++) {
            products[i].displayProduct();
        }

        sc.close();
    }
}