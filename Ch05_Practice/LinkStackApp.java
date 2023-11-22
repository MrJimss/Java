package Ch05_Practice;

import java.util.Scanner;

public class LinkStackApp 
{
     public static void main(String[] args) 
     {
          LinkList lkl = new LinkList();
          char ans='y';
          Scanner k= new Scanner(System.in);
          System.out.println("");

          System.out.println("Hello. Enter how many values would you like your list to have?");
          int j= k.nextInt();

          System.out.println("Thank you.\nPlease now enter the values follwed by an enter");
          for(int i=0;i<j;i++)
          {
               int n= k.nextInt();
               lkl.insertFirst(n);
          }
          while(ans == 'y')
          {
               System.out.println("Select one of the following options:");
               System.out.println("1-Display the values");
               System.out.println("2-add value at the beggining");
               System.out.println("3-add the values at the end");
               System.out.println("4-delete first  value");
               System.out.println("5-Delete last value");
               int answer=  k.nextInt();
               switch(answer)
               {
                    case 1:
                         System.out.println("The values in te list are:");
                         lkl.displayList();
                         break;
                    case 2:
                         System.out.println("Enter the values follwed by an enter");
                         int n1= k.nextInt();
                         lkl.insertFirst(n1);
                         lkl.displayList();
                         break;
                    case 3:
                         System.out.println("Enter the values follwed by an enter");
                         int n2= k.nextInt();
                         lkl.insertLast(n2);
                         lkl.displayList();
                         break;
                    case 4:
                         lkl.deleteFirst();
                         lkl.displayList();
                         break;
                    case 5:
                         lkl.deleteLast();
                         lkl.displayList();
                         break;
               }
               System.out.println("continue?");
               ans=k.next().charAt(0);
          }
          k.close();
     };
}
