//  created by : Chirag
//  date : 07-02-2011 
//  program : An Applet code to blink giventext
import java.applet.*;
import java.awt.*;
/*
<applet code="blink.class" height=400 width=400>
<param name=chirag value=Chirag>
</applet>
*/
public class blink extends Applet implements Runnable
{
        String name;
        Thread t;
        boolean flag=true;
        public void init()
        {
                setBackground(Color.cyan);
                setForeground(Color.blue);
                setFont(new Font("Monotype corsiva",Font.ITALIC,20));
                //name=getParameter("chirag");
                t=new Thread(this);
                t.start();
        }
        public void run()
        {
                for(;;)
                {
                        if(flag==true)
                        {
                                name=getParameter("chirag");
                                flag=false;
                        }
                        else
                        {
                                name="";
                                flag=true;
                        }
                        repaint();
                        try
                        {
                                t.sleep(500);
                        }
                        catch(InterruptedException e)
                        {}
                }
        }
        public void paint(Graphics g)
        {
                g.drawString(name,100,100);
        }
}

