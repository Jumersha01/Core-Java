package problems;

public class SimpleIntrest {
public static void main(String []args) {
	int P = Integer.parseInt(args[0]);
    float R = Float.parseFloat(args[1]);
    int T = Integer.parseInt(args[2]);

    float SI = (P * R * T) / 100;
    float Amount = P + SI;

    System.out.println("Simple Interest: " + SI);
    System.out.println("Amount: " + Amount);
}
}
