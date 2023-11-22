package CH10_EXCEPTION_HANDLING;

     import java.util.Scanner;
public class DivideByZeroDemo 
{
    private int numerator, denominator;
    private double quotient;

    public static void main(String[] args) 
      {
        DivideByZeroDemo oneTime = new DivideByZeroDemo( );
        oneTime.doIt( );
    }

    public void doIt( ){
        try {
            System.out.println("Enter numerator:");
            Scanner keyboard = new Scanner(System.in);
            numerator = keyboard.nextInt( );
            System.out.println("Enter denominator:");
            denominator = keyboard.nextInt( );

            if (denominator == 0)
                throw new DivideByZeroException( );
            if (denominator<0)
                throw new NegativeNumberException();

            quotient = numerator / (double)denominator;
            System.out.println(numerator + "/" + denominator + 
                               " = " + quotient);
        }
        catch(DivideByZeroException e) {
            System.out.println(e.getMessage( ));
            giveSecondChance( );
        }
        catch(NegativeNumberException e) {
            System.out.println(e.getMessage( ));
            giveSecondChance( );
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("catch 3");
        }
        //finally block allows to save the information and clean all remaining information
        finally
        {
            System.out.println("Finally done!!!");
        }
        System.out.println("End of program.");
    }

    public void giveSecondChance( ) {
        System.out.println("Try again:");
        System.out.println("Enter numerator:");
        Scanner keyboard = new Scanner(System.in);

        numerator = keyboard.nextInt( );
        System.out.println("Enter denominator:");
        System.out.println("Be sure the denominator is not zero.");
        denominator = keyboard.nextInt( );

        if (denominator == 0) {
            System.out.println("I cannot do division by zero.");
            System.out.println("Since I cannot do what you want,");
            System.out.println("the program will now end.");
            System.exit(0);
        }

        quotient = ((double)numerator) / denominator;
		System.out.println(numerator + "/" + denominator + 
						   " = " + quotient);
    }
}
