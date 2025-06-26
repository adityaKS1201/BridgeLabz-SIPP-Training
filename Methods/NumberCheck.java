public class NumberCheck {

    // Method to calculate sum of proper divisors
    public static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // 1. Check if a number is a Perfect number
    public static boolean isPerfect(int number) {
        return sumOfDivisors(number) == number;
    }

    // 2. Check if a number is an Abundant number
    public static boolean isAbundant(int number) {
        return sumOfDivisors(number) > number;
    }

    // 3. Check if a number is a Deficient number
    public static boolean isDeficient(int number) {
        return sumOfDivisors(number) < number;
    }

    // 4. Check if a number is a Strong number
    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method to test all utilities
    public static void main(String[] args) {
        int num = 145; // you can change this to test different numbers

        System.out.println("Number: " + num);
        System.out.println("Is Perfect?   " + isPerfect(num));
        System.out.println("Is Abundant?  " + isAbundant(num));
        System.out.println("Is Deficient? " + isDeficient(num));
        System.out.println("Is Strong?    " + isStrong(num));
    }
}
