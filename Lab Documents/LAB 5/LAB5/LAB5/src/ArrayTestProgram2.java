
public class ArrayTestProgram2 {

	public static void main(String[] args) {
			int count =0;
			boolean[] values = {true, false, false, true ,true ,true, false,false};

			for (int i = 0; i< values.length; i++)
			{
				if(values[i])
					count++;
				
			}
			
			if(count>values.length/2)
				System.out.println("True");
			
			else
				System.out.println("False");
	}

}
