package Ch8_4Abstract;

public class Circle implements Measurable 
{
     private double radius;
     final double p=Math.PI;
     public Circle(double r)
     {
          this.radius=r;
     }
     public double getArea(){return p*radius*radius; };
     public double getPerimeter(){return 2*p*radius;};
     public double getCircumference()
     {
          return this.getPerimeter();
     }
}
