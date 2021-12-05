
package petshotel;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author huawei ,r1=50, r2=50,r3=60, r4=30,
 */
public class grawCat extends JPanel implements ActionListener{
    Font f = new Font("Serif", Font.ITALIC, 18);
    Timer t=new Timer(6,this);
    int h1=35,h2=43,n1=75,n2=75,e1=60,e2=60,E1=90,E2=60,m1=60,m2=80;
    int inc1=5,inc2=5;
     public void paintComponent(Graphics g)
    {

      super.paintComponent(g);
      t.start();

        
     g.setColor(Color.yellow);
     g.fillOval(h1, h2, 90, 80);                              // head
//     g.drawRect(80, 225, 140, 5);    // tail
//     g.setColor(new Color(255, 234, 111));
//     g.fillOval(20, 110, 120, 120);  //  body
     g.setColor(new Color(116, 139, 248));
//     g.drawOval(20, 110, 120, 120);  // paint body
     g.fillOval(n1, n2, 10, 10);                                // nose
     g.setColor(new Color(116, 139, 248));
     g.fillOval(e1, e2, 10, 10);                                 // eyes
     g.fillOval(E1, E2, 10, 10);
     g.drawArc(60, 80, 40, 20, 180, 180);                         // mouth
     g.setColor(new Color(116, 139, 248));
     g.drawLine(50, 50, 60, 30);                                    // ears
     g.drawLine(60, 30, 70, 50); 
     g.drawLine(110, 50, 100, 30);
     g.drawLine(100, 30, 90, 50);
     g.setColor(Color.red);
     
     
     

    }
