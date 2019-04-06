package customer_lab3;

public class CustomerTestProgram {
	public static void main(String args[])
	{
		
		//STEP 1
		
		//Customer c;
		//Customer c = null;
		//System.out.println(c);
		//Customer c = new Customer();
		////System.out.println(c.toString);
		/*Prints out memory address of Customer object 
		 * c */
		
		//Customer c1= new Customer();
		//Customer c2  = new Customer();
		//Customer c3 = new Customer();
		
		//System.out.println(c1);
		//System.out.println(c2);
		//System.out.println(c3);
		/*Notice while executing it default to using the .toStirng() method. */
		
		/*STEP 2*/
		/*Customer c = new Customer();
		c.name = "Bob";
		c.age = 27;
		c.money = 50;
		c.sex = 'M';
		
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.money);
		System.out.println(c.sex);*/
		
		//STEP 3
		/*Customer c = new Customer();
		c.money = 50;
		System.out.println(c.money);
		c.spend(10);
		c.spend(4.75f);
		c.spend(15.25f);//Now must add spend() method to Customer class
		//Try to spend more than customer has
		c.spend(30);
		System.out.println(c.money);*/
		
		//STEP 4
		/*Customer c1 = new Customer();
		c1.money = 50;
		Customer c2 = new Customer();
		System.out.println("Before giving....");
		System.out.println("c1 has $"+ c1.money);
		System.out.println("c2 has $" +c2.money);
		c1.give(c2, 23.75f);//when changed to c1.give(c1, 23.7f) the customer gives himself money.
		System.out.println("After giving...");
		System.out.println("c1 has $"+ c1.money);
		System.out.println("c2 has $" +c2.money);
		*/
            //Step 5
            
            /*
                Customer c1 = new Customer();
                c1.name = "Bob";
                c1.age = 18;
                Customer c2 = new Customer();
                c2.name = "Dottie";
                c2.age = 3;
                Customer c3 = new Customer();
                c3.name = "Steve";
                c3.age = 68;
                Customer c4 = new Customer();
                c4.name = "Jane";
                c4.age = 66;
                
                System.out.println("The fee for Bob is $" + c1.computeFee());
                System.out.println("The fee for Dottie is $" + c2.computeFee());
                System.out.println("The fee for Steve is $"+c3.computeFee());
                System.out.println("The fee for Jane is $" + c4.computeFee());
             */
            
            
//Step 6
/*
Customer c1 = new Customer();
c1.name = "Bob";
c1.age = 17;
c1.money = 10;
Customer c2 = new Customer();
c2.name = "Dottie";
c2.age = 3;
c2.money = 0;
Customer c3 = new Customer();
c3.name = "Steve";
c3.age = 67;
c3.money = 30;
Customer c4 = new Customer();
c4.name = "Jane";
c4.age = 64;
c4.money = 0;

System.out.println("Here is the situation before going into the circus:");
System.out.println(" Bob has $" + c1.money);
System.out.println(" Dottie has $" + c2.money);
System.out.println(" Steve has $" + c3.money);
System.out.println(" Jane has $" + c4.money);
// Simulate people going into the circus
c1.payAdmission();
c2.payAdmission();
c3.payAdmission();
c4.payAdmission();
c3.give(c4, 15);
c4.payAdmission();
System.out.println("Here is the situation after going into the circus:");
System.out.println(" Bob has $" + c1.money);
System.out.println(" Dottie has $" + c2.money);
System.out.println(" Steve has $" + c3.money);
System.out.println(" Jane has $" + c4.money);
            
*/      
//Step 7
/*            
Customer c = new Customer();
c.money = 50;
System.out.println(c.money);

    if (!c.spend(10))

        System.out.println("Unable to spend $10");

    if (!c.spend(4.75f))

        System.out.println("Unable to spend $4.75");

    if (!c.spend(15.25f))

        System.out.println("Unable to spend $15.25");

    if (!c.spend(100))

           System.out.println("Unable to spend $100");
           System.out.println(c.money);

    if (!c.spend(100))

            System.out.println("Unable to spend $100");
	*/	
            
//Step 8
            
    Customer c1 = new Customer();
c1.name = "Bob";
c1.age = 17;
c1.money = 10;
Customer c2 = new Customer();
c2.name = "Dottie";
c2.age = 3;
c2.money = 0;
Customer c3 = new Customer();
c3.name = "Steve";
c3.age = 67;
c3.money = 30;
Customer c4 = new Customer();
c4.name = "Jane";
c4.age = 64;
c4.money = 0;

System.out.println("Here is the situation before going into the circus:");
System.out.println(" Bob has $" + c1.money);
System.out.println(" Dottie has $" + c2.money);
System.out.println(" Steve has $" + c3.money);
System.out.println(" Jane has $" + c4.money);
// Simulate people going into the circus
c1.payAdmission();
System.out.println(c1.admitted);

c2.payAdmission();
System.out.println(c2.admitted);
c3.payAdmission();
System.out.println(c3.admitted);
c4.payAdmission();
System.out.println(c4.admitted);
c3.give(c4, 15);
c4.payAdmission();
System.out.println(c4.admitted);
System.out.println("Here is the situation after going into the circus:");
System.out.println(" Bob has $" + c1.money);
System.out.println(" Dottie has $" + c2.money);
System.out.println(" Steve has $" + c3.money);
System.out.println(" Jane has $" + c4.money);
	}

}
