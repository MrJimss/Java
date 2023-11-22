package Person;

public class Person {
    
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void sayHello()
    {
        System.out.println("");
        System.out.println("Hello! I am "+ this.name);
        System.out.println("I am " + age + " years old.");
    }
    public boolean equals(person otherPerson) 
    {
        if((name.equals(otherPerson.name)) && (age == otherPerson.age))
        {
            return true;
        }
    }
}
