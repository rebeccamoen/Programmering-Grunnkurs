import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Tetris extends JFrame implements ActionListener{ // Vindu klasse
	Boks b = new Boks();
	
	public Tetris(){
		this.setVisible(true);
		Timer t = new Timer(10,this);
		t.start();
	}
	
	public void tegnAlt(){ // Tegner figurene
		Graphics g = this.getGraphics();
		g.clearRect(0, 0, 500, 500); // Sletter figuren
		this.b.tegnMeg(g); // Tegner figuren
		
	}
	public void actionPerformed(ActionEvent e){
		this.b.setY(this.b.getY()+1); // Øker med litt, flytter figurene
		this.tegnAlt(); // I tillegg med å flytte boksen kaller den det tegnAlt
	}

	// Husk å lage objekt av Tetris i Runner
}
