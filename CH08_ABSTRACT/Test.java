package CH08_ABSTRACT;

public class Test {
     public static void main(String[] args) 
     {
          Animal a[]=new Animal[4];
          a[0]=new Dog("Corgi");
          a[1]=new Cat("Canela");
          a[2]=new Dog("Chihuahua");
          a[3]=new Cat("Whiskers");

          display(a);

     }
     public static void display(Animal pet[])
     {
          for(int i=0; i<pet.length;i++)
          {
               pet[i].makeNoise();
          }

     }
}
