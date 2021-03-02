/*<Applet code="thread_date" height=600 width=600>
</Applet>*/

import java.applet.*;
import java.util.*;
import java.awt.*;

public class thread_date extends Applet implements Runnable
{
	Thread t;
	public void init()
	{
		t=new Thread(this);
		t.start();
		setFont(new Font("Comic Sans MS",Font.ITALIC,30));
	}
	
	public void run()
	{
		try
		{
			while (true)
			{
				repaint();
				t.sleep(1000);
			}
		}
		catch(InterruptedException e)	
		{
			System.out.print(e);
		}
	}
	public void paint(Graphics g)
	{
			Date d=new Date();
			int h=d.getHours();
			int m=d.getSeconds();
			int s=d.getMinutes();
			String st=h+" : "+m+" : "+s;
			g.drawString(st,150,250);

	}
}