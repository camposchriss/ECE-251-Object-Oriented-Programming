
public class ArrayTestProgram1 {

	public static void main(String[] args) {
	//QUESTION 1	
		int total = 0;
		//int[] numbers = null;
		//numbers = null;
		//int[] numbers = new Array[]; Do not work mismatched data types
		//int[] numbers = new Array[0];-- ARRAY IS NOT A DATA TYPE
		//int[] numbers = new Integer[];
		//int[] numbers = new Integer[0];
		//int[] numbers = new int[];
		
		/*
		int[] numbers = new int[12];
		numbers[0] = 1;
		numbers[1] = 45;
		numbers[2] = 23;
		numbers[3] = 87;
		numbers[4] = 89;
		numbers[5] = 213;*/
		//NOW USE SINGLE LINE OF CODE TO DO SAME INITIALIZATION
		int[] numbers = {1, 45, 23, 87, 89, 213, 54, 11, 76, 98, 23, 5};
		
		
		/*System.out.println("The array looks like this: " + numbers);
		System.out.println("It has " +numbers.length + " elements in it");
		System.out.println("The 5th element in it is: "+ numbers[4]);*/
		
		for(int i=0;i<numbers.length; i++) {
			total+=numbers[i];
		}
		System.out.println("The total is "+total);

	}

}
