package Practice3;

public class CarsTest 
{
    public static void main(String[] args) {
        Cars c1=new Cars();
        Cars c2=new Cars();
        c1.setCompany("Hyundai");
        c1.setMaxSpeed(150);
        
        System.out.println(c1);
        System.out.println(c2);

        if (c1.equals(c2)) 
        {
            System.out.println("Same");   
        }
        else
            System.out.println("Different");

    }
}
