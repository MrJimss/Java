package Thurday1006;
import java.util.Scanner;

public class ExerciseArray {
    public static void main(String[] args) 
    
    {
    Scanner k= new Scanner(System.in);
    System.out.println("Hello, please enter your favorite 5 numbers, the system will display them in reverse order");
    int [] array=new int [5];
        for(int i=0; i<5;i++)
        {
            array[i]=k.nextInt();
        }
        System.out.println("");
        for(int i=4;i>=0;i--)
        {
            System.out.println(array[i]);
        } 

    }
    
}
