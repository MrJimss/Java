package Rectangle;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.setValues(5, 4);
        System.out.print("r1 is a ");
        System.out.println(r1.getWidth()+"x"+r1.getLength()+" rectangle");
        System.out.println("area = "+r1.getArea());
    }
}
