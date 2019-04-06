/*
 * Authors: Dustin Kendall & Austin Richardson
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
    
public String itemName;
public enum Size { DEFAULT,KID,SMALL,MEDIUM,LARGE,XLARGE};
public enum Dish {BURGER, OTHERSANDWICH, SALAD, WRAP};
public enum SideOption {FRY, FRUIT, BAGCHIPS, HASHBROWNS};


private float price;// Item price

public float getPrice(){ return price;}

public void setPrice(float p){ price = p;}

public void extraPrice(float p){ price +=p;};

public String getItemName(){return itemName;}
public void setItemName(String s) {itemName = s;}

}


