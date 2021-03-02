 import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="sufful.class" height=400 width=400>
</applet>
*/
public class sufful extends Applet implements ActionListener
{
        Button b[]=new Button[16];
        public void init()
        {
                b[0]=new Button("1");
                b[1]=new Button("2");
                b[2]=new Button("3");
                b[3]=new Button("4");
                b[4]=new Button("5");
                b[5]=new Button("6");
                b[6]=new Button("7");
                b[7]=new Button("8");
                b[8]=new Button("9");
                b[9]=new Button("10");
                b[10]=new Button("11");
                b[11]=new Button("12");
                b[12]=new Button("13");
                b[13]=new Button("14");
                b[14]=new Button("15");

                for(int i=0;i<15;i++)
                {
                        add(b[i]);
                        b[i].addActionListener(this);
                }

                b[0].setBounds(1,1,20,20);
                b[1].setBounds(21,1,20,20);
                b[2].setBounds(41,1,20,20);
                b[3].setBounds(61,1,20,20);
                b[4].setBounds(1,21,20,20);
                b[5].setBounds(21,21,20,20);
                b[6].setBounds(41,21,20,20);
                b[7].setBounds(61,21,20,20);
                b[8].setBounds(1,41,20,20);
                b[9].setBounds(21,41,20,20);
                b[10].setBounds(41,41,20,20);
                b[11].setBounds(61,41,20,20);
                b[12].setBounds(1,61,20,20);
                b[13].setBounds(21,61,20,20);
                b[14].setBounds(41,61,20,20);    
                setLayout(null);
        }
        public void actionPerformed(ActionEvent ae)
        {
                                
        }
}
