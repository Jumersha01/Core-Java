package blc;

public class RoundedSum {
   public static int sumOfRoundedValues(int a ,int b,int c) {
	 
//	   return( (int) Math.round((a*1.0)+Math.round( b*1.0)+Math.round(c*1.0)));
	   int a1 = a%10>=5?((a%10+1)*10):a/10*10;
	   int b1 = b%10>=5?((b%10+1)*10):b/10*10;
	   int c1 = c%10>=5?((c%10+1)*10):c/10*10;
	   return a1+b1+c1;
   }
}
