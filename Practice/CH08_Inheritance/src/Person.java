

public class Person {
     private String name;
     public Person () 
     {
          name="No name yet";
          System.out.println("Person default constructor");     
     }
     public  Person(String initialName) 
     {
          name=initialName;
          System.out.println("Person parameterized constructor");     
     }
     public void setName(String newName)
     {
          name=newName;
     }
     public String getName(){return name;}
     public void writeOutput()
     {
          System.out.println("Name: "+ name);
     }
     public boolean hasSameName(Person otherPerson) 
     {
          return this.name.equalsIgnoreCase(otherPerson.name);     
     }
}
