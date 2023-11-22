package Person;

public class PersonDemo {
        public static void main(String[] args) {
            Person p1= new Person();
            p1.setName("Bob");
            p1.setAge(34);
            p1.sayHello(); 
            

            Person p2= new Person();
            p2.setName("Bob");
            p2.setAge(34);
            p2.sayHello();

            if(p1.equals(p2))
                System.out.println("same");
            else
                System.out.println("Different");
                
    }
}

