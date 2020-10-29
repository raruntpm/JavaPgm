/*
<applet code="ExImage1" width=400 height=400>
</applet>
*/

import java.applet.Applet;
import java.awt.*;


public class ExImage1 extends Applet
{

       public void init()
      
    {
         setBackground(Color.pink);
System.out.println("init");
     }
public void stop()
{
System.out.println("stop");
}

public void start()
{
System.out.println("start");
}
public void destroy()
{
System.out.println("destroy");
}

        public void paint(Graphics g)
        {

                g.drawString("hello world",100,70);

        }

}