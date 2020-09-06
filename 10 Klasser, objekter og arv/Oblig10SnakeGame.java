import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Oblig10SnakeGame extends JFrame implements ActionListener, KeyListener {
	
	JLabel tekst = new JLabel();
	Oblig10SnakeElement se = new Oblig10SnakeElement();
	
	public Oblig10SnakeGame(){
		FlowLayout f = new FlowLayout();
		this.setLayout(f);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setVisible(true);
		
		this.addKeyListener(this);
		this.add(tekst);
		
		Timer t = new Timer(80,this);
		t.start();
	}		
	public void drawStuff(){
		Graphics g = this.getGraphics();
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		this.se.drawMe(g);
	}
	public void actionPerformed(ActionEvent e){
		//this.se.setY(this.se.getY()+1);
		//this.drawStuff();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_UP){
			System.out.println("Du trykket oppoverpil");
			this.se.setY(this.se.getY()-10);
			this.drawStuff();
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN){
			System.out.println("Du trykket nedoverpil");
			this.se.setY(this.se.getY()+10);
			this.drawStuff();
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			System.out.println("Du trykket høyrepil");
			this.se.setX(this.se.getX()+10);
			this.drawStuff();
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT){
			System.out.println("Du trykket venstrepil");
			this.se.setX(this.se.getX()-10);
			this.drawStuff();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
