 import java.awt.*;
 import java.applet.*;
 /*
 <applet code="appletDemos.class" height="400" width="500">
 </applet>
 */
 public class appletDemos extends Applet
 {
	  public void init()
	  {
		  setBackground(Color.yellow);
		  setForeground(Color.cyan);
	  }
      public void paint(Graphics g)
        {
                g.drawString("Hello Applet..!",10,20);
        }
}