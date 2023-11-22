package CH12_RECURSION;

public class Example4 {
     public static void main(String[] args) {
          int number=12345;
          System.out.println("Original:");
          System.out.println("Reversed:");
          printRverse(number);
     }

     public static void printRverse(int x) 
     {
          if(x<10)
          {
               System.out.println(x);
               return;
          }  
          else
          {
               System.out.println(x%10);
               printRverse(x/10);
          }   
     }
}

