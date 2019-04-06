/*
 * Authors: Dustin Kendall & Austin Richardson
 * University: Purdue Northwest
 * Instructor: Professor Yang
 * Class: ECE 251 Object Oriented Programming
 */
package pos;

/**
 *
 * @author dkend
 */
public class MainDish extends Item {
    private Dish d;
    private String dishName;
    private float dishPrice;
    
    public MainDish(Dish inputDish) {
    	d = inputDish;
    	switch(d) {
    	case BURGER:
    		super.setPrice(3.49f);
    		super.setItemName("Burger");
                break;
    	case OTHERSANDWICH:
    		super.setPrice(4.07f);
    		super.setItemName("Sandwich");
                break;
    	case SALAD:
    		super.setPrice(2.94f);
    		super.setItemName("Salad");
                break;
    	case WRAP:
    		super.setPrice(7.02f);
    		super.setItemName("Wrap");
                break;
    	default:
    		break;
    	}
    }
    public void addExtraSauce() {
    	//Extra sauce is 20 cents. We add the string "Extra Sauce" to the name too so it shows up on the receipt
    	setItemName(getItemName() + " Extra Sauce");
    	extraPrice(0.20f);
    }
    public void addExtraMeat() {
    	//Add extra charge to price; also add "Extra " + Meat m to name.
    	//Also need to add enumerated type Meat to Item class.
    }
    
}
