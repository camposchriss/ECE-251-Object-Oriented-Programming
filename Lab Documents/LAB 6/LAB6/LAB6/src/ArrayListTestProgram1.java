import java.util.ArrayList;
public class ArrayListTestProgram1 {
public static void main(String args[]) {
int[] numbersArray = new int[10];
 ArrayList<Integer> numbersArrayList = new ArrayList<>(10);
 numbersArray[0] = 56;
 numbersArray[1] = 78;
 numbersArray[2] = 90;
 numbersArray[3] = 12;
 numbersArray[4] = 23;
 numbersArrayList.add(56);
 numbersArrayList.add(78);
 numbersArrayList.add(90);
 numbersArrayList.add(12);
 numbersArrayList.add(23);
 System.out.println("The array looks like this: " + numbersArray);
System.out.println("It has " + numbersArray.length + " elements in it");
System.out.println("The 5th element in it is: " +numbersArray[4]);
System.out.println("\nThe arrayList looks like this: " + numbersArrayList);
System.out.println("It has " + numbersArrayList.size() + " elements in it");
System.out.println("The 5th element in it is: " +numbersArrayList.get(4));


}
}