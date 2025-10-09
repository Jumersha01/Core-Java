package problems;

public class DiscountNetBill {

	public static void main(String[] args) {
	int purchaseAmount = Integer.parseInt(args[0]);
	double amount_payable=0;
	int desc = 0;
	double discountedPrice=0.0;
	if(purchaseAmount<5000) {
		discountedPrice = 0.05*purchaseAmount;
		desc = 5;
		amount_payable =(purchaseAmount-discountedPrice);
	}
	else if(purchaseAmount>=5000&&purchaseAmount<=9999) {
		discountedPrice = 0.10*purchaseAmount;
		amount_payable =(purchaseAmount-discountedPrice);
		desc=10;
	}
	else {
		discountedPrice = 0.15*purchaseAmount;
		amount_payable =(purchaseAmount-discountedPrice);
		desc=15;
	}
	System.out.printf("Discount : %d%% \n Discount Amount : %.2f \n Amount Payable %.2f",desc,discountedPrice,amount_payable);

	}

}
