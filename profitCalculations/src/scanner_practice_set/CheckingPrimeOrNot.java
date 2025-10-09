package scanner_practice_set;
import java.util.*;
public class CheckingPrimeOrNot {

	public static void main(String[] args) {
		int count = 0;
System.out.print("Enter the Number :");
Scanner sc = new  Scanner (System.in);
int num = sc.nextInt();
for(int i =1;i<=num;i++) {
	if(num%i==0) {
		count++;
	}
	else {
//		count =0;
	}
}
//System.out.println(count);
if(count==2) {
	System.out.println("The  Number is Prime");
}
else {
	System.out.println("The Number is Not Prime");
}

	}

}
