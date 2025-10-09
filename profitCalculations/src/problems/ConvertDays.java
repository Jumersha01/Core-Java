package problems;

public class ConvertDays {

	public static void main(String[] args) {
	int days = Integer.parseInt(args[0]);
	int year = (days/365);
	 days -=(year*365);
//	System.out.println(year);
	int months = (days/30);
	days-=(months*30);
//	System.out.println(months);
	int day = days%30;
//	System.out.println(day);
	
	System.out.println("Year : "+year);
	System.out.println("Months : "+months);
	System.out.println("Days : "+day);
	}

}
