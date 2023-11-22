package CH08_ABSTRACT;

public class Dog extends Animal {
          public Dog(){super();}
          public Dog(String n) 
          {
               super(n); 
          }
          public void makeNoise () 
          { 
               System.out.println(this.getName() + " says woof!");
          }
}
