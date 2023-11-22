package Project_QueueStack;
import java.util.Scanner;


public class Patient {
     Scanner k= new Scanner(System.in);

     private int age;
     private String name;
     private String condition;
     private int id;
     private char priority;

     public Patient ()    //default constructor
     {
          age=0;
          name="none";
          condition="none";
          id=0;
          priority='n';
     }
     public Patient (int a, String n, String c, int i, char p) //parameterized constructor
     {
          age=a;
          name=n;
          condition=c;
          id=i;
          priority=p;
     }
     public void setAge(int age) {this.age = age; }
     public void setName(String name) { this.name = name;}
     public void setCondition(String condition) {this.condition = condition;}
     public void setId(int id) {this.id = id;}
     public void setPriority(char priority) { this.priority = priority; }

     public void setData(char p)                                           //setting the patient's data
     {
          char ans;
          do
          {
               System.out.println("Please input:");
               System.out.print("Name: "); name= k.next();
               System.out.print("Age: "); age= k.nextInt();        //age input w/ conditional to verify valid age
               if(age<=0|| age>199)
               {
                    System.out.println("Incorrect age! Retry");
                    ans='y';
                    break;
               }
              
               System.out.print("Condition: "); condition= k.next();
               System.out.print("ID: "); id=k.nextInt();
               if(id<0)
               {
                    id=-1*id;   //preventing negative ID's                              
               }
               if (p=='y'|| p=='Y') 
               {
                    System.out.print("Priority: "); priority=k.next().charAt(0);   
               }
               
               ans='n';
          }while(ans=='y'|| ans=='Y');
     }
     public void record(char p)
     {
          System.out.println("Our Records indicate:");
          System.out.println("Patient:"+ name);
          System.out.println("Age: "+age+" years old");
          System.out.println("Condition:"+condition);
          System.out.println("ID: "+id);
          if((p=='y' ||p=='Y')&&(priority=='y'||priority=='Y'))
          {
               System.out.println("Patient has been given priority before");
          }
          else 
               System.out.println("Patient has never been in priority queue");
          System.out.println();
          System.out.println("--------------");
     }

     public void editRecord(char p )
     {
          int ans2='n';
          char answer;
          do
          {
               System.out.println("Which record would you like to change?");
               System.out.println("1- Name");
               System.out.println("2- Age");
               System.out.println("3- Condition");
               System.out.println("4- ID");
               if (p=='y'|| p=='Y') 
               {
                    System.out.println("5- Priority");
               }
               
               answer=k.next().charAt(0);
               if(answer<1|| answer >5)
               {
                    System.out.println("Wrong Selection! Try Again");
                    ans2='y';
                    break;
               }
               switch(answer)
               {
                    case 1:
                         String s= k.next();
                         setName(s);
                         break;
                    case 2:
                         int a= k.nextInt();
                         setAge(a);
                         break;
                    case 3: 
                         String c= k.next();
                         setCondition(c);
                         break;
                    case 4:
                         int i= k.nextInt();
                         setId(i);
                         break;
                    case 5:
                         if (p=='y'|| p=='Y') 
                         {
                              char py= k.next().charAt(0);
                              setPriority(py);
                         }
                         break; 
               }
          }while(ans2=='y'||ans2=='Y');
     }
     
     public int getAge() {return age;}
     public String getName() {return name;}
     public String getCondition() {return condition;}
     public int getId() {return id;}
     public char getPriority() {return priority;}

     public String toString()
     {
        
          return "Patient:"+ name+"\nAge: "+age+" years old.\nCondition:"+condition+"\nID: "+id+"\n";
     }
}
