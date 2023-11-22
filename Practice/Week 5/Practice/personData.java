package Practice;

import java.util.Scanner;

public class personData 

{
    Scanner k= new Scanner(System.in);

    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    private int age;
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private char gender;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    private boolean married;
    private char isMarried;
    public char getmarried() 
    {
        System.out.print("Are you married? (true/false) ");
        married= k.nextBoolean();
        if (married==true)
        {
            return 'Y';
        }
        else
            return 'N';

    }

    public void setmarrried(boolean married) {
        this.married = married;
    }

    public void readInput()
    {
        System.out.print("Hello. Please tell me your age: ");
        age= k.nextInt();

        System.out.print("Tell me your name: ");
        name= k.next();

        System.out.print("What is your gender: (m/f) ");
        gender= k.next().charAt(0);
        
        isMarried=getmarried();

    }

    public void writeOutput()
    {
        System.out.println("The persons name is: " + name);
        System.out.println("The person is " + age + " Years old.");
        System.out.println("Is this person married? " + isMarried);
        System.out.println("The persons gender is: " + gender);
    }

    public double salary(int wage, int hours)
    {
        double salary = wage*hours;

        return salary;
    }
}
