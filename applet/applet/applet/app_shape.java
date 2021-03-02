/*
<Applet code="app_shape" height=600 width=800>
</Applet>
*/

import java.applet.*;
import java.awt.*;

public class app_shape extends Applet
{
	String st="Hello World";
	public void init()
	{
		setBackground(Color.lightGray);
//		setForeground(Color.black);
	}

	public void paint(Graphics g)
	{
		Color c1=new Color(100,100,255);
		Color c2=new Color(200,70,70);

		g.setColor(c1);
		g.drawString(st,100,100);
		g.drawLine(100,200,400,400);

		g.setColor(c2);
		g.drawRect(100,300,100,100);
		g.fillRect(100,300,100,100);
		g.drawOval(100,400,100,100);

		//polygon	
		int xpoints[]={600,500,700};
		int ypoints[]={300,400,400};
		int n=3;
		g.drawPolygon(xpoints,ypoints,n);
		
		//Arc
		g.drawArc(10,100,70,80,0,175);
	}	
}