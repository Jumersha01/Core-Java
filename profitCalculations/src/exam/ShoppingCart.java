package exam;
import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the customer name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Total Bill Amount :");
	int amount = Integer.parseInt(sc.nextLine());
		System.out.println(Discount.calculateDiscount(name,amount));

	}

}
