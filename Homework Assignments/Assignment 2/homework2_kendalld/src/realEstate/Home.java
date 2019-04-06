package realEstate;

public class Home {
	private String location, model, address;
		
	private boolean available;
	
	private int year, mlsNumber, numberOfPotentialBuyers;
	private double price;
	
	public Home(String l, String m, String a, int Y, int M, int N) {
		location = l;
		model = m;
		address = a;
		available = true;
		year = Y;
		mlsNumber = M;
		numberOfPotentialBuyers = N;
	}
	
	public String toString() {
		String val = location+ " "+model+ " "+ address;
		return val;
	}
	
	public String getLocation() {
		return location;
	}
	public String getModel() {
		return model;
	}
	public String getAddress() {
		return address;
	}
	public boolean getAvailable() {
		return available;
	}
	public int getYear() {
		return year;
	}
	public int getMlsNumber() {
		return mlsNumber;
	}
	public double getPrice() {
		return price;
	}
	public int getNumberOfPotentialBuyers() {
		return numberOfPotentialBuyers;
	}
	
	public void setLocation(String L) {
		location = L;
	}
	public void setModel(String M) {
		model = M;
	}
	public void setYear(int Y) {
		year = Y;
		
	}

	public void setMlsNumber(int M)
	{
		mlsNumber = M;
	}
	public void setNumberOfPotentialBuyers(int P) {
		numberOfPotentialBuyers = P;
	}
	
	public void setPrice(double p) {
		price = p;
	}
}
