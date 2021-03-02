/*<Applet code="tictactoe" height=300 width=300>
</Applet>*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class tictactoe extends Applet // implements ActionListener
{
	Panel p1,p2,mp;
	Button b[]=new Button[9];
	Button s=new Button("Start");
	public void init()
	{
		p1=new Panel();
		p1.setLayout(new GridLayout(1,1));
		p1.add(s);

		p2=new Panel();
		p2.setLayout(new GridLayout(3,3));

		for(int i=0;i<9;i++)
		{
			b[i]=new Button("");
//			b[i]addActionListener(this);
			p2.add(b[i]);
		}
			
		mp=new Panel();
		mp.setLayout(new BorderLayout(30,30));
		mp.add(p1,BorderLayout.NORTH);
		mp.add(p2,BorderLayout.SOUTH);
		add(mp);
	}
}
