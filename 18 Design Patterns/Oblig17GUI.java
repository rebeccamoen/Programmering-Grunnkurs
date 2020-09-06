package oblig17;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Oblig17GUI extends JFrame implements ActionListener, KeyListener {
	
	Oblig17Kurv kurv = new Oblig17Kurv();
	
	ArrayList<Oblig17Epler> epleliste = new ArrayList<Oblig17Epler>();
	ArrayList<Oblig17DarligEpler> epleliste2 = new ArrayList<Oblig17DarligEpler>();
	
//	ArrayList<Oblig17Poeng> epleModel = new ArrayList<Oblig17Poeng>();
	
//	JMenuBar menuBar = new JMenuBar();
//		JMenu fil = new JMenu("Fil");
//		JMenuItem nytt = new JMenuItem("Nytt Spill");
	
	Random rg = new Random();
	
	public Oblig17GUI(){
		this.setVisible(true);
		FlowLayout f = new FlowLayout();
		this.setLayout(f);
		this.setTitle("Spill");
		this.setSize(700,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		this.setJMenuBar(menuBar);
//		this.menuBar.add(fil);
//		this.fil.add(nytt);
//		nytt.addActionListener(this);
		
		this.addKeyListener(this);
		
		Timer t = new Timer(20,this);
		t.start();
		
		for(int i=0; i<rg.nextInt(10); i++){ // Opptil 10 gode epler om gangen
			Oblig17Epler eple = new Oblig17Epler();
			epleliste.add(eple);
		}
	 	
		for(int i=0; i<rg.nextInt(5); i++){ // Opptil 5 dårlige epler om gangen
			Oblig17DarligEpler darligeple = new Oblig17DarligEpler();
			epleliste2.add(darligeple);
		}
	}

	public void drawStuff(){
		Graphics k = this.getGraphics(); // Tegner kurven
		k.clearRect(0, 0, this.getWidth(), this.getHeight());
		this.kurv.drawMe(k);

		Graphics g = this.getGraphics(); // Tegner eplene
		for(Oblig17Epler e2:epleliste){ // Tegner flere epler, legger til i arraylisten
			e2.drawMe(g);
		}
		for(Oblig17DarligEpler de2:epleliste2){ // Tegner flere dårlige epler, legger til i arraylisten
			de2.drawMe(g);
		}
	}

//	public void updateBeste(){ // ? Hentet fra Oblig9
//		double PoengScore = Integer.MIN_VALUE;
//		Oblig17Poeng e = epleModel.get(0);
//		for(int i=0;i<epleModel.size();i++){
//			Oblig17Poeng s = epleModel.get(i);
//			if(s.points>PoengScore){
//				e = s;
//				PoengScore = s.points;
//			}
//		}
//	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){ // Flytter kurven til høyre
			this.kurv.setX(this.kurv.getX()+15);
			this.drawStuff();
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT){ // Flytter kurven til venstre
			this.kurv.setX(this.kurv.getX()-15);
			this.drawStuff();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		for (Oblig17Epler e2 : epleliste) {
			e2.setY(e2.getY()+1); // Øker med 1 plass om gangen, flytter eplene		
		}

		for (Oblig17DarligEpler de2 : epleliste2) {
			de2.setY(de2.getY()+1); // Øker med 1 plass om gangen, flytter de dårlige eplene	
		}
		
		this.drawStuff();
	}
}
