
public class DVDUI1 { 
    private   DVDCollection   model; 
    public DVDUI1() { model = new DVDCollection(); } 
    public DVDCollection getModel() { return model; }

/*****   step 1    ********/
    public void showMainMenu() {
        System.out.println("1.  Add DVD"); 
        System.out.println("2.  Delete DVD"); 
        System.out.println("3.  List DVDs"); 
        System.out.println("4.  Exit"); 
        System.out.println("\nPlease make a selection");
        
        /********     step 2 &3    ***********/
       int   selection = new java.util.Scanner(System.in).nextInt(); 
            switch(selection) { 
                case 1:   addDVD();    /* Handle the adding of DVDs   */ break; 
                case 2:   deleteDVD(); /* Handle the removing of DVDs */ break; 
                case 3:   listDVDs();  /* Handle the listing of DVDs  */ break; 
                case 4:   System.exit(0); 
                default:  System.out.println("Invalid Selection"); 
            }  
     }
     
     private void addDVD() { 
         DVD    aDVD = new DVD(); 
         System.out.println("Enter DVD Title:  "); 
         aDVD.setTitle(new java.util.Scanner(System.in).nextLine()); 
         System.out.println("Enter DVD Year (e.g., 2012):"); 
         aDVD.setYear(new java.util.Scanner(System.in).nextInt()); 
         System.out.println("Enter DVD Durartion (minutes):"); 
         aDVD.setDuration(new java.util.Scanner(System.in).nextInt()); 
         model.add(aDVD); 
    } 

     private void deleteDVD() { 
        System.out.println("Enter DVD Title:  "); 
        model.remove(new java.util.Scanner(System.in).nextLine()); 
    }
    
     private void listDVDs() {
         for (DVD aDVD: model.getDvds()) 
            System.out.println(aDVD); 
    }



    public static void main (String[] args) { 
        System.out.println("Welcome to the Dvd Collection User Interface"); 
        System.out.println("--------------------------------------------"); 

        new DVDUI1().showMainMenu();
    } 
}
