package oblig8;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Oblig8 extends JFrame implements ActionListener{
	public String stein = "stein";
	public String saks = "saks";
	public String papir = "papir";
	
	JButton spiller1 = new JButton();
	JButton spiller2 = new JButton();
	
	public Oblig8(){
		FlowLayout f = new FlowLayout();
		this.setVisible(true);
		this.setLayout(f);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(600, 300);
	    
	    spiller1.setText("Spiller 1");
		this.add(spiller1);
		spiller1.addActionListener(this);
		
		spiller2.setText("Spiller 2");
		this.add(spiller2);
		spiller2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		/*if(e.getSource().equals(spiller1)){ 
			String brukersvar1 = JOptionPane.showInputDialog(this, "Spiller 1: Velg stein, saks eller papir");
		}
		else{
			String brukersvar2 = JOptionPane.showInputDialog(this, "Spiller 2: Velg stein, saks eller papir");
		}
		*/
		String brukersvar1 = JOptionPane.showInputDialog(this, "Spiller 1: Velg stein, saks eller papir");
		String brukersvar2 = JOptionPane.showInputDialog(this, "Spiller 2: Velg stein, saks eller papir");
		
		if(brukersvar1.equals(brukersvar2)){
			System.out.println("Spiller 1 valgte " + brukersvar1 + " og spiller 2 valgte " + brukersvar2);
			System.out.println("Uavgjort");
		}
		else{
			if(brukersvar1.equals("stein")){
				if(brukersvar2.equals("saks")){
					System.out.println("Spiller 1 valgte " + brukersvar1 + " og spiller 2 valgte " + brukersvar2);
					System.out.println("Stein knuser saks. Spiller 1 vant");
				}
				else {
					System.out.println("Spiller 1 valgte " + brukersvar1 + " og spiller 2 valgte " + brukersvar2);
					System.out.println("Papir dekker stein. Spiller 2 vant");
				}
			}
			else if(brukersvar1.equals("papir")){
				if(brukersvar2.equals("stein")){
					System.out.println("Spiller 1 valgte " + brukersvar1 + " og spiller 2 valgte " + brukersvar2);
					System.out.println("Papir dekker stein. Spiller 1 vant");
				}
				else{
					System.out.println("Spiller 1 valgte " + brukersvar1 + " og spiller 2 valgte " + brukersvar2);
					System.out.println("Saks klipper papir. Spiller 2 vant");
				}
			}
			else if(brukersvar1.equals("saks")){
				if(brukersvar2.equals("papir")){
					System.out.println("Spiller 1 valgte " + brukersvar1 + " og spiller 2 valgte " + brukersvar2);
					System.out.println("Saks klipper papir. Spiller 1 vant");
				}
				else{
					System.out.println("Spiller 1 valgte " + brukersvar1 + " og spiller 2 valgte " + brukersvar2);
					System.out.println("Stein knuser saks. Spiller 2 vant");
				}
			}
			else{
				System.out.println("Ugyldig valg, prøv igjen");
			}
		}
	}
}
