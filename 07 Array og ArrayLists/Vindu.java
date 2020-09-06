import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Vindu extends JFrame{
		
	ArrayList<Point> punkter = new ArrayList<Point>();
	public Vindu(){
		Point p1 = new Point();
		p1.x = 60;
		p1.y = 60;
		this.punkter.add(p1);
		
		Point p2 = new Point();
		p2.x = 100;
		p2.y = 100;
		this. punkter.add(p2);
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		Point etpunkt = this.punkter.get(0);
		g.fillRect(etpunkt.x, etpunkt.y, 20, 20);
	}

}
