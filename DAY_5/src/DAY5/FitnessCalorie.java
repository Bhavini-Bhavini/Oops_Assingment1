package DAY5;
import java.util.Scanner;

public class FitnessCalorie {
    static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }


    static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    static String getRecommendation(String category) {
        switch (category) {
            case "Underweight":
                return "start eating healthy food";
            case "Normal":
                return "Eat regularly daily";
            case "Overweight":
                return "Adopt healthier eating habits .";
            case "Obese":
                return "follow a strict fitness plan.";
            default:
                return "No recommendation available.";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Weight in kg: ");
        double weight = sc.nextDouble();
        if (weight <= 0) {
            System.out.println("Invalid input!");
        }

        System.out.print("Height in meters: ");
        double height = sc.nextDouble();
        if (height <= 0) {
            System.out.println("Invalid input! ");
        }

        double bmi = calculateBMI(weight, height);
        String category = getBMICategory(bmi);
        String recommendation = getRecommendation(category);

        System.out.println("\nFITNESS REPORT");
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Category: " + category);
        System.out.println("Recommendation: " + recommendation);

        sc.close();
    }
}
