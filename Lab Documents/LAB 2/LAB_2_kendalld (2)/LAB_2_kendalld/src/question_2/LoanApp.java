package question_2;
import java.util.*;

public class LoanApp {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		GregorianCalendar today = new GregorianCalendar();
		//Create scanner and date objects for use in main function
		double principle;//amount of the original loan
		int term;//length of the loan in months
		double annualInterestRate;//interest rate for the loan
		
		//declare new object of class LoanCalc
		LoanCalc newLoan = new LoanCalc();
		System.out.println("Welcome to the Purdue University Northwest Loan Calculator \nToday is: " + today.getTime() );
		System.out.println("==============================================================================");
		System.out.println("Enter the principle of the loan: ");
		principle = sn.nextDouble();
		while(principle <=0)
		{
			System.out.println("Please enter a valid loan amount: ");
			principle = sn.nextDouble();
			
		}
		System.out.println("Enter the interest rate in the form of a double (i.e. 1-100): ");
		annualInterestRate = sn.nextDouble();
		while(annualInterestRate<=0||annualInterestRate>100)
		{
			System.out.println("Please enter a valid annual percentage rate (i.e. 1-100): ");
			annualInterestRate = sn.nextDouble();
		}
		System.out.println("Enter the term in months: ");
		term = sn.nextInt();
		while(term<=0) {
			System.out.println("Please enter a valid term in months(i.e. 1-?): ");
			term = sn.nextInt();
		}
		sn.close();
		newLoan.displaySchedule(principle, annualInterestRate, term);
		
		
	}

}
