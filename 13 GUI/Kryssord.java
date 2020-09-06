import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Kryssord extends JFrame {

	final int BREDDE_I_BOKSTAVER = 20;
	final int HOYDE_I_BOKSTAVER = 20;
	
	ArrayList<JTextField> kryssordbrett = new ArrayList<JTextField>(); // For å kunne hente ut inne fra {}
	
	
	public Kryssord(){
		this.setLayout(new GridLayout(BREDDE_I_BOKSTAVER, HOYDE_I_BOKSTAVER));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i=0;i<BREDDE_I_BOKSTAVER;i++){
			for(int j=0;j<HOYDE_I_BOKSTAVER;j++){
				//JTextField f = new JTextField();
				BlinkeKryssordFelt f = new BlinkeKryssordFelt();
				this.add(f);
				this.kryssordbrett.add(f); // Legger til i kryssordbrett utenfor {}
			}
		}
		this.setVisible(true);
		this.gjorHverTredjeSvart();
		this.fyllUt();
	}
	
	public void gjorHverTredjeSvart(){
		Random rg = new Random();
		for(JTextField felt:this.kryssordbrett){
			if(rg.nextInt(3)==0){
			felt.setBackground(Color.BLACK);
			felt.setEditable(false);
			}
		}
	}
	
	public void fyllUt(){
		//Fylle ut alle feltene
		for(JTextField felt:this.kryssordbrett){
			felt.setText("A");
		}
	}
}