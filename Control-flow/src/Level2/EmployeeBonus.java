package Level1;
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter employee's years of service: ");
        int yearsOfService = input.nextInt();
        if (yearsOfService > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus amount is: INR " + bonus);
        } else {
            System.out.println("No bonus. Service period is less than or equal to 5 years.");
        }
    }
}
