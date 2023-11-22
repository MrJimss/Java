package HomeWork;

public class Temperature 
{
     //variables
     private char scale;
     private double temp;

     //constructors
     public Temperature(){scale='C';temp=0.0;}
     public Temperature(char s){scale=s;temp=0.0;}
     public Temperature (double t){temp=t;scale='C'; }
     public Temperature(double t, char s) {scale = s;temp = t;}

     //accessor methods
     public void showCelisus(double temp, char scale)
     {System.out.println("The temperature entered is: "+temp+scale);}
     public void showFahrenheit(double temp, char scale) 
     {System.out.println("The temperature entered is: "+temp+scale);}

     //mutator methods
     public void setTemp(double t){temp=t;}
     public void setScale(char s) {scale=s;}
     public void setData(double t, char s){temp=t;scale=s;}

     //comparisson methods
     public boolean isEquals(Temperature otherTemp)
     {if (this.scale !=otherTemp.scale)
          {this.temp=conversion(temp, scale);this.scale=unitChange(scale);}
          return ((this.temp==otherTemp.temp) &&(this.scale==otherTemp.scale));}
     public boolean isLessThan(Temperature otherTemp)
     {if (this.scale !=otherTemp.scale)
          {this.temp=conversion(temp, scale);this.scale=unitChange(scale);}
          return ((this.temp<=otherTemp.temp));
     }
     public boolean isGreaterThan(Temperature otherTemp)
     {if (this.scale !=otherTemp.scale)
          {this.temp=conversion(temp, scale);this.scale=unitChange(scale);}
          return ((this.temp>=otherTemp.temp));
     }
 
     public double conversion(double temp, char scale)
     {
          double n1=5.0;
          double n2=9.0;
          double newtemp;
          double n3;
          if (scale=='F'|| scale=='f')
          {
               n3=(n1/n2);
               newtemp=(temp-32)*n3;
          }
          else
          {
               n3=(n2/n1);
               newtemp=(temp*n3)+32;
          }
          return newtemp;
     }
     
     public char unitChange(char scale)
     {
          if (scale=='F'|| scale=='f')
               scale='C';
          else
               scale='F';
          return scale;
     }
     public void writeOutput()
     {
          if (this.scale=='f'||this.scale=='F')
          {
               showFahrenheit(temp, scale);
          }
          else
               showCelisus(temp, scale);
     }

     public static void main(String[] args) {
          //default constructor 
          System.out.print("t1: ");
          Temperature t1=new Temperature();
          t1.writeOutput();
          

          //temperature constructor
          System.out.print("t2: ");
          Temperature t2=new Temperature(5.6);
          t2.writeOutput();

          //temperature and scale constructor 
          System.out.print("t3: ");
          Temperature t3=new Temperature(85.6,'F');
          t3.writeOutput();

          //scale constructor
          System.out.print("t4: ");
          Temperature t4=new Temperature('f');
          t4.writeOutput();

          //setter methods
          System.out.print("t5: ");
          Temperature t5=new Temperature();
          t5.setData(0.0, 'C');
          t5.writeOutput();

          System.out.print("t6: ");
          Temperature t6=new Temperature();
          t6.setTemp(10.3);
          t6.setScale('F');
          t6.writeOutput();

          System.out.println("");
          System.out.println("");

          
          //comparisson testing 1 
          if(t1.isEquals(t5))
          {
               System.out.println("t1 and t5 are the same");
          }
          else 
          {
               System.out.println("t1 and t5 are different");
          }

          //comparisson test 2
          if(t1.isEquals(t4))
          {
               System.out.println("t1 and t4 are the same ");
          }
         
          else
          {
               System.out.println("t1 and t4 are different");
          }
          
          //comparisson test 3 

          if (t2.isLessThan(t6))
          {
               System.out.println("t2 is smaller than t6");
          }
          else
          {
               System.out.println("t2 is not smaller than t6");
          }
          //comparisson test 4 
          if (t2.isLessThan(t3))
          {
               System.out.println("t2 is smaller than t3");
          }
          else
          {
               System.out.println("t2 is not smaller than t3");
          }

          //comparisson test 5

          if (t3.isGreaterThan(t6))
          {
               System.out.println("t3 is greater than t6");
          }
          else
          {
               System.out.println("t3 is not greater than t6");
          }

          //comparisson test 6

          if (t6.isGreaterThan(t5))
          {
               System.out.println("t6 is greater than t5");
          }
          else
          {
               System.out.println("t6 is not greater than t5");
          }


          System.out.println("");
          System.out.println("---------------------");
          System.out.println("REQUIRED COMPARISSON: ");
          System.out.println("---------------------");
          System.out.println("");

          System.out.print("t7: ");
          Temperature t7=new Temperature();
          t7.setData(0.0, 'C');
          t7.writeOutput();
          System.out.print("t8: ");
          Temperature t8=new Temperature();
          t8.setData(32, 'F');
          t8.writeOutput();
          System.out.print("t9: ");
          Temperature t9=new Temperature();
          t9.setData(-40, 'C');
          t9.writeOutput();
          System.out.print("t10: ");
          Temperature t10=new Temperature();
          t10.setData(-40, 'F');
          t10.writeOutput();
          System.out.print("t11: ");
          Temperature t11=new Temperature();
          t11.setData(100, 'C');
          t11.writeOutput();
          System.out.print("t12: ");
          Temperature t12=new Temperature();
          t12.setData(212, 'F');
          t12.writeOutput();

          System.out.println("");
          System.out.println("");

          if(t7.isEquals(t8))
          {
               System.out.println("t7 and t8 are the same");
          }
          else 
          {
               System.out.println("t7 and t8 are different");
          }

          if(t9.isEquals(t10))
          {
               System.out.println("t9 and t10 are the same");
          }
          else 
          {
               System.out.println("t9 and t10 are different");
          }

          if(t11.isEquals(t12))
          {
               System.out.println("t11 and t12 are the same");
          }
          else 
          {
               System.out.println("t11 and t12 are different");
          }





     }



}
