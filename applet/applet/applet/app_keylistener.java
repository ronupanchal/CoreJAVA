/*<Applet code="app_keylistener" height=500 width=500>
</Applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class app_keylistener extends Applet implements KeyListener
{
	int x=100,y=100;
	public void init()	
	{
		addKeyListener(this);
	
	}
	public void keyPressed(KeyEvent ke)
	{
		if (ke.getKeyCode()==ke.VK_UP)
			y=y-1;
		else if(ke.getKeyCode()==ke.VK_DOWN)
			y=y+1;
		else if (ke.getKeyCode()==ke.VK_RIGHT)
			x=x+1;
		else if (ke.getKeyCode()==ke.VK_LEFT)
			x=x-1;
		repaint();
	}
	public void keyTyped(KeyEvent ke)
	{
	}
	public void keyReleased(KeyEvent ke)
	{
	}
	public void paint(Graphics g)
	{
		g.drawOval(x,y,20,20);		
	}
}