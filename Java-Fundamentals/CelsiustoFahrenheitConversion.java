package assignment;
import java.util.*;
public class CelsiustoFahrenheitConversion {
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the temp. in celcius:- ");
    int tempincelcius=sc.nextInt();
    int fahren=((tempincelcius* 9/5) + 32);
    System.out.println(fahren);
    }
}
