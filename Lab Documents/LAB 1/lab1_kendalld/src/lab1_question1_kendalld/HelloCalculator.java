package lab1_question1_kendalld;

import java.util.Scanner;

public class HelloCalculator {
    public void averageThree() {
        // print out the average of three fixed numbers
        System.out.print("The average of 34, 89 and 17 is ");
        System.out.println((34 + 89 + 17) / 3.0);
    }
    public void averageThreeFromUser() {
        // print out the average of three numbers from the user
        System.out.println("Enter three numbers:");         
        System.out.println("The average of these numbers is " +
            (new Scanner(System.in).nextInt()+
             new Scanner(System.in).nextInt()+
             new Scanner(System.in).nextInt()) / 3.0);
    }
    public void greetPerson() {
        // greet the person whose name is entered
        System.out.println("What is your name ?");
        System.out.println("Hello " + new Scanner(System.in).nextLine());
    }
} 