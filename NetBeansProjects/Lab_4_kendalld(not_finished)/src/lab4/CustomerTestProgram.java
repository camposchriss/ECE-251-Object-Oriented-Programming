/*
 *Main test .java file. Used to experiment with methods and classes by using the main method. 
This program was written by Dustin J Kendall for ECE 251

 */
package lab4;
/*
public class CustomerTestProgram {
public static void main(String args[]) {
 Customer c1 = new Customer("Bob");

 c1.age = 17;
 c1.sex = 'M';
 c1.money = 10;
 c1.admitted = false;
 Customer c2 = new Customer("Dottie");

 c2.age = 3;
 c2.sex = 'F';
 c2.money = 0;
 c2.admitted = false;
 Customer c3 = new Customer("Jane");
 System.out.println("Bob looks like this: " + c1.name);
 System.out.println("Dottie looks like this: " + c2.name);
 System.out.println("Customer 3 looks like this: " + c3.name);

}
}*/


 public class CustomerTestProgram {
 public static void main(String args[]) {
     //TOTAL OF STEP 3
 /*Customer c1 = new Customer("Bob", 17, 'M');
 Customer c2 = new Customer("Dottie", 3, 'F', 10, true);
 Customer c3 = new Customer("Jane");// Jane returns male becasue
 //she was set a defualt value
 Customer c4 = new Customer();
 System.out.println("Bob looks like this: " + c1);
 System.out.println("Dottie looks like this: " + c2);
 System.out.println("Jane looks like this: " + c3);
 System.out.println("Customer 4 looks like this: " + c4);
*/
Customer c = new Customer();
c.setName("Steve");
 c.setMoney(20);
 c.setAdmitted (true);
 c.deny();
c.toggleAdmission();
 System.out.println(c.getAdmitted());
 
 System.out.println(c.getName());
 System.out.println(c.getMoney());
 System.out.println(c.getAdmitted());
 }
}
 
 
 
 

