package DAY12;
import java.util.Scanner;

class Room {
    private int roomNumber;
    private String roomType;
    private double dailyRate;
    private boolean available;

    Room(int roomNumber, String roomType, double dailyRate, boolean available) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.dailyRate = dailyRate;
        this.available = available;
    }

    public void bookRoom(int days) {
        if (!available) {
            System.out.println("Room " + roomNumber + " is already booked.");
            return;
        }
        double amount = dailyRate * days;
        available = false;
        System.out.println("BOOKING DETAILS");
        System.out.println("Room: " + roomNumber + " - " + roomType);
        System.out.println("Days: " + days);
        System.out.printf("Total Amount: Rs. %.2f%n", amount);
        System.out.println("Status: Booked");
    }
}

public class HotelBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter room number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter room type: ");
        String type = sc.nextLine();
        System.out.print("Enter daily rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter stay days: ");
        int days = sc.nextInt();

        Room r1 = new Room(number, type, rate, true);
        r1.bookRoom(days);

        sc.close();
    }
}

