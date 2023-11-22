package Ch8_4Abstract;

public class test 
{
     public static void main(String[] args) 
     {
     
     Rectangle r1=new Rectangle(2.3, 6.5 );
     Circle c1=new Circle(4.1);
     display(c1);
     display(r1);
     }  
    
     public static void display(Measurable figure)
     {
          double perimeter=figure.getPerimeter();
          double area=figure.getArea();
          System.out.println("---------------");
          System.out.println("Perimeter:" + perimeter+";\n area= " + area);
          System.out.println("---------------");
     }
}
