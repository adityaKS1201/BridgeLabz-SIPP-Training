import java.util.Scanner;
public class Sumofnaturalnumber {
	public int sumupton(int n) {
		int sum=0;
		for(int i=0; i<=n; i++) {
			sum +=i;
		}
		return sum;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int n = sc.nextInt();
		
		Sumofnaturalnumber sumofnaturalnumber = new Sumofnaturalnumber();
		if(n>0) {
			int result = sumofnaturalnumber.sumupton(n);
				System.out.println(result);
			
		}else {
			System.out.println("Enter a valid number:- ");
		}
	}

}
