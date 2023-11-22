package Constructors;

public class Rectangle 
{ 
    private int width , length ;

    public Rectangle () 
    { 
        width =1;
        length =2;
        System.out.println("Default Constructor..."); 
    }

    public Rectangle(int wid, int len)
    {
        width =wid;
        length =len;
        System.out.println("Parameterized Constructor...");
        printInfo();     
    }
    public void setWidth(int w) { width = w;} 
    public void setLength ( int l ) { length = l ;} 
    int getWidth () { return width ; }
    int getLength () { return length ; }

    public void printInfo ()
    {
        System.out.print("This is a " + width ); System.out.println("x" + length + " rectangle.");
    }
}