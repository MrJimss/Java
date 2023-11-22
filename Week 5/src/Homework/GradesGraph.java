package Homework;
import java.util.Scanner;


public class GradesGraph 
{
     private
          int numberOfAs,numberOfBs,numberOfCs,numberOfDs,numberOfFs;
     public

     //setters
     void setFcount(int numberOfFs) {this.numberOfFs = numberOfFs;}
     void setDcount(int numberOfDs) {this.numberOfDs = numberOfDs;}
     void setCcount(int numberOfCs) {this.numberOfCs = numberOfCs;}
     void setBcount(int numberOfBs) {this.numberOfBs = numberOfBs;}
     void setAcount(int numberOfAs) {this.numberOfAs = numberOfAs;}
     void set(int a, int b, int c, int d, int f) 
     {
          numberOfAs=a;
          numberOfBs=b;
          numberOfCs=c;
          numberOfDs=d;
          numberOfFs=f;
     }

     //getters
     int getFcount() {return numberOfFs;}
     int getDcount() {return numberOfDs;}
     int getCcount() {return numberOfCs;}
     int getBcount() {return numberOfBs;}
     int getAcount() {return numberOfAs;}
     int getTotalNumberOfGrades()
     {
          return (numberOfAs+numberOfBs+numberOfCs+numberOfDs+numberOfFs);
     }
     int getPercentA(){return (Math.round((float)(numberOfAs*100)/getTotalNumberOfGrades()));}
     int getPercentB(){return (Math.round((float)(numberOfBs*100)/getTotalNumberOfGrades()));}
     int getPercentC(){return (Math.round((float)(numberOfCs*100)/getTotalNumberOfGrades()));}
     int getPercentD(){return (Math.round((float)(numberOfDs*100)/getTotalNumberOfGrades()));}
     int getPercentF(){return (Math.round((float)(numberOfFs*100)/getTotalNumberOfGrades()));}

     //Write Outputs
     void writeFcount() {System.out.println("Number of F's: " + numberOfFs);}
     void writeDcount() {System.out.println("Number of D's: " + numberOfDs);}
     void writeCcount() {System.out.println("Number of C's: " + numberOfCs);}
     void writeBcount() {System.out.println("Number of B's: " + numberOfBs);}
     void writeAcount() {System.out.println("Number of A's: " + numberOfAs);}
     void writeOutput() 
     {
          System.out.println("Number of A's: " + numberOfAs);
          System.out.println("Number of B's: " + numberOfBs );
          System.out.println("Number of C's: "  + numberOfCs);
          System.out.println("Number of D's: "  + numberOfDs);
          System.out.println("Number of F's: "  + numberOfFs);
     }

     //Accepts input from the user
     void readInput()
     {
          Scanner k= new Scanner(System.in);
          System.out.print("Number of A's: " );
          numberOfAs=  k.nextInt();
          System.out.print("Number of B's: " );
          numberOfBs=  k.nextInt();
          System.out.print("Number of C's: " );
          numberOfCs=  k.nextInt();
          System.out.print("Number of D's: " );
          numberOfDs=  k.nextInt();
          System.out.print("Number of F's: " );
          numberOfFs=  k.nextInt();
     }

     //draws a graph based on the percentage 
     void draw()
     {
         System.out.println("0   10   20   30   40   50   60   70   80   90   100");
         System.out.println("|    |   |    |    |    |    |    |    |    |    |");
         System.out.println("***************************************************");
         int percent[]= {(int) Math.floor(getPercentA()/2),(int) Math.floor(getPercentB()/2),(int) Math.floor(getPercentC()/2),(int) Math.floor(getPercentD()/2),(int) Math.floor(getPercentF()/2)};
         char letter[]={'A','B','C','D','F'};
         for(int i=0;i<5;i++)
         {
               for(int j=0;j<percent[i];j++)
               {
                    System.out.print("*");
               }
               System.out.print(letter[i]);
               System.out.println("");
         }
     }


     public static void main(String[] args) 
     {
          GradesGraph grades = new GradesGraph();

          //Test case for receiving user input and then displaying using methods
          System.out.println();
          System.out.println("Test case 1: ");
          grades.readInput();
          System.out.println();
          grades.writeOutput();
          System.out.println();
          System.out.println("===============================");
          System.out.println();
          

          //Test case setting the values as a group and then displaying them using a single method
          System.out.println();
          System.out.println("Test case 2:");
          grades.set(1, 2, 3, 4, 5);
          System.out.println();
          grades.writeOutput();
          System.out.println("===============================");
          System.out.println();

          //Test case setting values individually and then displaying them using a single method
          System.out.println();
          System.out.println("Test case 3:");
          System.out.println("Set counts individually");
          grades.setAcount(10);
          grades.setBcount(9);
          grades.setCcount(8);
          grades.setDcount(7);
          grades.setFcount(6);
          System.out.println();
          grades.writeOutput();
          System.out.println("===============================");
          System.out.println();

          //Test case displaying values individually usings different methods 
          System.out.println();
          System.out.println("Test case 4:Write counts individually");
          System.out.println();
          grades.writeAcount();
          grades.writeBcount();
          grades.writeCcount();
          grades.writeDcount();
          grades.writeFcount();
          System.out.println("===============================");
          System.out.println();

          //test case that displays the count of each letter
          System.out.println();
          System.out.println("Test case 5: Return counts individually:");
          System.out.println();
          System.out.println("A count = " + grades.getAcount());
          System.out.println("B count = " + grades.getBcount());
          System.out.println("C count = " + grades.getCcount());
          System.out.println("D count = " + grades.getDcount());
          System.out.println("F count = " + grades.getFcount());
          System.out.println();
          System.out.println("===============================");
          System.out.println();

          //test case: total number of grades obtained
          System.out.println();
          System.out.println("Test case 6: Return total number of grades");
          System.out.println();
          System.out.println("Verify total = 40");
          System.out.println("Total number of grades = " + grades.getTotalNumberOfGrades());
          System.out.println();
          System.out.println("===============================");
          System.out.println();
    
          //test case: displaying the corresponding percentage value of each grade
          System.out.println();
          System.out.println("Test case 7:Return percentages of each grade");
          System.out.println("Verify A=25, B=23, C=20, D=18, & F=15");
          System.out.println();
          System.out.println("A = " + grades.getPercentA());
          System.out.println("B = " + grades.getPercentB());
          System.out.println("C = " + grades.getPercentC());
          System.out.println("D = " + grades.getPercentD());
          System.out.println("F = " + grades.getPercentF());
          System.out.println();
          System.out.println("===============================");
          System.out.println();
          
          //test case: printing the graph by using the previous percentages
          System.out.println();
          System.out.println("Test case 8:");
          System.out.println("Draw graph of grade percentages");
          System.out.println();
          System.out.println("Verify A=25, B=23, C=20, D=18, & F=15");
          System.out.println();
          grades.draw();

          System.out.println();
          System.out.println("Test case 9:");
          System.out.println("Draw graph of grade percentages");
          System.out.println();
          System.out.println("Verify A=100%");
          grades.set(1, 0, 0, 0, 0);
          System.out.println();
          grades.draw();

          System.out.println();
          System.out.println("Test case 10:");
          System.out.println("Draw graph of grade percentages");
          System.out.println();
          System.out.println("Verify all 0%");
          grades.set(0, 0, 0, 0, 0);
          System.out.println();
          grades.draw();




     }
}
