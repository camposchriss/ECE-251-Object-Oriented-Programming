/*
 * Author: Dustin Kendall
 * University: Purdue Northwest
 * Instructor: Professor Yang
 * Class: ECE 251 Object Oriented Programming
 */
package pos;

/**
 *
 * // Abstract class created for menu Items Drink, Side, Main Dish.
 */
public abstract class Item {
    
public String name;
public enum Size { KID,SMALL,MEDIUM,LARGE,XLARGE};
//public enum Pop { SPRITE,COKE,DIETCOKE,MTNDEW,HIC,WATER};
//Does not need to specify drink to identify price

private float price;// Item price

public float getPrice(){ return price;}

public void setPrice(float p){ price = p;}

public String getName(){ return name; }

}


