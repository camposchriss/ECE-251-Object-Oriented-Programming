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
public class Reciept /*extends Order reciept is not an order*/
{   
    private String s;// String which Identifies the specific file
    PrintWriter reciept2;//represents the file that reciept object prints to
    Order currentOrder;//Current Order for reciept
    public void Reciept(Order currentOrder){
        s = "RecieptOrder"+currentOrder.getOrderNumber();//Concatenate to create file name.
        try{
        reciept2 = new PrintWriter(new FileOutputStream(s+".txt"));
        }
        catch(FileNotFoundException e){
            //do nothing
        }
        this.currentOrder = currentOrder;
    }
 
    public void printReciept()
    {
     reciept2.println("Welcome to Scotty Pippen's Burgers");
     reciept2.println("----------------------------");
     reciept2.println(currentOrder.getTime());
     
     for(Item i : currentOrder.getItems()){
         String itemName = i.getName();
         float price = i.getPrice();
         reciept2.printf("%-13s  %5.2f",itemName,price);
     }
     reciept2.printf("               Subtotal  %-5.2f", currentOrder.getTotal());
     reciept2.printf("                    Tax  %-5.2f", currentOrder.getTotal()*0.07);
     reciept2.printf("                  Total  %-5.2f", currentOrder.getTotal()*1.07);
     reciept2.println("----------------------------");
     reciept2.printf("Order number %-5d", currentOrder.getOrderNumber());
    }
    /*private float price;//total price of order
    static private GregorianCalendar time = new GregorianCalendar();//calendar object used within class to create transAction time
    private Date transTime;*/
    
    
   /* Reciept o1 = new Reciept(order);
    o1.printRec()*/
    
}
