import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="button1" height=100 width=100></applet>
*/

public class button1 extends Applet implements ActionListener
{
        Button b1,b2;
        String s="";
        public void init()
        {
                setBackground(Color.pink);
                setForeground(Color.red);
                setFont(new Font("Monotype Corsiva",Font.ITALIC,34));
                b1=new Button("Rectangle");
                b2=new Button("Circle");
                add(b1);
                add(b2);
                b1.addActionListener(this);
                b2.addActionListener(this);
        }
        public void actionPerformed(ActionEvent ae)
        {
                s=ae.getActionCommand();
                repaint();
        }
        public void paint(Graphics g)
        {
                if(s.equals("Rectangle"))
                        g.drawRect(100,100,300,200);
                else if(s.equals("Circle"))
                        g.drawOval(100,100,300,200);
        }
}
