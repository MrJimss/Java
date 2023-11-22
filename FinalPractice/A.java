package FinalPractice;

public class A 
{
     protected
          int n; //should be declared static only 
     public
          A(){n=0;System.out.println("Default constructor");}
          A(int x){n=x;System.out.println("Parameterized constructor");}
          int getN() {return n;}
          void setN(int n) {this.n=n;}
          public String toString()
          {
              
               String message= "Reference:" + "\n";
               message=message+"Value: "+ this.n+ "\n";
               return message;
          }
          public boolean isEquals(A otherobejct)
          {
               return(n==otherobejct.n);
          }
          public int fun (int n)
          {
               if(n==0|| n==1)
               {
                    return 2;
               }
               else
                    return fun(n-1)+fun(n-2)+2;
          }
}
