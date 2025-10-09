package problems;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int units = Integer.parseInt(args[0]);
		double bill = 0.0;
		if(units<=100) {
			bill+=160;
		}
		else if(units>=101&&units<=250) {
			bill +=(units*1);
		}
		else {
			bill+=(units*1.2);
		}
System.out.println("Bill : "+bill);
	}

}
