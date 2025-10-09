package Day_3;

public class CompoundInterest {

	public static void main(String[] args) {
		double principle = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		double amount = principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
		
		System.out.printf("Amount after 3 years :%.1f ",amount);
		}

}
