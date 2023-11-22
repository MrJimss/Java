package Examples;
import java.util.Scanner;

public class solo
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
	
		//your code goes here
		for (int i=0;i<3;i++)
		{
			amount-=(amount*0.10);
		};
		scanner.close();
	}	
}