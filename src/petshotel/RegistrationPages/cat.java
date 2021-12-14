/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshotel.RegistrationPages ;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cat extends JPanel {
    
     public void paintComponent(Graphics g){
        
        
         super.paintComponent(g);
         
        int x = 200;
        int y = 100;
        int eyesize = 32;
        int eyespace = 30;
        int pupil = 4;

         
         g.setColor(Color.orange);
           //head
          g.fillOval(x-63,y-40,130,100);
          
          //ears
           int px1[] = {x - 56, x - 71, x - 20};
           int py1[] = {y ,  y - 53, y - 36};
           g.fillPolygon(px1, py1, 3);
           
           int px2[] = {x + 56, x + 69, x + 20};
           int py2[] = {y,  y - 60, y - 38};
           g.fillPolygon(px2, py2, 3);
           
           //eyes
            g.setColor(Color.WHITE);
            g.fillOval(x - (eyespace+12), y-10, eyesize, eyesize);
            g.fillOval(x + (eyespace-12), y-10, eyesize, eyesize);
          
    
            g.setColor(Color.black);
           
            //pupil
            g.fillOval(x + eyespace - 5,y - 5, pupil, 20);
            g.fillOval(x - eyespace + 5,y - 5, pupil, 20);
            
            
            g.setColor(Color.GRAY);
            //nose
            int px3[] = {x, x - 5, x + 5};
            int py3[] = {y + 30,  y + 25, y + 25};
            g.fillPolygon(px3, py3, 3);
            
            g.setColor(new Color(75,0,130));
           g.setFont(new Font("Kunstler Script",Font.BOLD, 40));
           g.drawString("Pets Hotel", 120, 200);

    
    //whiskers
    
    g.drawLine(x + 46, y + 27, x + 92, y + 32);
    g.drawLine(x + 43, y + 34, x + 70, y + 50);
    g.drawLine(x + 49, y + 20, x + 81, y + 11);
    
    g.drawLine(x - 46, y + 27, x - 92, y + 32);
    g.drawLine(x - 43, y + 34, x - 70, y + 50);
    g.drawLine(x - 49, y + 20, x - 81, y + 11);
         
  
}
      public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new cat() );
    }
}
