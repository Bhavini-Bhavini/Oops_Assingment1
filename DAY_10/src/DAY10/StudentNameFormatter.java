package DAY10;

import java.util.Scanner;

public class StudentNameFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First name: ");
        String first = sc.nextLine();

        System.out.print("Middle name: ");
        String middle = sc.nextLine();

        System.out.print("Last name: ");
        String last = sc.nextLine();

        first = first.trim();
        middle = middle.trim();
        last = last.trim();

        if (first.length() == 0 || middle.length() == 0 || last.length() == 0) {
            System.out.println("Error: Name fields cannot be empty.");
        } else {
            first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
            middle = middle.substring(0, 1).toUpperCase() + middle.substring(1).toLowerCase();
            last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();

            String fullName = first + " " + middle + " " + last;
            String initials = first.charAt(0) + ". " + middle.charAt(0) + ". " + last;

            System.out.println("Formatted Name: " + fullName);
            System.out.println("Initial Format: " + initials);
        }

        sc.close();
    }
}
