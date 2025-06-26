import java.util.Scanner;
public class HandShakes {
	public int MaxHandShakes(int n) {
		int combination = (n*(n-1))/2;
		return combination;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		HandShakes handshakes = new HandShakes();
		int result = handshakes.MaxHandShakes(n);
		System.out.println(result);
	}

}
