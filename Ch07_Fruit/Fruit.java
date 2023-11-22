package Ch07_Fruit;

public class Fruit 
{
     private String name;
     public String getName() 
     {
          return name;
     }
     public void setName(String name) 
     {
          this.name = name;
     }
     public Fruit(String name) 
     {
          this.name = name;
     }
     public static void changeValue(int i) { i=10; }
     public static void changeValue(Fruit f) { f.setName("Melon");}

     public static void main(String[] args) 
{
     int [] firstArray = new int [10];

     for ( int index=0; index<firstArray . length ; index++)
     firstArray[index] = (int) Math.pow(2, index);

     Fruit [] basket = new Fruit [3]; 
     basket [0] = new Fruit ("Apple" ); 
     basket[1] = new Fruit("Orange"); 
     basket [2] = new Fruit ("Plum" );
     System.out.println("Content before changing: ");

     for ( int index=0; index<firstArray . length ; index++) 
     {     
          System.out.print(firstArray[index]+ " ");
     }
     for ( int index=0; index<basket . length ; index++) 
     {
          System.out.print(basket[index].getName()+ " ");
     }
     
     changeValue( firstArray [0]); changeValue(basket [1]);
     System.out. println (); System.out.println("Content after changing: ");

     for ( int index=0; index<firstArray . length ; index++)
     {
          System.out.print(firstArray[index]+ " ");
     }
     for ( int index=0; index<basket . length ; index++) 
     {
          System.out.print(basket[index].getName()+ " ");
     }
}
}
