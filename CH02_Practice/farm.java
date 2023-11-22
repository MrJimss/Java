package CH02_Practice;

import java.util.Scanner;

public class farm {
     private int size;
     private String species;

     public farm()
     {
          size=0;
          species="none";
     }
     public farm(int s, String sp)
     {
          size=s;
          species=sp;
     }

     public void SetSize(int s)
     {
          size=s;
     }
     public void SetSpecies(String sp)
     {
          species=sp;
     }
     public int getSize()
     {
          return size;
     }
     public String getSpecies()
     {
          return species;
     }

     public String toString()
     {
          return "this is a "+ this.species + " farm.\n It has "+ this.size+" "+ this.species +"(s)";
     }
     public static void main(String[] args) 
     {
          farm f1=new farm();
          f1.SetSize(5);
          f1.SetSpecies("Chicken");
          System.out.println(f1);

          String[] name=new String[f1.getSize()];

          Scanner k= new Scanner(System.in);
          System.out.println("enter the name for each of the chickens:");
          for(int i=0; i<name.length;i++)
          {
               System.out.print(f1.getSpecies()+"#"+(i+1)+": ");
               name[i]= k.nextLine();
          }

          System.out.println("thank you! Now your chickens have names!\nHere they are:");

          for(int i=0;i<name.length;i++)
          {
               System.out.println(f1.getSpecies()+"#"+(i+1)+": "+name[i]);
          }

          System.out.println("Thank you for visiting our farm");
          k.close();
          
     }
}
