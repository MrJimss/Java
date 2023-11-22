package FinalPractice;

public class Test 
{
     public static void main(String[] args) 
     {
          A a1=new A();
          System.out.println(a1.getN());
          System.out.println("Changing a1 value...");

          a1.setN(100);
          System.out.println("Now is.."+a1.getN());
          System.out.println(" ... Done!");

          System.out.println("Creating second object...");
          A a2=new A(100);
          System.out.println("a1 is: "+a1.getN());
          System.out.println("a2 is: " + a2.getN());

          // System.out.println("Now we make it static!");
          // System.out.println(n); //you can call it with an object or without i.e A.n

          System.out.println(a1.toString());//without overriding only prints the reference because the method is inherited from the object class

          System.out.println(a1.isEquals(a2)); //overriden method for the isEquals testing the value of the variable, the original one only test to see if they are the same object

          B b1=new B(4,'d');
          System.out.println(b1);
          System.out.println(b1.fun(5));

          //overloading is not dynamic binding, is not an example of polymorphism
          //overriding is dynamic binding, a tyepe of polimorphism 
          
          
          //classes objects inheritance, polymorphism, abstract classes, interfaces,
     

     }
}
