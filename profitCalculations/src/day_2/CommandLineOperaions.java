package day_2;

public class CommandLineOperaions {
 public static void main(String [] args) {
	 
	 
	 if(args.length-1>=0) {
		 int sum =0;
		 for(int i =0;i<args.length;i++) {
			 int num = Integer.parseInt(args[i]);
			 if(args.length==1) {
				  System.out.println("Square of Number is "+(num*num));
			  }
			 else if(args.length==2) {
				 int num1 =Integer.parseInt(args[0]);
				 int num2 =Integer.parseInt(args[1]);
				  System.out.println("Sum of Number is "+(num+num));
				  System.out.println("Sum of Number is "+(num1*num2));
				  break;
			  }
			 else {
				
				 sum+=Integer.parseInt(args[i]);
				
				 
				
			 }
			
			 
		 }
		  System.out.println("Sum of all Numbets is "+sum);
		
		 
	 }
	 else {
		 System.out.println("NO Arguments Provided");
	 }
 }
}
