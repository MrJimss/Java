package Homework;

import java.util.Scanner;


public class Grade2
{
     Scanner k= new Scanner(System.in);
     private
          int n=1;
          char grades[];
          int count[];
          char letter[]={'A','B','C','D','F'};
     public
     void setGrades()
     {
          System.out.println("Please enter the grades of your students in letter A, B, C, D,F");
          System.out.println("To end input enter a negative number");

          for (int i=0; i < n; i++)
          {
               this.grades[i]=k.next().charAt(0);
          
               if(this.grades[i]=='A'|| this.grades[i]=='a')
                    count[0]++;
               if(this.grades[i]=='B'|| this.grades[i]=='b')
                    count[1]++;
               if(this.grades[i]=='C'|| this.grades[i]=='c')
                    count[2]++;
               if(this.grades[i]=='D'|| this.grades[i]=='d')
                    count[3]++;
               if(this.grades[i]=='F'|| this.grades[i]=='f')
                    count[4]++;
               if(this.grades[i]<0)
                    break;
               n++;
          }
     }
     void showGrades() 
     {
          for(int i=0;i<n;i++)
          {
               System.out.print(count[i]+" "+letter[i]+"'s");
          }
     }
     
     //public static void main (String[] args) 
     {
          Grade2 g1= new Grade2();

          g1.setGrades();
          g1.showGrades();
     }
     
}
