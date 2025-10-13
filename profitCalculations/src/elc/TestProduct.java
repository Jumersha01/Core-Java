package elc;
import java.util.Scanner;

import blc.Product;
public class TestProduct {

	public static void main(String[] args) {
		Product p1 =new Product();
		
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the id of the Product :");
 int id = Integer.parseInt(sc.nextLine());
 
 System.out.println("Enter the name of the Product :");
 String name = sc.nextLine();
 
 System.out.println("Enter the price of the Product :");
 double price = Double.parseDouble(sc.nextLine());
 
	p1.setProductInfo(id,name,price);
		p1.getProductInfo();
	

	}

}
