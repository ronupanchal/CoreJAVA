import java.awt.*;
import java.applet.*;

/*
 <applet code="evenodd" width=248 height=146>
 <param name="num" value="5">

 </applet>
*/

public class evenodd extends Applet
{
	int c;
	public void init()
	{
		c = Integer.parseInt(getParameter("num"));
		if(c%2==0)
		{
			setForeground(Color.red);
setBackground(Color.blue);
		}else
		{
			setForeground(Color.green);
			setBackground(Color.yellow);
		}
	}
	public void paint(Graphics g)
	{
		g.drawString(""+c,15,15);

	}
}
