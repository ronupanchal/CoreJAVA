/*Demo of border layout*/
/*<Applet code="demo_border" height=600 width=600 >
</Applet>*/

import java.applet.*;
import java.awt.*;

public class demo_border extends Applet
{
	Button b1,b2,b3,b4,b5;
	public void init()
	{
		b1=new Button("EAST");	
		b2=new Button("WEST");	
		b3=new Button("NORTH");	
		b4=new Button("SOUTH");	
		b5=new Button("CENTER");	
		setLayout(new BorderLayout(30,30));
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.NORTH);
		add(b4,BorderLayout.SOUTH);
		add(b5,BorderLayout.CENTER);
	}		
}