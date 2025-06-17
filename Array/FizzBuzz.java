import java.util.Scanner;
public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:- ");
		int number = sc.nextInt();
		
		if(number <= 0) {
			System.out.println("Enter a positive value:- ");
		}
		
		String[] result = new String[number +1];
		for(int i=0; i<=number; i++) {
			if(i%3==0 && i%5==0 && i!=0) {
				result[i] = "fizzbuzz";
			}else if(i%3==0 && i!=0) {
				result[i] = "fizz";
			}else if(i%5==0 && i!=0) {
				result[i] = "buzz";
			}else {
				result[i] = String.valueOf(i);
			}
		}
		for(int i=0; i<=number; i++) {
			System.out.println("position of " + i + " "+ result[i]);
		}
	}
}
