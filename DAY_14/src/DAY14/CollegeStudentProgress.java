
package DAY14;

import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    int[] marks = new int[5];
    double attendance;

    Student(int rollNo, String name, int[] marks, double attendance) {
        this.rollNo = rollNo;
        this.name = name;

        for (int i = 0; i < 5; i++)
            this.marks[i] = marks[i];

        this.attendance = attendance;
    }

    int total() {
        int sum = 0;

        for (int i = 0; i < 5; i++)
            sum += marks[i];

        return sum;
    }

    double average() {
        return total() / 5.0;
    }

    String result() {

        for (int i = 0; i < 5; i++) {
            if (marks[i] < 35)
                return "FAIL";
        }

        return "PASS";
    }

    String attendanceStatus() {
        if (attendance >= 75)
            return "Satisfactory";
        else
            return "Shortage";
    }

    void display() {
        System.out.printf("%d %s - Total: %d, Average: %.2f, Result: %s, Attendance: %s\n",
                rollNo, name, total(), average(),
                result(), attendanceStatus());
    }
}

public class CollegeStudentProgress {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        int classTotal = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Roll No: ");
            int roll = sc.nextInt();

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            int[] marks = new int[5];

            for (int j = 0; j < 5; j++) {
                do {
                    System.out.print("Subject " + (j + 1) + ": ");
                    marks[j] = sc.nextInt();
                } while (marks[j] < 0 || marks[j] > 100);
            }

            double attendance;

            do {
                System.out.print("Attendance (%): ");
                attendance = sc.nextDouble();
            } while (attendance < 0 || attendance > 100);

            students[i] = new Student(roll, name, marks, attendance);
            classTotal += students[i].total();
        }

        System.out.println("\nCLASS REPORT");

        for (int i = 0; i < n; i++)
            students[i].display();

        System.out.println("\nClass Total Marks = " + classTotal);

        sc.close();
    }
}