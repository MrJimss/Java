package ch09_graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphics2 {
     private static class HelloWorldDisplay extends JPanel {
          public void paintComponent(Graphics g) {
             super.paintComponent(g);
             g.drawString( "Hello World!", 20, 30 );
          }
       }
       
       private static class ButtonHandler implements ActionListener {
          public void actionPerformed(ActionEvent e) {
             System.exit(0);
          }
       }
       
       public static void main(String[] args) {
          
          HelloWorldDisplay displayPanel = new HelloWorldDisplay();
          JButton okButton = new JButton("OK");
          ButtonHandler listener = new ButtonHandler();
          okButton.addActionListener(listener);
    
          JButton Button2 = new JButton("OK2");
          ButtonHandler l2 = new ButtonHandler();
          okButton.addActionListener(l2);

          JPanel content = new JPanel();
          content.setLayout(new BorderLayout());
          content.add(okButton, BorderLayout.NORTH);
          content.add(Button2, BorderLayout.SOUTH);
          content.add(displayPanel, BorderLayout.CENTER);
    
          JFrame window = new JFrame("GUI Test");
          window.setContentPane(content);
          window.setSize(250,100);
          window.setLocation(100,100);
          window.setVisible(true);
       }
}
