package Project_QueueStack;


import java.util.Scanner;

public class Office 
{ 
     public static void main(String[] args) 
     {
          Scanner k= new Scanner(System.in);
          System.out.println("");
          System.out.println("----------------");
          System.out.println("Welcome Doctor. How would you like to assist your Patients?");
          System.out.println("");
          System.out.println("1- In the order they arrived (Recommended)");
          System.out.println("2- Last person in goes first ");
          int answer= k.nextInt();
          switch(answer)
          {
               case 1:
                    OfficeQueue();
                    break;
               case 2:
                    OfficeStack();
                    break;
          }
     }
     public static void OfficeStack() 
     {
          Scanner k= new Scanner(System.in);
          
          System.out.println("Please start by adding the amount of maximum possible patients for today:");
          int maxP= k.nextInt();
          Stack PatientS= new Stack(maxP);
          char ans='y';
          System.out.println("Thank you.\nPlease choose an option from the list below:");
          while (ans=='y'|| ans=='Y') 
          {
               System.out.println("1- Add patients to the list");
               System.out.println("2- Look up the next patient in line");
               System.out.println("3- Remove the next Patient in line ");
               System.out.println("4- Display the entire list of patients");
               System.out.println("5- Check how many patients are checked in today.");
               System.out.println("0- to exit");
               int answer=k.nextInt();
               switch(answer)
               {
                    case 0:
                         ans='n';
                         break;
                    case 1:
                         try
                         {
                              if(PatientS.getTop()==maxP)
                              {
                                   throw new Exception("Warning this will cause stack overflow!");
                              }
                              else
                                   AddPatientS(PatientS);
                         }
                              catch (Exception e)
                              {
                                   System.out.println(e.getMessage());
                                   System.out.println("Try removing values");
                                   break;
                              }
                              
                         break;
                    case 2:
                         PatientS.peek();
                         System.out.println("Assisted patient?(y/n)");
                         char a=k.next().charAt(0);
                         if(a=='n')
                         {
                            break; 
                         }
                    case 3:
                              Patient temp=PatientS.pop();
                              System.out.println("Patient #" +temp.getId()+" has been removed from the stack.");
                              System.out.println("------------------------");
                              System.out.println();
                         break;
                    case 4:
                         PatientS.DisplayStack();
                         break;
                    case 5:
                         if(PatientS.isFull())
                              System.out.println("There are "+maxP+" patients in line");
                         else if(PatientS.isEmpty())
                              System.out.println("The office is empty");
                         else
                              System.out.println("There are "+ PatientS.getTop()+" patients to be served");
                         break;
               }
          }
          System.out.println("Thank you doctor I hope you have a great day!");
     }

     public static void OfficeQueue() 
     {
          Scanner k= new Scanner(System.in);

          System.out.println("Would you like to offer priority to ill patients? (y/n)");
          char priority=k.next().charAt(0);
          
          System.out.println("Please start by adding the amount of maximum possible patients for today:");
          int maxP= k.nextInt();
          Queue PatientQ= new Queue(maxP);
            
          System.out.println("Thank you.\nPlease choose an option from the list below:");
          System.out.println("");
          char ans2='y';
          while (ans2=='y'|| ans2=='Y')
          {
        	  	System.out.println("1- Add patients to the list");
        	  	System.out.println("2- Look up the next patient in line");
        	  	System.out.println("3- Remove the next Patient in line ");
        	  	System.out.println("4- Display the entire list of patients");
        	  	System.out.println("5- Check how many patients are checked in today.");
        	  	System.out.println("0- To exit");
        	  	int answer=k.nextInt();
               switch(answer)
               {
                    case 0:
                         ans2='n';
                         break;
                    case 1:
                         AddPatientsQ(priority, PatientQ);
                         break;
                    case 2:
                         PatientQ.peekFront();
                         System.out.println("------------------------");
                         System.out.println();
                         System.out.println("Assisted patient?(y/n)");
                         char a=k.next().charAt(0);
                         if(a=='n')
                              break;
                         else
                              System.out.println();
                    case 3:
                    try
                    {
                         Patient temp=PatientQ.remove();
                         System.out.println("Patient #" + temp.getId()+ " has been removed from the Queue.");
                         System.out.println("------------------------");
                         System.out.println();
                         if (PatientQ.isEmpty()) 
                         {
                             System.out.println("Warning! Cannot remove more items or will cause Queue underflow!"); 
                             System.out.println("------------------------");
                             System.out.println(); 
                             break;
                         }
                         if (PatientQ.getFront()>maxP) 
                         {
                              throw new Exception("Cannot remove more patients!");
                         }
                    }
                    catch (Exception e)
                    {
                       System.out.println(e.getMessage());
                       System.out.println("------------------------");
                       System.out.println();
                       break;
                    }
                         
                    case 4:
                         PatientQ.DisplayQ();
                         break;
                    case 5:
                         if(PatientQ.isFull())
                         {
                              System.out.println("The queue is full! ");
                              System.out.println("------------------------");
                              System.out.println();
                         }
                         else if(PatientQ.isEmpty())
                         {
                              System.out.println("The office is empty!");
                              System.out.println("------------------------");
                              System.out.println();
                         }
                         else
                         {
                              System.out.println("There are "+ PatientQ.size()+" patients waiting to be served");
                              System.out.println("------------------------");
                              System.out.println();
                         }
                         break;
               }
          }
          System.out.println("Thank you doctor I hope you have a great day!");

     }

     public static void AddPatientsQ(char pr, Queue q) 
     {
          Scanner k= new Scanner(System.in);
          
           System.out.println("For how many Patients would you like to enter information at once?");
               int patients= k.nextInt();

               for(int i=0; i<patients; i++)
               {
                    System.out.println("Please enter Patient #"+(i+1)+" information");
                    Patient pq=new Patient();
                    pq.setData(pr);
                    q.insert(pq); 
               } 
  
     }

     public static void AddPatientS(Stack s) 
     {
          Scanner k= new Scanner(System.in);
          char pr='n';
          System.out.println("For how many Patients would you like to enter information at once?");
              int patients= k.nextInt();

              for(int i=0; i<patients; i++)
              {
                   System.out.println("Please enter Patient #"+(i+1)+" information");
                   Patient ps=new Patient();
                   ps.setData(pr);
                   s.push(ps);
              }   
     }


     
}
