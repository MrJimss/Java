package ch11_FileIO;

import java.io.*;


public class TextFileOutputDemo {
public static void main(String[] args) 
{     
     String fileName = "/Users/carlos/Documents/LaGuardia/MAC-190/ClassWork/MAC190/fileoutput/out.txt"; //The name could be read from //the keyboard.
     PrintWriter outputStream = null ; 
     try
     {
          outputStream = new PrintWriter(new FileOutputStream(fileName,true);
     }
     catch(FileNotFoundException e)
     {
          System.out.println("Error opening the file" +fileName);
          System.exit (0); 
     }

     System.out.println("Enter three lines of text:"); 
     Scanner keyboard = new Scanner(System.in);
     for (int count = 1; count <= 3; count++)
     {
          String line = keyboard . nextLine ();
          outputStream.println(count + " " + line); 
     }
     outputStream.close ();
     System.out.println("Those lines were written to " +fileName );
} 
}
