import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image; 

/*
<applet code = "DisplayImageExample" width = 500 height = 300>
<param name = "Image1" value = "one.jpg">
<param name = "Image2" value = "two.jpg">
</applet>
*/
public class DisplayImageExample extends Applet
{
	Image img1, img2; 
	public void init()
	{
		
		img1 = getImage(getDocumentBase(), getParameter("Image1"));
		img2 = getImage(getDocumentBase(), getParameter("Image2"));
	}
	public void paint(Graphics g)
	{
		g.drawImage(img1, 0,0,this);
		g.drawImage(img2, 100,100,this);
	}
}
