import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="mouse1.java" height=400 width=400>
</applet>
*/


public class mouse1 extends Applet implements MouseListener,MouseMotionListener
{
        String s="";
        int x=100,y=100;
        public void init()
        {
                setBackground(Color.cyan);
                setForeground(Color.cyan);
                setFont(new Font("Monotype Corsiva",Font.ITALIC,20));
                addMouseListener(this);
                addMouseMotionListener(this);
        }
        public void mouseEntered(MouseEvent me)
        {
                s="Entered..";
                repaint();
        }
        public void mouseExited(MouseEvent me)
        {
                s="Exited..";
                repaint();
        }
        public void mousePressed(MouseEvent me)
        {
                x=me.getX();
                y=me.getY();
                s="Rani";
                repaint();
        }
        public void mouseClicked(MouseEvent me)
        {
        }
        public void mouseMoved(MouseEvent me)
        {
                Point p=me.getPoint();
                showStatus(p.toString());
        }                  
        public void paint(Graphics g)
        {
                g.drawString(s,x,y);
        }
}


