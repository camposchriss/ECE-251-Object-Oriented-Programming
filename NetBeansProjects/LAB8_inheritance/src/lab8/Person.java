/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.util.*;



    

public class Person{
	private String firstName, lastName;
	private String myEmailAddress;
public Person(String afirstName, String alastName){
firstName= afirstName;
lastName = alastName;


char[] fN = firstName.toCharArray();
char[] lN = lastName.toCharArray();
int sfN=fN.length;
int slN=lN.length;
if(slN<5)
{
       
        
        
	myEmailAddress = String.valueOf(fN[0])+lastName+"@yahoo.com";
	
}
else
{       
        char[] email = {lN[0], lN[1], lN[2], lN[3], lN[4]};
        
        
	myEmailAddress=String.valueOf(fN[0])+(new String(email))+"@yahoo.com";
	
}
}	


public String getFirstName(){
	return firstName;
}

public String getLastName(){
	return lastName;
}

public String getName(){
	return firstName +" "+lastName;
}

public void setFirstName(String fn){
    firstName=fn;
}
public void setLastName(String ln){
    lastName= ln;
}
public void setEmailAddress(String email){
    myEmailAddress = email;
}
public String getEmailAddress(){
    return myEmailAddress;
}

public String toString(){
    return firstName+" "+lastName+" : "+myEmailAddress;
}
	
}

