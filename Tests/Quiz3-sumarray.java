package Tests;
import java.util.Scanner;

public class sumarray
{
     public static void main(String[] args) 
     {
          double arr[]=new double[10];
          System.out.println("Hello. enter your favorite 10 values");
          Scanner k= new Scanner(System.in);

          for(int i=0;i<arr.length;i++)
          {
               arr[i]=k.nextDouble();
          }
          double s=sum(arr);

          System.out.println("The sum of the values is: "+ s);
          k.close();
     }
    
     static double sum(double a[])
     {
          double sum=0;
          for(int i=0;i<a.length;i++)
          {
               sum+=a[i];
          }
          return sum;
     }
     
}
