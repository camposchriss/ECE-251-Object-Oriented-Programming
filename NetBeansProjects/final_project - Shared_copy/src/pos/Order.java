/*
 * Author: Dustin Kendall
 * University: Purdue Northwest
 * Instructor: Professor Yang
 * Class: ECE 251 Object Oriented Programming
 */
package pos;
import java.util.*;

/**
 *
 * @author dkend
 */
public class Order {
    
   private ArrayList<Item> invoiceItems = new ArrayList<>(6);
   private float total;//total price of order
   static private GregorianCalendar time = new GregorianCalendar();//calendar object used within class to create transAction time
   private Date transTime;
   static int orderNumber = 100;
   
   
    
    
}
