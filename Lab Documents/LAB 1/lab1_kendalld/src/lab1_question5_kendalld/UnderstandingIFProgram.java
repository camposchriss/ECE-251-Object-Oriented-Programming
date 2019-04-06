package lab1_question5_kendalld;

public class UnderstandingIFProgram {
	private char input;
	private boolean male;
	
	public void question() {
		
		System.out.println("Are you (M)ale or (F)emale ?...");
		input = new java.util.Scanner(System.in).nextLine().charAt(0);
		
		if((input == 'M'||input == 'm'))
			male = true;
		else
			male = false;
		if (male== false)
			System.out.println("Ok, now I know that you are a female.");
		else
			System.out.println("Ok, now I know that you are a male.");
	
	}
	

}
