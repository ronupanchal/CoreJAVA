import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="cmiuc_game.class" height=400 width=500>
</applet>
*/
public class cmiuc_game extends Applet implements MouseMotionListener,Runnable
{
        Thread t;
        int flag=1;
        int x1=100,y1=100,x2=100,y2=100;
        public void init()
        {
                t=new Thread(this);
                addMouseMotionListener(this);
                t.start();
        }
        public void run()
        {
                for(;;)
                {
                        try
                        {
                                t.sleep(100);
                        }
                        catch(InterruptedException e)
                        {
                        }
                        repaint();
                }
        }
        public void mouseMoved(MouseEvent me)
        {
                int x=me.getX();
                int y=me.getY();
                if(x>=x1-10 && x<=x1+110 && y>=y1-10 && y<=y1+110)
                {
                        if(x<x1)
                                x1=x1+10;
                        if(x>x2)
                                x1=x1-10;
                        if(y<y1)
                                y1=y1+10;
                        if(y>y2)
                                y1=y1-10;
                }
        }
        public void mouseDragged(MouseEvent me)
        {}
        public void paint(Graphics g)
        {
                if(flag==1)
                        g.setColor(Color.red);
                else if(flag==2)
                        g.setColor(Color.blue);
                else if(flag==3)
                        g.setColor(Color.green);
                g.drawOval(x1,y1,x2,y2);
                g.fillOval(x1,y1,x2,y2);
                flag++;
                if(flag==4)
                        flag=0;
        }
}
