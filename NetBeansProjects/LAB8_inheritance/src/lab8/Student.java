/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.util.*;

/**
 *
 * @author Dustin Kendall
 */
public class Student extends Person implements Comparable<Student>{
private int myStudentId;
private double GPA;
static int lastIdAssigned=10000;


public Student(String firstName, String lastName){
super(firstName,lastName);
/* 
setFirstName(firstName);
setLastName(lastName);


char[] fN = firstName.toCharArray();
char[] lN = lastName.toCharArray();
int sfN=fN.length;
int slN=lN.length;
if(slN<5)
{
       
        
        
	setEmailAddress(String.valueOf(fN[sfN-1])+lastName+"@yahoo.com");
	
}
else
{       
        char[] email = {fN[sfN],lN[4],lN[3],lN[2],lN[1],lN[0]};
        
        
	setEmailAddress(Arrays.toString(email)+"@yahoo.com");
	
}
*///Redundant code
myStudentId = lastIdAssigned+1;
lastIdAssigned++;
GPA= 0.0;
}
public double getGpa(){
    
    return GPA;
}
public int getStudentId(){
    return myStudentId;
}
public void setGpa(double g){
    GPA = g;
}
public void setStudentId(int s){
    myStudentId= s;
}


public int compareTo(Student c){
    if(GPA>c.GPA){
    return 1;
            }
    else
        return 0;
}

    
}
