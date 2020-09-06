import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JFrame;

public class MittVindu extends JFrame implements MouseListener, MouseMotionListener{
	int storrelse = 10;
	boolean opp = true; // boolean er "sant" eller "usant
	
	public MittVindu(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//FlowLayout f = new FlowLayout();
		//this.setLayout(f);
		this.setLayout(new FlowLayout()); // Samme som de over, bare anonymt
		this.setSize(1000, 500);
		this.setVisible(true);
		this.addMouseListener(this); // Hvem skal lytte? Meg selv! :)
		this.addMouseMotionListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g = this.getGraphics();
		Graphics f = this.getGraphics();
		Graphics h = this.getGraphics();
		Graphics i = this.getGraphics();
		Graphics j = this.getGraphics();
		//Color c = new Color(255,0,0);
		//g.setColor(c);
		g.setColor(new Color(255,0,0)); // Samme som de over, bare anonymt
		f.setColor(new Color(255,255,255));
		h.setColor(new Color(255,0,0));
		i.setColor(new Color(255,255,255));
		j.setColor(new Color(255,0,0));
		int x = e.getX();
		int y = e.getY();
		g.fillOval(x, y, 100, 100); // Tegner opp x og y lik x og y til musepekern
		f.fillOval(x+10, y+10, 80, 80);
		h.fillOval(x+20, y+20, 60, 60);
		i.fillOval(x+30, y+30, 40, 40);
		j.fillOval(x+40, y+40, 20, 20);
		g.drawString("Jeg var her", x, y);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g = this.getGraphics();
		Random rg = new Random();
		Color c = new Color(rg.nextInt(255),rg.nextInt(255),rg.nextInt(255));
		g.setColor(c);
		g.fillOval(e.getX(), e.getY(), this.storrelse, this.storrelse);
		if(this.storrelse==50){ // Hvis størrelsen er 50
			this.opp = false;	// Så er ikke opp sant
		}
		if(this.storrelse==10){ // Hvis størrelsen er 10
			this.opp = true;	// Så er opp sant
		}
		if(this.opp==true){		// Hvis den er sann så skal den gå opp
			//this.storrelse = this.storrelse +1; // Da vil størrelsen øke med 1 når man drar
			this.storrelse++; // Gjør det samme som linjen over, bare skrevet lettere, ++ betyr 1
		}
		else{
			this.storrelse--;	// Hvis den ikke er sann så skal den gå ned, -- betyr ned 1
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
