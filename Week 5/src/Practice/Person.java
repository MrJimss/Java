package Practice;

//import java.util.Scanner;
public class Person {
    public static void main(String[] args) 
    
    {
        personData p1= new personData();
        p1.readInput();
        double salary=p1.salary(540, 36000);
        p1.writeOutput();
        System.out.println("The persons salary is " + salary + " Dollars per month.");
    }
}