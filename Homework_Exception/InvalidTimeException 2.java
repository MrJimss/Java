package Homework_Exception;

public class InvalidTimeException extends Exception  {
     public InvalidTimeException ( ) 
     {
          super("Sorry, that is not a legal time"); 
     }

     public InvalidTimeException(String message) 
     {
     super ( message ) ;
     } 
}

    