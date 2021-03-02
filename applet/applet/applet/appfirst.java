/*<applet code="appfirst" height=400 width=400>
</applet>*/

import java.awt.*;
import java.applet.*;

public class appfirst extends Applet
{
	String st="";
	public void init()
	{
		st="init";
	}
	public void start()
	{
		st=st+"  start";
	}
	public void paint(Graphics g)
	{
		st=st+"  paint";
		showStatus(st);
	}
	public void stop()
	{
		st=st+"  stop";
	}
	public void destroy()
	{
		st=st+"  destroy";
	}
}
