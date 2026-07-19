package DAY14;

import java.util.Scanner;

class Vehicle {

    String number;
    int type;
    int hours;

    Vehicle(String number, int type, int hours) {
        this.number = number;
        this.type = type;
        this.hours = hours;
    }
}

class ParkingTicket {

    Vehicle vehicle;

    ParkingTicket(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    double calculateFee() {

        if (vehicle.type == 1)
            return vehicle.hours * 20;
        else
            return vehicle.hours * 30;
    }

    void printTicket(int no) {

        String typeName;

        if (vehicle.type == 1)
            typeName = "Two-wheeler";
        else
            typeName = "Car";

        System.out.println("TICKET " + no + ": "
                + vehicle.number + ", "
                + typeName + ", "
                + vehicle.hours + " hours, Fee Rs. "
                + calculateFee());
    }
}

public class CollegeParking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Vehicles: ");
        int n = sc.nextInt();

        ParkingTicket[] tickets = new ParkingTicket[n];

        double revenue = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("\nVehicle " + (i + 1));

            System.out.print("Vehicle Number: ");
            String no = sc.next();

            int type;

            do {
                System.out.print("Type (1-Two Wheeler,2-Car): ");
                type = sc.nextInt();
            } while (type != 1 && type != 2);

            int hrs;

            do {
                System.out.print("Hours: ");
                hrs = sc.nextInt();
            } while (hrs <= 0);

            Vehicle v = new Vehicle(no, type, hrs);
            tickets[i] = new ParkingTicket(v);

            revenue += tickets[i].calculateFee();
        }

        System.out.println();

        for (int i = 0; i < n; i++)
            tickets[i].printTicket(i + 1);

        System.out.println("\nTotal Revenue: Rs. " + revenue);

        sc.close();
    }
}
