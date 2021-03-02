import java.applet.*;
import java.awt.*;
/*
<applet code="scrollb2t.class" height=400 width=500>
</applet>
*/
public class scrollb2t extends Applet implements Runnable
{
        String name="Chirag";
        Thread t;
        int j=400;
        public void init()
        {
                setFont(new Font("Monotype corsiva",Font.ITALIC,40));
                setBackground(Color.cyan);
                setForeground(Color.red);
                t=new Thread(this);
                t.start();
        }
        public void run() 
        {
                for(;;)
                {
                        char k=name.charAt(0);
                        name=name.substring(1);
                        name=name+k;
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
                int x=100;
                for(int i=0;i<name.length();i++)
                {
                        g.drawString(name.charAt(i)+"",100,x);
                        x+=20;
                }
        }
}
