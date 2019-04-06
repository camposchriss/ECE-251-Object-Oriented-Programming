/*
 * Authors: Dustin Kendall & Austin Richardson
 * University: Purdue Northwest
 * Instructor: Professor Yang
 * Class: ECE 251 Object Oriented Programming
 */
package pos;

/**
 *
 * // This class extends the item class and contains the specifications of meal
 * side dishes. 
 */
public class Side extends Item {
   
    public Side (Size sz, SideOption sd) {
       
        switch(sd) {
            case FRY:
            {
                switch(sz) {
                    case SMALL:
                        super.setPrice(1.28f);
                        super.setItemName("Small Fry");
                        break;
                    case MEDIUM:
                        super.setPrice(1.35f);
                        super.setItemName("Medium Fry");
                        break;
                    case LARGE:
                        super.setPrice(1.49f);
                        super.setItemName("Large Fry"); 
                        break;
                    default: break;
                }
            }
            break;
            case FRUIT:
            {
                super.setPrice(1.19f);
                super.setItemName("Fruit");
                break;
            }
            case BAGCHIPS:
            {
                super.setPrice(1.83f);
                super.setItemName("Chips");
                break;
            }    
            case HASHBROWNS:
            {
                switch(sz) {
                    case SMALL:
                        super.setPrice(1.35f);
                        super.setItemName("Small Hashbrown");
                        break;
                    case MEDIUM:
                        super.setPrice(1.70f);
                        super.setItemName("Medium Hashbrown");   
                        break;
                    case LARGE:
                        super.setPrice(2.05f);
                        super.setItemName("Large Hashbrown");
                        break;
                    
                    default: 
                        break;
                }
            }
            break;
            default: 
                break;
        }
    }
}
