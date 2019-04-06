/*
 * Authors: Dustin Kendall & Austin Richardson
 * University: Purdue Northwest
 * Instructor: Professor Yang
 * Class: ECE 251 Object Oriented Programming
 */
package pos;

/**
 *This class contains the specifications for drink class.
 */

public class Drink extends Item{
   
   
    private Size s;
    public Drink(Size inputSize){
    s=inputSize;
    switch(s)
    {
        case KID:
            super.setPrice(1.19f);
            super.setItemName("Kids Drink");
            break;//Unused kept for legacy record. Only size available are Sm M L XL.
        case SMALL:
            super.setPrice(1.34f);
            super.setItemName("Small Drink");
            break;
        case MEDIUM:
            super.setPrice(1.89f);
            super.setItemName("Medium Drink");
            break;
        case LARGE:
            super.setItemName("Large Drink");
            super.setPrice(2.19f);
            break;
        case XLARGE:
            super.setItemName("Extra Large Drink");
            super.setPrice(2.89f);
            break;
        default:
            break;
    }
    
        
    }
    
}
