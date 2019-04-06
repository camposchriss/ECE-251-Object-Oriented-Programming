/*
 * Author: Dustin Kendall
 * University: Purdue Northwest
 * Instructor: Professor Yang
 * Class: ECE 251 Object Oriented Programming
 */
package lab8;
import java.util.*;


/**
 *
 * @author dkend
 */
public class PersonTestClass {
    static public void main(String args[]){
        Person p1 = new Person("Jerry","Seinfeld");
        /*Person p1 = new Person();
        p1.setFirstName("Jerry");
        p1.setLastName("Seinfeld");*///This was used when could not get constructor working. constructors do not have return types!!!
        System.out.println(p1.getName()+" "+p1.getEmailAddress());
        Student s1 = new Student("Alicia","Keys");
        System.out.println(s1.getFirstName()+" "+s1.getLastName()+" "+s1.getEmailAddress());
        Person s2 = (Person)s1;
        //Student s3 = new Person("Jake", "Gylenhall"); // Cannot create a student object out of more generic instance of person
        //but can create Person with student constructor
        Person p3 = new Student("Jake","Gyllenhal");
        //This is because a student is a person. 
        
        
        
        
    }
    
}
