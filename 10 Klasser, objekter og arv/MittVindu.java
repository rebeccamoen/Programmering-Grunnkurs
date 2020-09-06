import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MittVindu extends JFrame implements ActionListener,KeyListener { private int ypos;

JLabel tekst = new JLabel();

	public MittVindu(){
		FlowLayout f = new FlowLayout();
		this.setLayout(f);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Husk å lage objekt av MittVindu i Runner classen, mv
		
		JButton knapp = new JButton("Trykk på meg"); // Setter navn på knapp
		this.add(knapp); 							 // Legger til knappen i vinduet
		knapp.addActionListener(this);				 // Legger til ActionListener for at knappen skal funke
													 // NB! Husk implements ActionListener øverst i classen!
		this.setSize(400, 400);
		this.setVisible(true);
		
		Timer t = new Timer(100, this);			 // Hvor fort den skal bytte, 100 er fortere enn 1000 eks
		t.start();
		
		this.addKeyListener(this);
		this.add(tekst);
	}

	public void actionPerformed(ActionEvent arg0) {
		Graphics g = this.getGraphics();
		
		Color c = new Color(255,0,0);				 // Velger farge, denne blir rød
		g.setColor(c);								 // Setter fargen
		g.fillOval(50, 50, 100, 100);				 // Tegner en Oval, velger posisjon og størrelse
		
		Color c2 = new Color(0,100,255);			 // Velger en ny farge, denne blir blå
		g.setColor(c2);								 // Setter den nye fargen
		g.fillRect(100, 150, 50, 50);				 // Tegner en Firkant, velger posisjon og størrelse
		
		Random rg = new Random();
		Color c3 = new Color(rg.nextInt(255),rg.nextInt(255),rg.nextInt(255));	 // Velger tilfeldige farger
		g.setColor(c3);
		g.fillOval(rg.nextInt(500), rg.nextInt(500), 100, 100);				 	 // Velger tilfeldig posisjon
		
		for(int i=500; i > 0; i=i-1){				 // Skal tegne flere sirkler, minke med 1 fra 500 til 0
			Color c4 = new Color(rg.nextInt(255),rg.nextInt(255),rg.nextInt(255));
			g.setColor(c4);
			g.fillOval(300-i/2, 300-i/2, i, i); 	 // Width og height skal alltid være i, 300-i/2 finner sentrum
		}
		
		this.ypos = this.ypos +1;
		Color c5 = new Color(255,0,0);				 // Velger farge, denne blir rød
		g.clearRect(0, 0, 500, 500);				 // Fjerner resten etter den har flyttet seg
		g.setColor(c5);								 // Setter fargen
		g.fillRect(200, this.ypos, 50, 50);			 // Tegner en firkant som flytter seg i y retning
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_UP){
			JOptionPane.showMessageDialog(null, "Du trykket oppoverpil");
		}
		
		JOptionPane.showMessageDialog(this, "Du har trykket");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
