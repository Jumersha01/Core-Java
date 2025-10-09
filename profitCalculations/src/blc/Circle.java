package blc;

public class Circle {
public static String getArea(double radius) {
	final  double PI =13.14;
	double areaOfCircle=0;
	if(radius<=0) {
		return ""+-1;
	}
	else {
		areaOfCircle = PI*radius*radius*radius;
	}
	return ""+areaOfCircle;
}
}
