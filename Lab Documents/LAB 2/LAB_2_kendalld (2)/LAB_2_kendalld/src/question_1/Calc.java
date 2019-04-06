package question_1;

public class Calc {
	public static double addition(double a, double b) {
		double c = a+b;
		return c;
		
	}
	public static double subtraction(double a, double b) {
		double c = a-b;
		return c;
		
	}
	public static double multiplication(double a, double b ) {
		double c = a*b;
		return c;
	}
	
	public static double division(double a, double b) {
		
		if (b==0) {
			System.out.println("You can't divide by 0!!!");
		}
		double c = a/b;
		return c;
	}
}
