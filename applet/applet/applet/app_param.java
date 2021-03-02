/*
<Applet  code="app_param" width=500 height=500 >
	<param name=p1 value=5>
	<param name=p2 value=7>
</Applet>
*/
import java.applet.*;
import java.awt.*;

public class app_param extends Applet
{
	int n1,n2;
	public void init()
	{
		n1=Integer.parseInt(getParameter("p1"));
		n2=Integer.parseInt(getParameter("p2"));
	}
	public void paint(Graphics g)
	{
		int ans=n1+n2;
		g.drawString(ans+" ",200,200);
	}
}