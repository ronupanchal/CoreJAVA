import java.applet.*;
import java.awt.*;
/*<applet code="applet1" height=500 width=500></applet>*/
public class applet1 extends Applet
{
        String s="";
        public void start()
        {
                s+="Start..";
        }
        public void init()
        {
                s="Init..";
                setBackground(Color.cyan);
                setForeground(Color.blue);
                setFont(new Font("Arial",Font.BOLD|Font.ITALIC,34));
        }
        public void stop()
        {
                s+="stop..";
        }
        public void destroy()
        {
                s+="destroy..";
        }
        public void paint(Graphics g)
        {
                g.drawString(s,100,200);
        }
}
