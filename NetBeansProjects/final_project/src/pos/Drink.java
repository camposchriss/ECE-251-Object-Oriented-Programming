/*
 * Author: Dustin Kendall
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
    //private Pop t;
    //public enum Pop { SPRITE,COKE,DIETCOKE,MTNDEW,HIC,WATER};
    public Drink(Size inputSize){
    //t=inputDrinkType;
    s=inputSize;
    switch(this.s)
    {
        case KID:
            setPrice(1.19f);
            break;
        case SMALL:
            setPrice(1.34f);
            break;
        case MEDIUM:
            setPrice(1.89f);
            break;
        case LARGE:
            setPrice(2.19f);
            break;
        case XLARGE:
            setPrice(2.89f);
            break;
        default:
            break;
    }
    
        
    }
    
}
