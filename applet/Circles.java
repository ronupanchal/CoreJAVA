import java.awt.*;
import java.applet.*;
import java.util.*;

/*<applet code="Circles" height=500 width=500></applet>*/
public class Circles extends Applet
{
	public void paint(Graphics g)
	{
		Random rdm = new Random();
		for(int i=0;i<5;i++)
		{
			int r1 = rdm.nextInt(255);
			int g1 = rdm.nextInt(255);
			int b1 = rdm.nextInt(255);
			Color c = new Color(r1,g1,b1);
			g.setColor(c);
			g.drawOval(100+i*10,100+i*10,100-i*20,100-i*20);
		}
	}
	
}