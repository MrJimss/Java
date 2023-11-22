package Dog;

public class DogDemo {
	public static void main (String[] args)
	{
		Dog balto= new Dog();
		balto.name="Balto";
		balto.breed="Siberian Husky";
		balto.age=8;
		balto.writeOutput();
		
		Dog scooby =new Dog();
		scooby.name="Scooby";
		scooby.breed="Great Dane";
		scooby.age=42;
		scooby.writeOutput();
		
	}

}
