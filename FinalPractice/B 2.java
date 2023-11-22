package FinalPractice;

public class B extends A{
     private char c;
     public B(){super();c='?';System.out.println("Default B constructor");}
     public B(int v, char c){super(v);this.c=c;System.out.println("Parameterized B");}
     public String toString()
     {
          String message= "Reference:" + "\n";
          message=message+"Value: "+ this.n+ "\n";
          return message;
     }
}
