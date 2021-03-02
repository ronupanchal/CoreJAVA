/*<Applet code="app_itemlistener" height=500 width=500>
</Applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class app_itemlistener extends  Applet implements ItemListener
{
	Checkbox op,nop,e,c,f;
	CheckboxGroup g;
	TextField t; 
	public void init()
	{
		t=new TextField(8);
		op=new Checkbox("Open",true,g);
		nop=new Checkbox("non-Open",false,g);
		e=new Checkbox("English");
		c=new Checkbox("Computer");
		f=new Checkbox("French");

		op.addItemListener(this);
		nop.addItemListener(this);
		c.addItemListener(this);
		e.addItemListener(this);
		f.addItemListener(this);

		add(t);
		add(op);
		add(nop);
		add(c);
		add(e);
		add(f);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		int amt=0;
		if(op.getState()==true)
		{
			if(e.getState()==true)
				amt+=1500;
			if(c.getState()==true)
				amt+=1000;
			if(f.getState()==true)
				amt+=1200;
		}
		else
		{
			if(e.getState()==true)
				amt+=1200;
			if(c.getState()==true)
				amt+=800;
			if(f.getState()==true)
				amt+=700;
		}
		t.setText(String.valueOf(amt));
	}
	
}