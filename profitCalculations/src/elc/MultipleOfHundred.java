package elc;
import blc.NextMultipleOfHundred;
import java.util.*;

public class MultipleOfHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc  =new Scanner (System.in);
         System.out.print("Enter the Number:");
         int n = Integer.parseInt(sc.nextLine());
         int multipleOfHundred = NextMultipleOfHundred.getNextMultipleOfHundred(n);
         System.out.println("The Multiple of Hundred is:"+multipleOfHundred);
	}

}
