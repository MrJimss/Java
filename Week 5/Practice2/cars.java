package Practice2;
//import java.util.Scanner;

public class cars {
    private int age;
    private String model;
    private String color;

    public void setValues(String colorParameter, String modelParameter, int ageParameter) 
        {
            color=colorParameter;
            model=modelParameter;
            age=ageParameter;
        }
    public void writeOutput() {
        System.out.println("The car model is" +model);
        System.out.println("made in the year: " + age);
        System.out.println("Its color is:" + color);
    }
    
    public static void main(String[] args) 
    {
        cars c1=new cars();
        c1.setValues("red", "Corvette", 1966); 
        c1.writeOutput();
        
    }
}
