package Practice;

public class Practice_exam {


     public static void main(String[] args) 
     {
          int[] arr= new int[10];
          int[] arr2=new int[10];

          int[] ordarr=new int[20];

          for(int i=0; i<arr.length;i++)
          {
               arr[i]=(int)((Math.random()*9)+1);
          }
          for(int i=0; i<arr2.length;i++)
          {
               arr2[i]=(int)((Math.random()*11)+10);
          }

          for(int i=0; i<10;i++)
          {
               ordarr[i]=arr[i];
               ordarr[(i+10)]=arr2[i];
          }


     
          for(int i=0; i<ordarr.length;i++)
          {
               System.out.println(ordarr[i]);
          }

          for(int i=1;i<20;i++)
               {
                    for(int j=0;j<i;j++)
                    {
                         
                    }
                         
               }

          
     }
     

}
