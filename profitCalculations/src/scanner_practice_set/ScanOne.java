package scanner_practice_set;
import java.util.*;
public class ScanOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rem = 0,sum=0,org=0;
		System.out.print("Enter the number to reverse:");
		int numOne = sc.nextInt();
		org = numOne;
		while(numOne!=0) {
			rem = numOne%10;
			sum = (sum*10+rem);
			numOne/=10;
		}
	  if(sum == org) {
		  System.out.println("The Number is Palindrom");
	  }
	  else {
		System.out.println("Not a Palindrom Number");
	  }

	}

}
