
import java.io.FileWriter;
import java.io.*;

public class CustomerTestProgram {
	public static void main(String args[]) throws IOException {
		
			
			Customer c1 = new Customer("Amie", 14, 'F', 100);
			Customer c2 = new Customer("Brad", 15, 'M', 0);
			
		   /*FileWriter out = new FileWriter("customer1.txt");
		    out.write('b');
		    out.close();*/
			//Step 1 A-D
		    /*PrintWriter out = new PrintWriter(new FileWriter("customer1.txt"));
		    out.writeUTF(c1.getName());
		    out.writeInt(c1.getAge());
		    out.close();
		    PrintWriter out2 = new PrintWriter(new FileWriter("customer2.txt"));
		    out2.writeUTF(c2.getName());
		    out2.writeInt(c2.getAge());
		    out2.writeChar(c2.getSex());
		    out2.writeDouble(c2.getMoney());
		    out2.close();
		    */
		    try {
		    	PrintWriter out;
		    	out = new PrintWriter(new
		    	FileWriter("customer1.txt"));
		    	c1.saveTo(out);
		    	out.close();
		    	out = new PrintWriter(new
		    	FileWriter("customer2.txt"));
		    	c2.saveTo(out);
		    	out.close();
		    	} catch (FileNotFoundException e) {
		    	// Do Nothing
		    	} catch (IOException e) {
		    	// Do Nothing
		    	}
	
			try {
					BufferedReader in;
					in = new BufferedReader(new
					FileReader("customer1.txt"));
					System.out.println(Customer.readFrom(in));
					in.close();
					in = new BufferedReader(new
					FileReader("customer2.txt"));
					System.out.println(Customer.readFrom(in));
					in.close();	
					} catch (FileNotFoundException e) {
		// Do Nothing
					} catch (IOException e) {
		// Do Nothing
					}
			try {
				PrintWriter out = new PrintWriter( new FileWriter("customers.txt"));
				
				c1.saveTo(out);
				c2.saveTo(out);
				out.close();
				} catch (FileNotFoundException e) {
				// Do Nothing
				} catch (IOException e) {
				// Do Nothing
				}
			try {
				BufferedReader in = new BufferedReader(new FileReader("customers.txt"));
				System.out.println(Customer.readFrom(in));
				System.out.println(Customer.readFrom(in));
				in.close();
				} catch (FileNotFoundException e){
				// Do Nothing
				} catch (IOException e){
				// Do Nothing
				}
			Store walmart = new Store("Walmart");
			walmart.addCustomer(c1);
			walmart.addCustomer(c2);
			
			try {
				PrintWriter out = new PrintWriter(new FileWriter("store.txt"));
				walmart.saveTo(out);
				out.close();
				}
				catch (FileNotFoundException e){
				// Do Nothing
				}
				catch (IOException e){
				// Do Nothing
				}
			try {
				BufferedReader in = new BufferedReader(new
				FileReader("store.txt"));
				walmart = Store.readFrom(in);
				in.close();
				} catch (FileNotFoundException e) {
				// Do Nothing
				} catch (IOException e) {
				// Do Nothing
				}
				System.out.println("Here are the customers from the file's Store object:\n");
				walmart.listCustomers();
	}}


