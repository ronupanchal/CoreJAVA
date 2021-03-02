import java.applet.*;
import java.awt.*;
/*
<applet code="SmileColor" height="500" width="500">
</applet> */

public class SmileColor extends Applet
{
	public void init()
	{
		setBackground(Color.PINK);
		setForeground(Color.RED);
	}
	public void paint(Graphics g)
	{
		g.fillOval(40,50,350,350);     
		g.setColor(Color.YELLOW);
		g.fillOval(100,150,80,80);
		g.setColor(Color.YELLOW);
		g.fillOval(250,150,80,80);
		g.setColor(Color.CYAN);     
		g.fillArc(130,260,180,70,180,180);


		g.fillOval(450,50,350,350);     
		g.setColor(Color.RED);
		g.fillOval(510,150,80,80);
		g.setColor(Color.RED);
		g.fillOval(660,150,80,80);
		g.setColor(Color.YELLOW);     
		g.fillArc(550,290,180,70,180,-180);
	}
}
