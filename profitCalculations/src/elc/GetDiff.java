package elc;
import  java.util.Scanner;
import blc.TwoDigitsDifference;


public class GetDiff {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.print("Enter the Number:");
int n = Integer.parseInt(sc.nextLine());
		// TODO Auto-generated method stub
		int s = TwoDigitsDifference.getDiffOfDigits(n);
		System.out.println("The Difference is:"+s);

	}
	
	
}
