package elc;
import blc.RoundedSum;
import java.util.Scanner;

public class Rounded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner (System.in);
         System.out.print("Entter the value of a :");
         int a  = Integer.parseInt(sc.nextLine()); 
         System.out.print("Entter the value of b :");
         int b  = Integer.parseInt(sc.nextLine());
         
         System.out.print("Entter the value of c :");
         int c = Integer.parseInt(sc.nextLine());
         int sum  = RoundedSum.sumOfRoundedValues(a, b, c);
         System.out.println("The sum is:"+sum);
	}
}