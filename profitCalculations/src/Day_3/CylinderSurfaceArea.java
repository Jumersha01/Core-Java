package Day_3;

public class CylinderSurfaceArea {

	public static void main(String[] args) {
		final double PI = 3.14;
		double radius = Double.parseDouble(args[0]);
		double height = Double.parseDouble(args[1]);
		double surface = (2*PI*radius*radius)+(2*PI*radius*height);
		System.out.println("Total Surface Area = "+surface);
		
	}

}
