package Homework;

import java.util.Scanner;

public class Hw2 
{
	public static void main(String[] args) 
	
	{
		
		System.out.println("Enter the size of the diamond: ");
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		
		int n=1; //variable to count the number of lines independent from the row counter.
		
		for (int row=1;row<=2*size-1;row++) //outer loop controls the number of rows.
		{
			
			for(int a=n; a<=size;a++) //prints asterisks to the left using a counter that acts as size-1
			{
				System.out.print("*");	
			}
			
			for (int space=1; space<(2*n)-1;space++) //prints 2*n spaces per row starting on the second row.
			{
				System.out.print(" ");
			}
			
			for(int a2=n; a2<=size;a2++) //same as the first asterisk printer but to the right
			{
				System.out.print("*");	
			}
			
			if(row<size) //conditional helps control inner loops and also "reflect" diamond bottom part.
			{
				n++;
			}
			else 
				n--;
			
			System.out.println("");
			
		}	
		
		s.close();
	}
	
	
}
