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

public class grawCat extends JPanel implements ActionListener{

    Timer t=new Timer(3,this);
    int h1=35,h2=43;
    int inc1=5,inc2=5;
     public void paintComponent(Graphics g)
    {

      super.paintComponent(g);
      t.start();

        
     g.setColor(Color.yellow);
     g.fillOval(h1, h2, 90, 80);                    

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(h1<0 || h1>this.getWidth() )
        {
          inc1=-inc1;
        }
        else if(h2<0 || h2>this.getHeight() )
        {
          inc2=-inc2;
        }
        h1+=inc1;
        h2+=inc2;
        repaint();
    }
     
     
     
////     
//     public static void main(String[] args) {
//        // TODO code application logic here
//        JFrame b=new JFrame();
//        b.setTitle("cat");
//        b.setBackground(Color.WHITE); 
//        grawCat d=new grawCat();
//
//        b.add(d);
//        b.setSize(600, 600);
//        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        b.setVisible(true);
//        
//    }
    
}
