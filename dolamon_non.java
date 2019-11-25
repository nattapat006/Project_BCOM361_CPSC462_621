import java.applet.*;
import java.awt.*;
public class dolamon_non extends Applet {
  Image img;
  public void init() {
    setBackground(Color.cyan);
  }
  public void paint(Graphics g) {
g.setColor(Color.black);
g.drawOval(60,340,300,100);
g.drawOval(190,340,300,100);

g.drawArc(123,322,300,300,0,360);
g.setColor(Color.blue);
g.fillArc(123,322,300,300,0,360);
g.fillOval(60,340,300,100); 
g.fillOval(190,340,300,100);
g.setColor(Color.black);
g.drawArc(178,315,190,190,0,360);
g.setColor(Color.white);
g.fillArc(178,315,190,190,0,360);
g.setColor(Color.black);
g.drawArc(220,330,110,110,180,180);
g.drawLine(330,385,220,385);

g.setColor(Color.black);
g.drawArc(20,350,80,80,0,360);
g.drawArc(440,350,80,80,0,360);
g.drawLine(480,400,480,300);
g.setColor(Color.red);
g.fillArc(450,250,60,60,0,360);
g.setColor(Color.white);
g.fillArc(455,250,50,50,0,360);
g.setColor(Color.red);
g.fillArc(460,250,40,40,0,360);
g.setColor(Color.white);
g.fillArc(20,350,80,80,0,360);
g.fillArc(440,350,80,80,0,360);

g.setColor(Color.black);
g.drawArc(100,30,350,320,0,360);
g.setColor(Color.blue);
g.fillArc(100,30,350,320,0,360);
g.setColor(Color.black);
g.drawArc(126,85,300,270,0,360);
g.setColor(Color.white);
g.fillArc(126,85,300,270,0,360);

g.setColor(Color.black);
g.drawOval(210,40,65,95);
g.setColor(Color.white);
g.fillOval(210,40,65,95);
g.setColor(Color.black);
g.drawOval(275,40,65,95);
g.setColor(Color.white);
g.fillOval(275,40,65,95);

g.setColor(Color.black);
g.drawOval(240,70,15,25);
g.fillOval(240,70,15,25);
g.drawOval(300,70,15,25);
g.fillOval(300,70,15,25);

g.drawArc(255,120,40,40,0,360);
g.setColor(Color.red);
g.fillArc(255,120,40,40,0,360);

g.setColor(Color.black);
g.drawArc(200,180,140,120,180,180);
g.drawLine(275,160,275,300);

g.drawLine(250,190,160,150);
g.drawLine(250,200,150,200);
g.drawLine(250,210,160,250);
g.drawLine(380,250,300,210);
g.drawLine(390,200,300,200);
g.drawLine(380,150,300,190);

g.drawRect(195,330,165,30);
g.setColor(Color.red);
g.fillRect(195,330,165,30);
g.setColor(Color.black);
g.drawArc(260,340,30,30,0,360);
g.setColor(Color.yellow);
g.fillArc(260,340,30,30,0,360);
g.setColor(Color.black);
g.drawLine(275,370,275,350);
g.drawArc(271,346,8,8,0,360);
g.fillArc(271,346,8,8,0,360);

g.setColor(Color.black);
g.fillOval(100,480,135,165);
g.fillOval(325,480,135,165);
g.setColor(Color.white);
g.fillOval(100,480,135,165);
g.fillOval(325,480,135,165);

g.setColor(Color.black);
g.drawArc(195,70,80,80,0,360);
g.drawArc(440,350,80,80,0,360);
g.drawLine(480,400,480,300);

g.setColor(Color.black);
g.drawArc(280,70,80,80,0,360);
g.drawArc(440,350,80,80,0,360);
g.drawLine(480,400,480,300);

g.drawLine(200,90,140,60);

g.drawLine(140,60,60,360);

/*g.setColor(Color.red);
g.fillRect(195,330,165,30);*/
}
} 