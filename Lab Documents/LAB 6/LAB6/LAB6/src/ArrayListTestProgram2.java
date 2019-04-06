
	import java.util.ArrayList;
	import java.util.Iterator;
	public class ArrayListTestProgram2 {
	public static void main(String args[]) {
	 ArrayList<Integer> numbersArrayList = new
	ArrayList<Integer>(
	java.util.Arrays.asList(1, 45, 23, 87, 89, 213, 54, 11, 76, 98,
	23, 5));
	System.out.println("The ArrayList looks like this beforehand:" + numbersArrayList);
	/*for (int num: numbersArrayList) {
	if (num%2 != 0)
	 numbersArrayList.remove(num);
	}*/
	Iterator<Integer> numList = numbersArrayList.iterator();
	while(numList.hasNext())
	{
		if((Integer)(numList.next())%2!=0) {
		numList.remove();	
		}
		//i++;
	}
	System.out.println("The ArrayList looks like this afterwards:" + numbersArrayList);
	}
	}


