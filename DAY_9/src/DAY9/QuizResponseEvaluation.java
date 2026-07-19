package DAY9;

import java.util.Scanner;

public class QuizResponseEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] key = new char[10];
        char[] response = new char[10];

        System.out.println("Enter Answer Key (10 characters):");
        for (int i = 0; i < 10; i++) {
            key[i] = sc.next().charAt(0);
        }

        System.out.println("Enter Student Responses (10 characters, X for unattempted):");
        for (int i = 0; i < 10; i++) {
            response[i] = sc.next().charAt(0);
        }
        System.out.println(" X for unattempted");

        int correct = 0, incorrect = 0, unattempted = 0;
        for (int i = 0; i < 10; i++) {
            if (response[i] == 'X') {
                unattempted++;
            } else if (response[i] == key[i]) {
                correct++;
            } else {
                incorrect++;
            }
        }

        System.out.println("QUIZ RESULT");
        System.out.println("Correct Answers: " + correct);
        System.out.println("Incorrect Answers: " + incorrect);
        System.out.println("Unattempted: " + unattempted);

        sc.close();
    }
}

