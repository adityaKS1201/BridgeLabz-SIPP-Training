package Level1;
import java.util.Scanner;
public class Sumuntilzerornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {         
            double number = sc.nextDouble();
            if (number <= 0) {
                break;
            }
            total += number;
        }
        System.out.println("The total sum is: " + total);
	}
}
