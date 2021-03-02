import java.awt.*;
import java.applet.*;

/*
 <applet code="evenodd" width=248 height=146>
 <param name="num" value="3">

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
		}else
		{
			setForeground(Color.green);
		}
	}
	public void paint(Graphics g)
	{
		g.drawString(""+c,15,15);

	}
}
