package day_2;

public class ConcatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String result = "";
        for(int i =0;i<args.length;i++){
        	  result += args[i];
        }
        System.out.println("Concatenated String: " + result);
	}

}
