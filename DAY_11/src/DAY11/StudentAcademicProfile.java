package DAY11;

import java.util.Scanner;

class Student {
    int roll;
    String name;
    int marks;
    int attendance;

    void assignData(int r, String n, int m, int a) {
        roll = r;
        name = n;
        marks = m;
        attendance = a;
    }

    String calculateResult() {
        if (marks >= 40 && attendance >= 75) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    void displayProfile() {
        System.out.println(roll + " - " + name + " - Marks: " + marks + " - Attendance: " + attendance + "% - " + calculateResult());
    }
}

public class StudentAcademicProfile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Student " + (i + 1) + ":");
            int roll = sc.nextInt();
            String name = sc.next();
            int marks = sc.nextInt();
            int attendance = sc.nextInt();
            if (marks < 0 || marks > 100 || attendance < 0 || attendance > 100) {
                System.out.println("Marks and attendance must be between 0 and 100.");
                i--;
                continue;
            }
            students[i].assignData(roll, name, marks, attendance);
        }

        System.out.println("\nSTUDENT PROFILES");
        for (Student s : students) {
            s.displayProfile();
        }
        sc.close();
    }
}

