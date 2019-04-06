package question_2;

public class LoanCalc {
	public static double monthlyPayment(double principle, double interestRate, int term) {
		double r = (interestRate/(1200));//Monthly interest rate
		double payment = (principle*r*Math.pow((r+1), term))/(Math.pow((r+1), term)-1);//determines monthly payment from given data
		return payment;
		
	}
	public void displaySchedule(double principle, double interestRate, int term) {
		
		double totalPaid=0;
		double payment = monthlyPayment(principle, interestRate,term);
		double amountRemaining=principle;
		double interestPerMonth=interestRate/(1200);//interest paid per month
		
		System.out.printf("Your monthly payment will be %.2f at a rate of %.2f%% for a loan of the principle $%.2f\n\n\n",payment, interestRate, principle);
		
		System.out.println("Month     Payment      Amount  Remaining\n\n");
		
		
		//For Loop which displays monthly payment and amount remaining on the principle. 
		
		for(int i=1;i<=term;i++)
		{
			double interest=amountRemaining*interestPerMonth;
			amountRemaining = amountRemaining - payment+interest;
			System.out.printf("%-10d%-12.2f%-15.2f\n",i,payment,Math.abs(amountRemaining));
			totalPaid+=payment;
			
			
		}
		System.out.printf("\n\nThe total amount paid on the loan is: %.2f",totalPaid);
		
		
		
	}

}
