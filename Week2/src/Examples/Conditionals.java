package Examples;
import java.util.*;
public class Conditionals {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("Enter three integers: ");
        int a = k.nextInt();
        int b = k.nextInt();
        int c=k.nextInt();

        //by assigning a variable it would be easier to  compare.
        /*
         * largest = a
         * if(b>largest)
         *  largest= b;
         * if (c>largest)
         *  largest=c
         * sysout. 
         */

        if (a>b)
        {
            if (a>c)
            {
                System.out.println("The largest integer is: " + a);
            }
        }
        else if (b>c)
        {
            System.out.println("The largest integer is: " + b);
        }
        else 
        {
            System.out.println("the largest integer is: " + c);
        }

    k.close();
    }
}
