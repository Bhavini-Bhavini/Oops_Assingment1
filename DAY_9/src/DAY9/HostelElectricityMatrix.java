package DAY9;

import java.util.Scanner;

public class HostelElectricityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] units = new int[4][7];

        System.out.println("Units for 4 rooms over 7 days:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                int m;
                do {
                    m = sc.nextInt();  
                } while (m < 0);
                units[i][j] = m;
            }
        }

        int hostelTotal = 0;
        for (int i = 0; i < 4; i++) {
            int roomTotal = 0;
            for (int j = 0; j < 7; j++) {
                roomTotal += units[i][j];
            }
            hostelTotal += roomTotal;
            System.out.println("Room " + (i + 1) + " Weekly Units: " + roomTotal);
        }

        System.out.println("Total Hostel Consumption: " + hostelTotal + " units");
        sc.close();
    }
}
