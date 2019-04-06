/*
 * Authors: Dustin Kendall & Austin Richardson
 * University: Purdue Northwest
 * Instructor: Professor Yang
 * Class: ECE 251 Object Oriented Programming
 */
package pos;
import java.util.*;
//import pos.Item;


/**
 *
 * @author dkend
 */
public class TestClass {
   public static void main(String args[]){
        MainDish item1 = new MainDish(Item.Dish.BURGER);
        Drink item2 = new Drink(Item.Size.LARGE);
        Side item3 = new Side(Item.Size.LARGE, Item.SideOption.FRY);
        Order o1  = new Order();
        o1.addItem(item1);
        o1.addItem(item2);
        o1.addItem(item3);
        ArrayList<Item> order2items = new ArrayList<>(o1.getInvoiceItems());
        Order o2 = new Order(order2items);
        System.out.println("Order 1 is"+ o1);
        System.out.println("Order 2 is" + o2);
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
    }
    
}
