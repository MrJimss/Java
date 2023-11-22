package Homework;

import java.util.*;

public class FourDigit {
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a 4 digit integer: ");
        int n = keyboard.nextInt();

        int a = n/1000;
        int b = n/100 %10;
        int c = n/10 % 10;
        int d =n%10;

        System.out.println(a +"\n" + b + "\n" + c +"\n" +d);
        keyboard.close();
    }
}
