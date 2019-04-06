package lab1_question6_kendalld;
import java.util.Scanner;

public class Robot {
	Scanner sc = new Scanner(System.in);
//initial x position of the robot
	public double x() {
		double x = sc.nextDouble();
		return x;
		
	}
	
//initial y position of the robot
	public double y() {
		double y = sc.nextDouble();
		return y;
		
	}
//distance robot has traveled
	public double d() {
		System.out.println("Please enter the distance the robot travelled ");
		double d = sc.nextDouble();
		return d;
	}
//degrees in radians from the x axis	
	public double degs() {
		double degrees = sc.nextDouble();
		while (degrees>360&&degrees<0)
		{
			degrees = sc.nextDouble();	
		}
		return degrees;
		
	}
	
}
