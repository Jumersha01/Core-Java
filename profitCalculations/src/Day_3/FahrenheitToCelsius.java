package Day_3;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		double fahrenheit = Double.parseDouble(args[0]);
		double celcius = ((fahrenheit-32)*5)/9;
		System.out.printf("%.1f",celcius);
	}

}
