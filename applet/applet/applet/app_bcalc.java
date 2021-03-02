/*<Applet code="app_bcalc" height=500 width=500>
</Applet>*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class app_bcalc extends Applet implements ActionListener
{
	Label l1,l2,l3;
	Button plus,minus,divide,multiply,clear;
	TextField  no1,no2,ans;
		
	public void init()
	{
		l1=new Label("No1: ");
		l2=new Label("No2: ");
		l3=new Label("Ans: ");

		no1=new TextField(6);
		no2=new TextField(6);
		ans=new TextField(6);

		plus=new Button("+");
		minus=new Button("-");
		multiply=new Button("*");
		divide=new Button("/");
		clear=new  Button("Clear");
	
		plus.addActionListener(this);
		minus.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		clear.addActionListener(this);

		add(l1);
		add(no1);
		add(l2);
		add(no2);
		add(l3);
		add(ans);
		add(plus);
		add(minus);
		add(multiply);
		add(divide);
		add(clear);

	}

	public void actionPerformed(ActionEvent ae)
	{
		String st=ae.getActionCommand();
		int x=Integer.parseInt(no1.getText());
		int y=Integer.parseInt(no2.getText());
		int z=0;
		
		if(st.equals("+"))
			z=x+y;
		else if(st.equals("-"))
			z=x-y;
		else if(st.equals("*"))
			z=x*y;
		else if(st.equals("/"))
			z=x/y;
		else 
		{
			no1.setText(" ");
			no2.setText(" ");
			ans.setText(" ");
		}		
		ans.setText(String.valueOf(z));
	}
}