import java.math.BigInteger;

public class Factorial {
	
	public static void main(String args[]) {
		System.out.println("Factorial of 1000 is " + fact(50));
		
	}
	
	public static BigInteger fact (long n) {
		if(n >= 1) {
			return BigInteger.valueOf(n).multiply(fact(n-1));
		} else {
			return BigInteger.ONE;
		}
	}
	

}
