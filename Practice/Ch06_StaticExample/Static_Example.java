package Ch06_StaticExample;

public class Static_Example {
    public static int value=0 ;
    public  void Exampleshow() { System.out.println("hello ");}

    public static void main(String[] args) {
    Static_Example se1=new Static_Example();
   System.out.println("e1 value = " + value); System.out.println("e2 value = " + Static_Example.value); System.out.println("e3 value = " + Static_Example.value);
    value ++;
    value ++; 
    value ++;
    System.out.println("e1 value = " + Static_Example.value); System.out.println("e2 value = " + Static_Example.value); System.out.println("e3 value = " + Static_Example.value);
    se1.Exampleshow();
    } }