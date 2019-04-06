package lab4;

public class Customer implements java.io.Serializable {
    

private String name;
private int age;
private char sex;
private float money;
private boolean admitted;
//Step 1 - create undefined contstructor produces 
//error in main method because not contstructor requires a string
// and the called methods do no supply a string.

//public Customer(String name){
    
//}
public Customer (){
    name = "John Doe";
    age = 0;
    money = 0.0f;
    admitted = false;
    sex = 'M';
}
public Customer(String aName){
    this();
  //c1.name = "Bob"; would not compile
  // because it is improper syntax as well as logically
  // c1 would have to have been previously constructed for the 
  //constructer to construct it
  //name = "Bob"; doesn't work because even though name is an attribute name is also a parameter passed
  // to the constructor. Java compiler will confuse and mix these. It is best practice
  // to pass a parameter with a different name than class attributes for clarity.
  
  name = aName;//finish step 1
 //Step 2 - You can use method overloading on
 //constructors as long as their parameters are different
 /*NOTE it is good java practice to 
 set all attribute values in every constructor. 
 */
 /*
  age = 0;
  sex = 'M';
  money = 0.0f;
  admitted = false;
  */
}
public Customer(String aName, int iage, char asex){
    this();
    name = aName;
    age = iage;
    sex = asex;
    
}
public Customer(String aName, int iage, char asex, float amoney, boolean admit){
    name = aName;
    age = iage;
    sex = asex;
    money = amoney;
    admitted = admit;
    
}
public boolean spend(float amount) {
if (money < amount)
return false;
 money -= amount;
return true;
 }
public void give(Customer c, float amount) {
if (money >= amount) {
 money -= amount;
 c.money += amount;
 }
 }
public float computeFee() {
if (age <= 3)
return 0;
if (age < 18)
return 8.50f;
if (age >= 65)
return 12.75f * 0.50f;
return 12.75f;
 }
public void payAdmission() {
if (spend(computeFee()))
 admitted = true;
 }
public String toString(){
   // return "Customer named " + name;
   String asex;
   String b;
  /* if(sex=='M')
   {
       asex = "male";
   }
   else
       asex = "female";
*/
  String output = "Customer "+name +": is a ";
  
   asex = (sex=='M'||sex=='m')? "Male" : "Female";
   b = (admitted)?"who has been admitted":" who has not been admitted";
   String aage = Integer.toString(age);
   String amoney =Float.toString(money);
   output+=aage+" old "+asex +" with $"+amoney+b;

   
   return output;
}
public String getName(){
    return name;
}
public int getAge(){
    return age;
    
}
public float getMoney(){
    return money;
}
public char getSex(){
    return sex;
}
public boolean getAdmitted(){
    return admitted;
}
public void setName(String aName)
{
    name = aName;
}
public void setAge(int sage){
    age = sage;
}
public void setSex(char s){
    sex=s;
}
public void setMoney(float m){
    money = m;
}
public void setAdmitted(boolean a){
    admitted = a;
}
public void admit(){
    admitted = true;
}
public void deny(){
    admitted = false;
}
public void toggleAdmission(){
    admitted = !admitted;
}
}