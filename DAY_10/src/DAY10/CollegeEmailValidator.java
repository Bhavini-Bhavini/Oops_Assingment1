package DAY10;

import java.util.Scanner;

public class CollegeEmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String domain = "@chitkara.edu.in";

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        int Index = email.indexOf('@');

        boolean valid = Index > 0 &&
                        Index == email.lastIndexOf('@') &&
                        email.endsWith(domain);

        System.out.println("EMAIL VALIDATION");
        System.out.println("Email: " + email);
        System.out.println("Status: " + (valid ? "Valid college email" : "Invalid email"));

        sc.close();
    }
}
