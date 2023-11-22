package Examples;

import java.util.*;

public class nestedLoop 

{

	public static void main(String[] args) 
	
	{
		
		System.out.println("Enter the size of the diamond: ");
		Scanner s= new Scanner(System.in);
		
		for (int j=0;j<=18;j++) 
		{
			
			for(int i=0; i<=j;i++) 
			{
				System.out.print("*");
				
			}
			System.out.println(" ");
		}	
		s.close();
	}

}
