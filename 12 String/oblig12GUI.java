package oblig12;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class oblig12GUI extends JFrame implements ActionListener{
	
	final int BREDDE_I_BOKSTAVER = 9;
	final int HOYDE_I_BOKSTAVER = 9;
	
	ArrayList<JTextField> sudokubrett = new ArrayList<JTextField>();
	int starttall = 2;
	
	JMenuBar menuBar = new JMenuBar();
	
	JMenu fil = new JMenu("Fil");
	JMenuItem nytt = new JMenuItem("Nytt Spill");
	JMenuItem slett = new JMenuItem("Slett");
	
	JMenu velg = new JMenu("Vanskelighetsgrad");
	JMenuItem lett = new JMenuItem("Lett");
	JMenuItem medium = new JMenuItem("Medium");
	JMenuItem vanskelig = new JMenuItem("Vanskelig");

	public oblig12GUI(){
		this.setJMenuBar(menuBar);
		
		this.menuBar.add(fil);
		this.fil.add(nytt);
		this.fil.add(slett);
		
		this.menuBar.add(velg);
		this.velg.add(lett);
		this.velg.add(medium);
		this.velg.add(vanskelig);
		
		slett.addActionListener(this);
		nytt.addActionListener(this);
		lett.addActionListener(this);
		medium.addActionListener(this);
		vanskelig.addActionListener(this);
		
		this.setLayout(new GridLayout(BREDDE_I_BOKSTAVER, HOYDE_I_BOKSTAVER));
		for(int i=0;i<BREDDE_I_BOKSTAVER;i++){
			for(int j=0;j<HOYDE_I_BOKSTAVER;j++){
				JTextField f = new JTextField();
				this.add(f);
				this.sudokubrett.add(f);
			}
		}
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.fyllUt();
	}
	
	public void slettalt(){
		for(JTextField felt:this.sudokubrett){
			if(felt.isEditable()){
				felt.setText(" ");
				}
			}
		}
	
	public void fyllUt(){
		Random rg = new Random();
		
		for(JTextField felt:this.sudokubrett){
			int tall = rg.nextInt(8);
			tall++;
			String tellTekst = String.valueOf(tall);
			felt.setEditable(true);
			felt.setText(null);
			if(rg.nextInt(starttall)==0){
				felt.setText(tellTekst);
				felt.setEditable(false);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(slett)){
			this.slettalt();
		}
		
		if(e.getSource().equals(nytt)){
			starttall = 2;
			this.fyllUt();
		}
		if(e.getSource().equals(lett)){
			starttall = 2;
			this.fyllUt();
		}
		if(e.getSource().equals(medium)){
			starttall = 5;
			this.fyllUt();
		}
		if(e.getSource().equals(vanskelig)){
			starttall = 10;
			this.fyllUt();
		}
	}
}