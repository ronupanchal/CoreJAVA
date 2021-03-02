/*<Applet code="app_mouselistener" height=500 width=500>
</Applet>*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class app_mouselistener extends Applet implements MouseListener
{
		int x,y;
		public void init()
		{
			addMouseListener(this);
		}
		public void mouseClicked(MouseEvent me)
		{
			x=me.getX();
			y=me.getY();
		}
		public void mouseEntered(MouseEvent me)
		{
		}
		public void mouseExited(MouseEvent me)
		{
		}
		public void mousePressed(MouseEvent me)
		{
		}
		public void mouseReleased(MouseEvent me)
		{
		}
		public void paint(Graphics g)
		{
			update(g);
		}
		public void update(Graphics g)
		{
			g.drawString("Hello",x,y);
		}
}