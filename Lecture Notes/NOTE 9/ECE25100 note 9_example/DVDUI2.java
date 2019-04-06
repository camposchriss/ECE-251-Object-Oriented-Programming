
public class DVDUI2 { 
    private   DVDCollection   model; 
    public DVDUI2() { model = new DVDCollection(); } 
    public DVDCollection getModel() { return model; }
    
    public void displaySelection(){
    System.out.println("\n--------------------------------------------");
    System.out.println("1.  Add DVD"); 
    System.out.println("2.  Delete DVD"); 
    System.out.println("3.  List DVDs"); 
    System.out.println("4.  Exit"); 
    System.out.println("\nPlease make a selection");
    }

/*****   step 1    ********/
    public void showMainMenu() {
    while(true) {
    	displaySelection(); 
    	try {
    		int selection = new java.util.Scanner(System.in).nextInt();
    		while(true){
    
           	 switch(selection) { 
                	case 1:   addDVD();    /* Handle the adding of DVDs   */ break; 
                	case 2:   deleteDVD(); /* Handle the removing of DVDs */ break; 
                	case 3:   listDVDs();  /* Handle the listing of DVDs  */ break; 
                	case 4:   System.exit(0); 
                	default:  System.out.println("Invalid Selection"); 
            	}
         	displaySelection();
        	selection = new java.util.Scanner(System.in).nextInt();
       }
	}
	catch(java.util.InputMismatchException e) {
        System.out.println("Invalid Selection");
    }
    System.out.println("\n");
   }
}
     
    private void addDVD() {
    DVD    aDVD = new DVD();
    System.out.println("Enter DVD Title:  ");
    aDVD.setTitle(new java.util.Scanner(System.in).nextLine());
    int entered = -1;
    do {
        System.out.println("Enter DVD Year (e.g., 2015):");
        try {
            entered = new java.util.Scanner(System.in).nextInt();
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("Invalid Year");
        }
    }
    while (entered == -1);
    aDVD.setYear(entered);
    
    entered = -1;
    do {
        System.out.println("Enter DVD Durartion (minutes):");
        try {
            entered = new java.util.Scanner(System.in).nextInt();
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("Invalid Duration");
        }
    }
    while (entered == -1);
    aDVD.setDuration(entered);
    model.add(aDVD);
}

   private void deleteDVD() { 
        System.out.println("Enter DVD Title:  "); 
        String title = new java.util.Scanner(System.in).nextLine(); 
        boolean success = model.remove(title); 
        if (success) 
            System.out.println("\nDVD: " + title + " was deleted successfully \n"); 
        else 
            System.out.println("\n*** Error: Could not find DVD: " + title + "\n"); 
    } 

    
     private void listDVDs() {
        java.util.Collections.sort(model.getDvds());//sorted by title   
       
        for (DVD aDVD: model.getDvds()) 
            System.out.println(aDVD); 
    }



    public static void main (String[] args) { 
        System.out.println("Welcome to the Dvd Collection User Interface"); 
        
        new DVDUI2().showMainMenu();
    } 
}
