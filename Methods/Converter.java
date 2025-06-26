import java.util.Scanner;
public class Converter {
	public static double convertFarhenheitToCelsius(double farhenheit) {
		double farhenheitTocelsius = (farhenheit - 32) * 5 / 9;
		return farhenheitTocelsius;
	}
	public static double convertCelsiusToFarhenheit(double celcius) {
		double celsius2farhenheit  = (celcius * 9 / 5) + 32;
		return celsius2farhenheit;
	}
	public static double convertpoundToKilogram(double Pounds) {
		double pounds2kilograms =  Pounds*0.453592;
		return pounds2kilograms;
	}
	public static double convertKilogramToPound(double Kilogram) {
		double  kilograms2pounds = Kilogram*2.2046;
		return  kilograms2pounds;
	}
	public static double convertgallons2liters(double Gallons) {
		double  gallons2liters = Gallons*3.78541;
		return  gallons2liters;
	}
	public static double convertliters2gallons(double Liters) {
		double liters2gallons = Liters*0.264172;
		return liters2gallons;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( convertFarhenheitToCelsius(100));
		System.out.println( convertCelsiusToFarhenheit(37));
		System.out.println( convertpoundToKilogram(150));
		System.out.println( convertKilogramToPound(68));
		System.out.println( convertgallons2liters(20));
		System.out.println( convertliters2gallons(4.5));
			

	}

}
