package customer_lab3;

public class Customer {
	String name;
	int age;
	char sex;
	float money;
        boolean admitted;
	//System pt = new System.out();
	//Write give class finish Step 4 then move on to step 5.
	
	public boolean spend(float amount) {
            boolean paid=false;
            
            if(amount<=money) {
		this.money -=amount;//Now must modify class so Customer cannot overspend
                paid = true;
		}
		else
			System.out.println("You do not have enough money to make this purchase");
		return paid;
	}
	//Step 4 Write give method
        
        public void give(Customer reciever, float amount){
            this.money = this.money-amount;
            reciever.money= reciever.money + amount;
            
            
        }
        public float computeFee(){
            float fee;
            if(age<=3)
                fee=0.00f;
            else if(age>=4&&age<=17)
                    fee=8.50f;
            else if(age>=18&&age<=65)
                    fee = 12.75f;
            else
                fee = 0.5f*12.75f;
            
            return fee;
                    
            
        }
        
        public void payAdmission(){
            admitted = spend(computeFee());
            
        }

}
