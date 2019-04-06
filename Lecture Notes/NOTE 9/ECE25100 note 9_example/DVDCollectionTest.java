
public class DVDCollectionTest{
	public static void main (String[] args) {
    DVDCollection c = new DVDCollection();
    c.add(new DVD("Finding Nemo", 2003, 124));
    c.add(new DVD("The Incredibles", 2005, 93));
  	c.add(new DVD("The Smurfs", 2008, 100));
    c.add(new DVD("Cars 2", 2011, 106));
    c.add(new DVD("Brave", 2012, 120));
    c.add(new DVD("Frozen", 2013, 109));
    c.add(new DVD("Inside Out", 2015, 120));
    c.add(new DVD("Kung Fu Panda 3",2016,120));
    c.add(new DVD("Beauty and the Beast", 2017, 120));
    c.add(new DVD("Coco", 2017, 120));


    c.remove("Cars 2");

    // List the DVDs
    for (DVD aDVD: c.getDvds())
        System.out.println(aDVD);
}

}