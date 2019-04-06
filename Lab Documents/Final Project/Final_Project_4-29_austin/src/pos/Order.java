/*
 * Author: Dustin Kendall
 * University: Purdue Northwest
 * Instructor: Professor Yang
 * Class: ECE 251 Object Oriented Programming
 */
package pos;
import java.util.*;
import java.io.Serializable;


/**
 *
 * @author dkend
 */
public class Order implements Serializable{
    
   private ArrayList<Item> invoiceItems = new ArrayList<>(6);
   private float total = 0.0f;//total price of order
   private static GregorianCalendar time = new GregorianCalendar();//calendar object used within class to create transAction time
   private Date transTime;
   static int orders = 100;//static variable used to keep track of separate orders and incremented
   private int orderNum;
   
   
   public Order(){
       transTime = time.getTime();
       orderNum = orders++;
   }
   public Order(ArrayList<Item> itm){
       this();
       invoiceItems = itm;
       for(Item i: itm ){
           total+=i.getPrice();
       }   
   }
   public ArrayList<Item> getInvoiceItems(){ return invoiceItems;}
   public float getTotal(){return total;}
   public int getOrderNumber(){return orderNum;}
   public Date getTime(){return transTime;// Returns transaction time.
   }
   public void addItem(Item i){
       invoiceItems.add(i);
       total+=i.getPrice();   
   }//Adds specific Item to total adds item's price to total price of order
   public void removeItem(Item i){
       total-=i.getPrice();
       invoiceItems.remove(i);
       
   }//Removes Specific Item
   public void removeItem(int i){
       total-=invoiceItems.get(i).getPrice();
       invoiceItems.remove(i);
       
   }
   public void updateTotal(){
       float newPrice = 0;
       for(Item i: invoiceItems)
       {
        newPrice+=i.getPrice();
       }
       total = newPrice;
   }
   public void setOrderNumber(int num) {
	   this.orderNum = num;
   }
  
   
   
   
   
    
    
}
