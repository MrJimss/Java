package ch09_graphics;

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class SwingFun extends JPanel {

    public static void main(String[] args) {
        JFrame window = new JFrame("Homework");
        SwingFun content = new SwingFun("Swing is","Super fun!");
        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(200,100);
        window.setSize(600,600);
        window.setVisible(true);
    }
    //----------------------------------------------------------------------------
    private int size,x1,x2,x3,y1,y2,y3;
    private String message1,message2;
    private Font font1,font2;
    public SwingFun() {this(null,null);}
    public SwingFun(String messageString1, String messageString2) {
        message1 = messageString1;
        message2=messageString2;
        if (message1 == null && message2==null) 
        {
            message1 = "Java!";
            message2="Is fun";
        }

    }
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint( RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON );

        size=(int)(20*Math.random()+10);

        x1 = (int)(77*Math.random())+101;
        y1 = (int)(301*Math.random())+51;
        font1=new Font("Monospaced", Font.PLAIN, size);
        g.setFont(font1);
        float hue1=(float)Math.random();
        g.setColor(Color.getHSBColor(hue1,1,1));
        g.drawString(message1,x1,y1);

        x2 = (int)(99*Math.random())+101;
        y2 = (int)(199*Math.random())+101;;
        font2=new Font("Serif",Font.BOLD,size);
        g.setFont(font2);
        float hue2=(float)Math.random();
        g.setColor(Color.getHSBColor(hue2,1,1));
        g.drawString(message2,x2,y2);

       float hue3=(float)Math.random();
       g.setColor(Color.getHSBColor(hue3,1,1));
       g.drawLine(100,200, 200, 350);

       float hue4=(float)Math.random();
       g.setColor(Color.getHSBColor(hue4,1,1));
       g.drawLine(100,200, 200, 50);

       float hue5=(float)Math.random();
       g.setColor(Color.getHSBColor(hue5,1,1));
       g.drawLine(300,200, 200, 50);

       float hue6=(float)(10*Math.random()+5);
       g.setColor(Color.getHSBColor(hue6,1,1));
       g.drawLine(300,200, 200, 350);

       float hue7=(float)(Math.random());
       g.setColor(Color.getHSBColor(hue7,1,1));
       g.drawRect(100, 50, 200, 300);

       float hue8=(float)(Math.random());
       g.setColor(Color.getHSBColor(hue8,1,1));
       g.drawOval(100, 50, 200, 300);


       x3 = (int)(174*Math.random())+101;
       y3 = (int)(199*Math.random())+101;

       float hue9=(float)(Math.random());
       g.setColor(Color.getHSBColor(hue9,1,1));
       g.fillOval(x3,y3, 15, 20);


    } // end paintComponent()
}  // end class