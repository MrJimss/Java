package ch09_arrayPractice;

public class video 
{
     protected String name;
     protected int year; 
     public video()
     {
          name="no name";
          year=0;
     }

     public video(String name, int year)
     {
          setData(name, year);
     }
     public void setData(String name, int year)
     {
          this.name=name;
          this.year=year;
     }
     public void writeOutput()
     {
          System.out.println("name:"+name);
          System.out.println("Year:"+year);
     }

}
