package oblig6;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Oblig6 extends JFrame{
	public Oblig6(){
		this.setVisible(true);
		this.setTitle("Julekalender");
		
		FlowLayout f = new FlowLayout();
		this.setLayout(f);
		
		JLabel tekst = new JLabel();
		tekst.setText("Velkommen til årets julekalender");
		this.add(tekst);
		
		for (int lukenr=1; lukenr<=24; lukenr = lukenr +1){
			JButton knapp = new JButton();
			knapp.setText("Luke: " + lukenr);
			this.add(knapp);
		}
		
	}
}
