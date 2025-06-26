import java.util.Scanner;
public class WindChillTemperature {
	public double calculateWindChill(double temperature, double windSpeed) {
		double windChill =  35.74 + (0.6125*temperature) + (0.4275 * temperature - 35.75)* Math.pow( windSpeed, 0.16);
		
		return windChill;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Temp.:- ");
		double temperature = sc.nextDouble();
		
		System.out.println("Enter the WindSpeed:- ");
		double windSpeed = sc.nextDouble();
		
		WindChillTemperature obj = new WindChillTemperature();
		double result = obj.calculateWindChill(temperature, windSpeed);
		System.out.println(result);
		
		
	}

}
