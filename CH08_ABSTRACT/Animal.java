package CH08_ABSTRACT;

public abstract class Animal 
{
     private String name;
     public Animal() { name = "No name";}
     public Animal(String n) { name = n; }
     public void setName(String n) { name = n; }
     public String getName() { return name; } 
     public abstract void makeNoise();
}
