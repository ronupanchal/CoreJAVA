/*<Applet code="thread_bgcolor" height=500 width=500>
</Applet>*/

import java.applet.*;
import java.awt.*;

public class thread_bgcolor extends Applet implements Runnable
{
	boolean b=false;
	Thread t;
	public void init()
	{
		t=new Thread(this);
		t.start();
	}		
	
	public void run()
	{
		try
		{
			while(true)
			{
				b=!b;
				repaint();
				t.sleep(500);		
			}
		}
		catch(InterruptedException e)
		{	
			System.out.print(e);
		}
	}
	public void paint(Graphics g)
	{
		if(b==true)
			setBackground(Color.gray);
		else
			setBackground(Color.cyan);
	}
}
