

public class InheritanceDemo 
{    
     public static void main(String[] args) 
     {
          Person [] people = new Person [4];
          people[0] = new Undergraduate("Cotty , Manny", 4910, 1); 
          people[1] = new Undergraduate("Kick, Anita", 9931, 2);
          people[2] = new Student("DeBanque, Robin", 8812); 
          people[3] = new Undergraduate("Bugg, June", 9901, 4);
          for (Person p : people ) //equivalent to int i=0;i<people.length;i++
          {
               p.writeOutput();
               System.out.println();
          }
     }
}