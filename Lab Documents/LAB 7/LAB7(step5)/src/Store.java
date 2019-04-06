
import java.util.ArrayList;
//import java.io.*;
import java.util.Iterator;

public class Store {
	private String      		 name;
    private ArrayList<Customer>  customers;

    public Store(String n) {
       name = n;
       customers = new ArrayList<Customer>();
    }

    public String getName() { return name; }
    public ArrayList<Customer> getCustomers() { return customers; }

    public void addCustomer(Customer c) {
    	customers.add(c);

    }
    //record the purchase from a customer, and add the customer in the store record.
	public void recordPurchase(Customer c, float price) {
		if(c.getMoney()<price) {
			customers.add(c);
			c.setMoney(c.getMoney()-price);
		}
		else {
			System.out.println("Customer doesn't not have enough money");
		}
		
    }

    // List the customers
    public void listCustomers() {
    	for (Customer c: customers)
    		System.out.println(c);
    }

    // Returns a new arraylist of all customers of the store that have the
    // same sex as the one specified in the parameter.
	public ArrayList<Customer> getCustomersOfSex(char sex) {
		ArrayList<Customer> sexCust = new ArrayList<>(10);
		for(Customer rC : customers)
		{
			if(rC.getSex()==sex) {
				sexCust.add(rC);
			}
		}
		return sexCust;

	}

    // Remove all customers from the store that are broke (i.e., have < $10)
	public void removeBrokeCustomers() {
		Iterator<Customer> rC = customers.iterator();
		while(rC.hasNext()) {
			if((rC.next()).getMoney()<10)
			{
				rC.remove();
			}
		}

	}


    // Return all customers in the store that have the same sex and are within the
    // same age group (i.e., +- 3 years of age) as the one specified.
	public ArrayList<Customer> friendsFor(Customer match) {
	int	upLimit = match.getAge()+3;
	int	lowLimit = match.getAge()-3;
		ArrayList<Customer> friends = new ArrayList<>(10);
		for(Customer rC : customers) {
			if((rC.getSex()==match.getSex())&&rC.getAge()<=upLimit&&rC.getAge()>=lowLimit&&!(rC.equals(match)))
			{
				friends.add(rC);
			}
		}
		return friends;

	}
	//Saves stores customers all in one file. Uses customer's save To method
	public void saveTo(java.io.PrintWriter aFile) throws
	java.io.IOException { 
		for(Customer c : customers) {
			c.saveTo(aFile);
		}
	}
	//Read all customers from store file
	public static Store readFrom(java.io.BufferedReader aFile)
			throws java.io.IOException {
			//Do not need?//BufferedReader in = new BufferedReader(aFile);
			Store s = new Store("?");
			while (aFile.ready()) {
			s.addCustomer(Customer.readFrom(aFile));
			// Now read in a customer from the file and add him/her
			//to the store
			}
			return s;
			}
	


}