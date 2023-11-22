package Homework_Exception;

import java.util.Scanner;


public class AppointmentScheduler 
{    
     private
          String name;
          int time;
          static int  count=0;
          static int j=0;
     public
     AppointmentScheduler() {
          name="no";
          time=1;
      }
     AppointmentScheduler(String n, int t) {
         name=n;
         time=t;
     }
     String getName() 
     {
          return name;
     }
     void setName(String name) 
     {
          this.name = name;
     }
     int getTime() {
          return time;
     }
     void setTime(int time) {
          this.time = time;
     }
     

     public static void main(String[] args) 
     {
          AppointmentScheduler Schedule[]=new AppointmentScheduler[6];
          for(int h=0;h<Schedule.length;h++)
               Schedule[h]=new AppointmentScheduler();
          System.out.println("Hello, welcome to the appointment scheduler");
          System.out.println("You can schedule an appointment at 1,2,3,4,5 or 6 PM");
          Scheduler(Schedule);     
     }
     
     public static void Scheduler(AppointmentScheduler[] Schedule) 
     {
          
          try
          {
               int time, t1, t2;
               String name;
               Scanner k= new Scanner(System.in);
               while(count<6)
               {
                    System.out.println("What is your name?");
                    name=k.next();
                    System.out.println("At what time would you like to schedule an appointment?");
                    time=k.nextInt();
                    if(time<1 ||time>6)
                         throw new InvalidTimeException();
                    Schedule[count].setName(name);
                    if(count==0)
                    {
                         Schedule[count].setTime(time);
                         count++;
                    }
                    else
                    {
                         Schedule[count].setTime(time);
                         
                         t1=Schedule[count].getTime();
                         while(j<count)
                         {   
                              t2=Schedule[j].getTime();
                              
                              System.out.println(t1+ " "+t2);
                              if (t1==t2) 
                              {
                                   throw new TimeInUseException();

                              }
                              j++; 
                         }
                         count++;
                    }
                         
                    
               }
          }
                    catch (InvalidTimeException invalid) 
                    {
                         System.out.println(invalid.getMessage());
                         Scheduler2(Schedule);
                    }
                    catch(TimeInUseException used)
                    {
                         System.out.println(used.getMessage());
                         Scheduler2(Schedule);
                    }
                    finally
                    {
                    Show(Schedule);
                    }
     }
     public static void Show(AppointmentScheduler s[])
     {
          for(int x=0;x<6;x++)
          {
               System.out.println("The persons name is: "+s[x].getName());
               System.out.println("The appointment time is: "+s[x].getTime()+"PM");
          }
     }
}
