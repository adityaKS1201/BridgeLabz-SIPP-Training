package emmersion;
import java.util.Scanner;
public class heightconverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double heightCm = sc.nextDouble();
        double totalInches = heightCm / 2.54;
        double feet = (totalInches / 12);
        double inches = totalInches % 12;
        System.out.println("Your Height in cm is " 
        + heightCm + " while in feet is " + feet + " and inches is " + inches);
	}
}
