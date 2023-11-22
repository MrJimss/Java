package Ch07_NumberAboveAverage;
import java.util.Scanner;
public class NumberAboveAverage {
     public static void main(String[] args) {
          double sum=0.0;
          double avg;
          int count=0;
          double temp[]=new double[10];
          Scanner k= new Scanner(System.in);
          System.out.println("please enter 10 temperatures to calculate the average.");
          for (int i=0; i<10;i++)
          {
               temp[i]=k.nextDouble();
               sum+=temp[i];
          }
          avg=sum/10;
          System.out.println("The average temperature is " + avg);
          for (int j=0;j<10; j++)
          {
               if (avg<temp[j])
                    count ++;
          }
          System.out.println("the temperature was above average on "+ count+" days");
          k.close();
     }
}
