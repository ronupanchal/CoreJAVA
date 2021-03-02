import java.awt.*;
import java.applet.*;

/*<applet code="Name" height=500 width=500></applet>*/
public class Name extends Applet
{
	public void init()
	{
		setBackground(Color.cyan);
		setForeground(Color.gray);
	}
	public void paint(Graphics g)
	{
		g.drawLine(5,5,5,70);
		g.drawLine(5,5,35,5);
		g.drawLine(5,70,35,70);	
		
	}
	
}