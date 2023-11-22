package Ch07_NumberAboveAverage;

public class multiarray 
{
     public static void main(String[] args) {
     
     int [][] example= new int[4][5];

     for (int i=0; i<4;i++)
     {
          for (int j=0;j<5;j++)
          {
               example[i][j]=(int)((Math.random()*41)+10);
          };
     };
     for (int h=0; h<6; h++)
     {
          for(int k=0;k<5;k++)
          {
               System.out.print(example[h][k]+" ");
          }
          System.out.println("");
     }
     }   
    
}
