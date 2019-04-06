
import java.io.FileOutputStream;
import java.io.*;

public class CustomerTestProgram {
	public static void main(String args[]) throws IOException {
		
			
			Customer c1 = new Customer("Amie", 14, 'F', 100);
			Customer c2 = new Customer("Brad", 15, 'M', 0);
			
		   /*FileOutputStream out = new FileOutputStream("customer1.txt");
		    out.write('b');
		    out.close();*/
			//Step 1 A-D
		    /*DataOutputStream out = new DataOutputStream(new FileOutputStream("customer1.txt"));
		    out.writeUTF(c1.getName());
		    out.writeInt(c1.getAge());
		    out.close();
		    DataOutputStream out2 = new DataOutputStream(new FileOutputStream("customer2.txt"));
		    out2.writeUTF(c2.getName());
		    out2.writeInt(c2.getAge());
		    out2.writeChar(c2.getSex());
		    out2.writeDouble(c2.getMoney());
		    out2.close();
		    */
		    try {
		    	DataOutputStream out;
		    	out = new DataOutputStream(new
		    	FileOutputStream("customer1.txt"));
		    	c1.saveTo(out);
		    	out.close();
		    	out = new DataOutputStream(new
		    	FileOutputStream("customer2.txt"));
		    	c2.saveTo(out);
		    	out.close();
		    	} catch (FileNotFoundException e) {
		    	// Do Nothing
		    	} catch (IOException e) {
		    	// Do Nothing
		    	}
	
			try {
					DataInputStream in;
					in = new DataInputStream(new
					FileInputStream("customer1.txt"));
					System.out.println(Customer.readFrom(in));
					in.close();
					in = new DataInputStream(new
					FileInputStream("customer2.txt"));
					System.out.println(Customer.readFrom(in));
					in.close();	
					} catch (FileNotFoundException e) {
		// Do Nothing
					} catch (IOException e) {
		// Do Nothing
					}
			try {
				DataOutputStream out = new DataOutputStream( new FileOutputStream("customers.txt"));
				
				c1.saveTo(out);
				c2.saveTo(out);
				out.close();
				} catch (FileNotFoundException e) {
				// Do Nothing
				} catch (IOException e) {
				// Do Nothing
				}
			try {
				DataInputStream in = new DataInputStream(new FileInputStream("customers.txt"));
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
				DataOutputStream out = new DataOutputStream(new FileOutputStream("store.txt"));
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
				DataInputStream in = new DataInputStream(new
				FileInputStream("store.txt"));
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


