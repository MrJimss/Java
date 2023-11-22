package ch09_arrayPractice;
import java.util.Scanner;

public class movie extends video {
     protected String actor;
     protected movie[] collection;
     public movie()
     {
          super();
          actor="none";

     }
     public movie(String name, int year, String actor )
     {
          super(name, year);
          setData(name,year,actor);
     }
     public void setData(String n, int y, String a)
     {
          name=n;
          year=y;
          actor=a;
     }
     public void readInput()
     {
          int size;
          Scanner k= new Scanner(System.in);
          System.out.print("how many movies you want to add:");
          size= k.nextInt();
          collection=new movie[size];
               for(int i=0;i<size;i++)
               {
                    collection[i]=new movie();
                    System.out.println("Enter the name of the movie:");
                    String n=k.next();
                    System.out.println("Enter the year of the movie:");
                    int y= k.nextInt();
                    System.out.println("Enter the actor of the movie:");
                    String a= k.next();
                    collection[i].setData(n, y, a);
               }
     }
     public void writeOutput()
     {
          for(int i=0;i<collection.length;i++)
          {
             collection[i].showData();
          }
     }
     public void showData()
     {
          System.out.println("name:"+name);
          System.out.println("Year:"+year);
          System.out.println("actor:"+actor);
     }

     
}
