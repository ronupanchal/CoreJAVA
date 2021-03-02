/*<Applet code="thread_blink" height=500 width=500>
</Applet>*/

import java.applet.*;
import java.awt.*;

public class thread_blink extends Applet implements Runnable
{
	boolean b=false;
	Thread t;
	public void init()
	{
		t=new Thread(this);
		t.start();
		setFont(new Font("Arial",Font.BOLD,30));
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
			setForeground(Color.gray);
		else
			setForeground(Color.white);
		g.drawString("Good Day.......",100,250);
	}
}
