package Quiz;
import java.util.*;

public class quiz1 {
    public static void main(String[] args)
    {
        int n;
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Please enter and number:");
        n= keyboard.nextInt();

        while(n>1)
        {
            if(n%2==0)
            {
                System.out.println(n);
            }
            else
            System.out.println(n-1);
            n--;
        }
        keyboard.close();
    }
    
}
