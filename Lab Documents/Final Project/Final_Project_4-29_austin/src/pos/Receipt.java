/*
 * Author: Dustin Kendall
 * University: Purdue Northwest
 * Instructor: Professor Yang
 * Class: ECE 251 Object Oriented Programming
 */
package pos;
import java.util.*;
import java.io.*;
/**
 *
 * @author dkend
 */
public class Receipt
{   
    private String s;// String which Identifies the specific file
    PrintWriter reciept2;//represents the file that receipt object prints to
    Order currentOrder;//Current Order for receipt
    public Receipt(Order cO){
        s = "RecieptOrder"+cO.getOrderNumber();//Concatenate to create file name.
        try{
        reciept2 = new PrintWriter(new FileOutputStream(s+".txt"));
        }
        catch(FileNotFoundException e){
            //do nothing
        }
        this.currentOrder = cO;
    }
 
    public void printReciept()
    {
     reciept2.println("Welcome to Scotty Pippen's Burgers\n");
     reciept2.println("----------------------------\n");
     reciept2.println(currentOrder.getTime());
     reciept2.println("");
     
     for(Item i : currentOrder.getInvoiceItems()){
         String itemName = i.getItemName();
         float price = i.getPrice();
         reciept2.printf("%-18s  %5.2f\n",itemName,price);
         reciept2.println("");
     }
     reciept2.println("");
     reciept2.printf("%-18s  %-5.2f","Subtotal", currentOrder.getTotal());
     reciept2.println("");
     reciept2.printf("%-18s  %-5.2f","Tax", currentOrder.getTotal()*0.07);
     reciept2.println("");
     reciept2.printf("%-18s  %-5.2f","Total", currentOrder.getTotal()*1.07);
     reciept2.println("");
     reciept2.println("----------------------------");
     reciept2.println("");
     reciept2.printf("Order number %-5d\n", currentOrder.getOrderNumber());
     reciept2.close(); //Austin added this on 4/26/18. File never got closed so it didn't get written to.
    }
    /*private float price;//total price of order
    static private GregorianCalendar time = new GregorianCalendar();//calendar object used within class to create transAction time
    private Date transTime;*/
    
    
   /* Reciept o1 = new Reciept(order);
    o1.printRec()*/
    
}
