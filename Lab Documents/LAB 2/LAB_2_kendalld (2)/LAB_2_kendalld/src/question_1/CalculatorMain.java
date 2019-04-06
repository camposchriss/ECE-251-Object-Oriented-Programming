package question_1;
import java.util.*;
public class CalculatorMain {

	public static void main(String[] args) {
		//initialize a new scanner object to accept user input
		Scanner sn= new Scanner(System.in);
		double firstD, secondD, answer;
		int operation;
		do
		{
		//Determine operators for function and  determine operands. 
		System.out.println("Example 1\r\n" + 
				"=======================================================\r\n" + 
				"Welcome to Purdue University Northwest's calculator!\r\n" + 
				"1 - Addition\r\n" + 
				"2 - Subtraction\r\n" + 
				"3 - Multiplication\r\n" + 
				"4 - Division\r\n" + 
				"5 - Exit\r\n" + 
				"Which operation do you want to perform: ");
		operation = sn.nextInt();
		//While loop provides user input validation as well and an exit code when 5 is selected. 
		while(operation > 5 || operation <1)
		{
			System.out.println("Please enter a valid option: ");
			operation = sn.nextInt();
		}
		if(operation!= 5)
		{
			
		
		System.out.println("What is your first operand: ");
		firstD = sn.nextDouble();
		System.out.println("What is your second operand: ");
		secondD = sn.nextDouble();
		
		//Determine which method to use to get to answer.
	switch(operation) {
		case 1: answer = Calc.addition(firstD,secondD);
		break;
		case 2: answer = Calc.subtraction(firstD, secondD);
		break;
		case 3: answer = Calc.multiplication(firstD, secondD);
		break;
		case 4: answer = Calc.division(firstD, secondD);
		break;
		default:answer = 0;
		}
	//Print out answer for the operation.
		System.out.println("The result is: "+answer);
		}
		}while(operation!=5);
		
		System.out.println("Thank you for using purdue's calculator");
		sn.close();
		return;
	}

}
