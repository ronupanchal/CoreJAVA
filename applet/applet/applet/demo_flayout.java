/*Demo of flowlayout*/
/*<Applet code="demo_flayout" height=600 width=600>
</Applet>*/

import java.applet.*;
import java.awt.*;

public class demo_flayout extends Applet
{
	Button b1,b2,b3,b4,b5;
	public void init()
	{
		b1=new Button();
		b2=new Button();
		b3=new Button();
		b4=new Button();
		b5=new Button();
		setLayout(new FlowLayout(1,20,20));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	}

	public void paint(Graphics g)
	{
		g.drawString("Demo of FlowLayout",10,10);
	}
}