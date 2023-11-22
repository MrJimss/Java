package CH12_RECURSION;

import java.util.Scanner;

public class Example {
     public static void main(String[] args) {
          Scanner k= new Scanner(System.in);
          System.out.println("Enter the base: ");
          int base=k.nextInt();
          System.out.println("Enter the exponent: ");
          int exponent=k.nextInt();

          System.out.print(base + "to the power" + exponent+ "is: ");
          System.out.println(power(base,exponent));
          k.close();
     }
     public static int power(int a, int b)
     {    if(b==0)
               return 1;
          else
               return a*power(a,b-1);
     }
     
}    
