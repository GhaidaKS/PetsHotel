/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    int h1=35,h2=43,n1=75,n2=75,e1=60,e2=60,E1=90,E2=60,m1=60,m2=80,arc1=60, arc2=80,r1=50, r2=50, r3=60, r4=30, f1=60, f2=30, f3=70, f4=50,k1=110, k2=50, k3=100, k4=30,l1=100, l2=30, l3=90, l4=50;
    int inc1=5,inc2=5;
     public void paintComponent(Graphics g)
    {

      super.paintComponent(g);
      t.start();

        
     g.setColor(Color.yellow);
     g.fillOval(h1, h2, 90, 80);                              // head
     g.setColor(new Color(116, 139, 248));
     g.fillOval(n1, n2, 10, 10);                                // nose
     g.setColor(new Color(116, 139, 248));
     g.fillOval(e1, e2, 10, 10);                                 // eyes
     g.fillOval(E1, E2, 10, 10);
     g.drawArc(arc1, arc2, 40, 20, 180, 180);                         // mouth
     g.setColor(new Color(116, 139, 248));
     g.drawLine(r1, r2, r3, r4);                                    // ears
     g.drawLine(f1, f2, f3, f4); 
     g.drawLine(k1, k2, k3, k4);
     g.drawLine(l1, l2, l3, l4);
     g.setColor(Color.red);
     
     
     

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(h1<0 || h1>this.getWidth() || n1<0 || n1>this.getWidth() || e1<0 || e1>this.getWidth() || E1<0 || E1>this.getWidth() || arc1<0 || arc1>this.getWidth() || r1<0 || r1>this.getWidth() || r2<0 || r2>this.getWidth())
        {
          inc1=-inc1;
        }
        else if(h2<0 || h2>this.getHeight() || n2<0 || n2>this.getHeight() || e2<0 || e2>this.getHeight() || E2<0 || E2>this.getHeight() || arc2<0 || arc2>this.getHeight() || r3<0 || r3>this.getHeight() || r4<0 || r4>this.getHeight())
        {
          inc2=-inc2;
        }
       h1+=inc1;
       h2+=inc2;
     
         n1+=inc1;
        n2+=inc2;
        
         e1+=inc1;
        e2+=inc2;
         E1+=inc1;
        E2+=inc2;
        arc1+=inc1;
        arc2+=inc2;
        r1+=inc1;
        r2+=inc1;
        r3+=inc2;
        r4+=inc2;
        repaint();
    }
     
     
     
//     
     public static void main(String[] args) {
        // TODO code application logic here
        JFrame b=new JFrame();
        b.setTitle("cat");
        b.setBackground(Color.WHITE); 
        grawCat d=new grawCat();

        b.add(d);
        b.setSize(600, 600);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setVisible(true);
        
    }
    
}
