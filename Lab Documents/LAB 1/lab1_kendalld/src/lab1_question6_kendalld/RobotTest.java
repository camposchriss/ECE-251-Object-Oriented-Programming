package lab1_question6_kendalld;
import java.lang.Math;

public class RobotTest {

	
	
	public static void main(String[] args) {
		double initX,initY,dist,deg;
		Robot spec = new Robot();
		System.out.println("Please enter the initial x position of the robot\n");
		initX=spec.x();
		
		System.out.println("Please enter the initial y position\n");
		initY=spec.y();
		
		
		dist=spec.d();
		
		System.out.println("Please enter the degrees from the x axis of the direction of travel\n");
		deg=spec.degs();
		
		double newX=(initX+dist*Math.cos((3.14159/180)*deg));
		double newY=(initY+dist*Math.sin((3.14159/180)*deg));
		System.out.println("The current position of the robot is ("+newX+","+newY+")");
		

	}

}
