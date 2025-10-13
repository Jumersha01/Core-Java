package blc;

public class Product {
	int productId;
	String productName;
	double productPrice;
	public void setProductInfo(int id,String name,double price) {
		productId=id;
		productName=name;
		productPrice=price;
		}
	public void getProductInfo() {
		System.out.println("The name of the product is :"+productName);
		System.out.println("The id of the product is :"+productId);
		System.out.println("The price of the product is :"+productPrice);
	}
	

}
