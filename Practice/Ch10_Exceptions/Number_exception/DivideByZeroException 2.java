package CH10_EXCEPTION_HANDLING;

public class DivideByZeroException extends Exception 
{
     public DivideByZeroException ( ) 
     {
     super("Dividing by Zero!"); 
     }

     public DivideByZeroException(String message) 
     {
     super ( message ) ;
     } 
}
