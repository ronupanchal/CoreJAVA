import java.awt.*;
import java.applet.*;
/*
<applet code ="Dots" width=500 height=500>
</applet>
*/
public class Dots extends Applet implements Runnable
{
	int x=0,y=0;
	Thread t;
	Dimension d;

	public void init()
	{
        	t=new Thread(this);
	        t.start();
    	}

	public void run()
	{
        	while(true)
		{
	        	try
			{
          			repaint();
		           //Sleep before displaying next dots
            			Thread.sleep(10);
           		}
	                catch(Exception e) {}
         	}
    	 }

	public void update(Graphics g)
	{
        	 paint(g);
    	}

	public void paint(Graphics g)
	{
        	d=getSize();
	        x = (int) (Math.random() * d.getWidth());
        	y = (int) (Math.random() *  d.getHeight());         
                g.fillRect(x,y,10,10);
         }

}
