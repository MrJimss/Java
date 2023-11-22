package Species;

public class speciesTest {
    public static void main(String[] args) 
    {
        species sp1=new species();
        sp1.readInput();
        int projectedPopulation=sp1.projectedPopulation(2);
        System.out.println("The projected population will be: "+ projectedPopulation);
    }
}
