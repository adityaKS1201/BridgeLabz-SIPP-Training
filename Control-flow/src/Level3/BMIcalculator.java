package Level3;

import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        double heightMeters = heightCm / 100;
        double bmi = weight / (heightMeters * heightMeters);
        System.out.printf("Your BMI is: %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("You are Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You are Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are Overweight");
        } else {
            System.out.println("You are Obese");
        }
    }
}
