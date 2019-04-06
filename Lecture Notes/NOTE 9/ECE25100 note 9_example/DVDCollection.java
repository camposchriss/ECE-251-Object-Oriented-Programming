import java.util.*; 
public class DVDCollection{ 
    private ArrayList<DVD>   dvds; 
    public DVDCollection() { dvds = new ArrayList<DVD>(); } 

    public ArrayList<DVD> getDvds() { return dvds; } 
    public String toString() { return ("DVD Collection of size " + dvds.size()); } 

    public void add(DVD aDvd) { dvds.add(aDvd); } 
    
    public boolean remove(String title) { 
        for (DVD aDVD: dvds) { 
            if (aDVD.getTitle().equals(title)) { 
                dvds.remove(aDVD); 
                return true; 
            } 
        } 
        return false; 
    } 
   
}
