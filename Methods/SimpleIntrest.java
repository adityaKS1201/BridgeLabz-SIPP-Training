import java.util.Scanner;
public class SimpleIntrest {
	public double SI(double principle, double rate, double time ) {
		double Simple_Interest = principle * rate * time/ 100;
		return Simple_Interest;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principle amount:- ");
		double principle = sc.nextDouble();
		System.out.print("Enter the rate:- ");
		double rate = sc.nextDouble();
		System.out.print("Enter time period:- ");
		double time = sc.nextDouble();
		
		SimpleIntrest obj = new SimpleIntrest();
		double intrest = obj.SI(principle, rate, time);
		System.out.println("SI "+ intrest);
	}

}
