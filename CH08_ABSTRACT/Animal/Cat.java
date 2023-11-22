package CH08_ABSTRACT;

public class Cat extends Animal{
     public Cat() { super(); }
     public Cat(String n) { super(n); }
     public void makeNoise () { System.out.println(this.getName() + " says meow!");
     }
}
