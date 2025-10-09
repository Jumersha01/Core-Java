package problems;

public class TvSetProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tvSetPrice = 32500;
		double profit = 0.27*32500;
		double gst = 0.05*(tvSetPrice+profit);
	   System.out.println("Total Selling Price is :"+(tvSetPrice+profit+gst));
	   System.out.println("The Profit is : "+profit);
	   System.out.println("Total GST Charged : "+gst);
	   
				}

}
