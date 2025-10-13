package exam;

public class Discount {
//	int discount;
   public static String calculateDiscount( String name,double billAmount) {
	   double org = billAmount;
	   if(billAmount>=5000) {
		   billAmount-=0.20*5000;
	   }
	   else if(billAmount>=3000) {
		   billAmount-=0.15*5000;
	   }
	   else {
		   billAmount-=0.10*5000;
	   }
	   return "Customer Name:"+name+"\n"+"Original Bill :"+org+"\n"+"Amount Payable After Discount:"+billAmount;
   }
}
