package CH12_RECURSION;

public class Example2 {

     public static void main(String[] args) {
          System.out.println(add(4,5));
          System.out.println(add2(4,5));
     }
     public static int add(int first, int second) 
     {
          for (int i=0; i<second; i++) 
          {
               first++;
          }
          return first;
     }
     public static int add2(int first, int second) 
     {
          if(second==0)
               return 1;
          else
               return 1+add(first, second-1);     
     }
}
