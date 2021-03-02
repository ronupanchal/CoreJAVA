import java.awt.*;
import java.applet.*;

/*<applet code="Smiles" height=500 width=500></applet>*/
public class Smiles extends Applet
{
	public void init()
	{
		setBackground(Color.cyan);
		setForeground(Color.gray);
	}
	public void paint(Graphics g)
	{
		g.drawOval(50,50,150,150);
		g.drawOval(80,90,20,20);
		g.drawOval(150,90,20,20);
		g.drawLine(115,150,115,115);
		g.drawArc(330,400,140,90,0,180);

/*



		g.drawOval(250,250,300,300);	
		g.drawOval(310,320,30,30);
		g.drawOval(440,320,30,30);
		g.drawLine(390,350,390,390);
		g.drawArc(330,400,140,90,0,-180);

g.drawArc(0,0,20,15,0,360);*/
	}
	
}