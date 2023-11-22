package Rectangle;

public class Rectangle {
    
    private int width;
    private int length;

    public int getArea()
    {
        return width*length;
    }
    
    //getter
    public int getWidth(){return width;}
    public int getLength(){return length;}

    //setter
    public void setValues(int w, int l) {this.width=w;this.length=l; }
}