package Homework_Exception;

public class TimeInUseException extends Exception  {
     public TimeInUseException ( ) 
     {
          super("Sorry, that time is already in use "); 
     }

     public TimeInUseException(String message) 
     {
     super ( message ) ;
     } 
}

    