package realEstate;

public class Buyer {
private String name;
private String address;
private String phoneNumber;
private int mlsNumber;

public Buyer() {
	name = "Name Unknown";
	address = "Address Unknown";
	phoneNumber = "Phone Number Unknown";
	
}
public Buyer(String n,String a, String t) {
	
	name = n;
	address = a;
	phoneNumber = t;
	
}

public String getName() {
	return name;
}
public String getAddress() {
	return address;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public int getMlsNumber() {
	return mlsNumber;
}
protected void setName(String n) {
	name = n;
}
protected void setAddress(String a) {
	address = a;
}
protected void setPhoneNumber(String t) {
	phoneNumber = t;
}
protected void setMlsNumber(int mls) {
	mlsNumber = mls;
}

public String toString() {
	String val = name + " " +address;
	return val;
}



public void viewHome(Home h) {
	h.setNumberOfPotentialBuyers(h.getNumberOfPotentialBuyers()+1);
	
}
}