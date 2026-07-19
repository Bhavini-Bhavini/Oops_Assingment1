package DAY14;

import java.util.Scanner;

class Learner {

    String id;
    String name;
    double courseFee;
    double amountPaid;
    int[] attendance;

    Learner(String id, String name,
            double courseFee,
            double amountPaid,
            int[] attendance) {

        this.id = id;
        this.name = name;
        this.courseFee = courseFee;
        this.amountPaid = amountPaid;

        this.attendance = new int[7];

        for (int i = 0; i < 7; i++)
            this.attendance[i] = attendance[i];
    }

    double calculatePendingFee() {
        return courseFee - amountPaid;
    }

    double calculateAttendancePercentage() {

        int present = 0;

        for (int i = 0; i < 7; i++) {
            if (attendance[i] == 1)
                present++;
        }

        return (present * 100.0) / 7;
    }

    String isCertificateEligible() {

        if (calculatePendingFee() > 0)
            return "Not Eligible (fee pending)";

        if (calculateAttendancePercentage() < 75)
            return "Not Eligible (attendance shortage)";

        return "Eligible";
    }

    void display() {

        System.out.println("\nLEARNER REPORT");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Pending Fee: Rs. %.2f\n", calculatePendingFee());
        System.out.printf("Attendance: %.2f%%\n",
                calculateAttendancePercentage());
        System.out.println("Certificate Eligibility: "
                + isCertificateEligible());
    }
}

public class TrainingCentreFee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Learners: ");
        int n = sc.nextInt();

        Learner[] learners = new Learner[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nLearner " + (i + 1));

            System.out.print("ID: ");
            String id = sc.next();

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            double fee;

            do {
                System.out.print("Course Fee: ");
                fee = sc.nextDouble();
            } while (fee <= 0);

            double paid;

            do {
                System.out.print("Amount Paid: ");
                paid = sc.nextDouble();
            } while (paid < 0 || paid > fee);

            int[] attendance = new int[7];

            System.out.println("Enter Attendance (1=Present, 0=Absent)");

            for (int j = 0; j < 7; j++) {

                do {
                    System.out.print("Session " + (j + 1) + ": ");
                    attendance[j] = sc.nextInt();
                } while (attendance[j] != 0 && attendance[j] != 1);
            }

            learners[i] = new Learner(id, name, fee, paid, attendance);
        }

        for (int i = 0; i < n; i++)
            learners[i].display();

        sc.close();
    }
}
