import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class View extends JFrame{
	
	JButton knapp = new JButton("Hent data fra fil");
	JTextArea felt = new JTextArea();
	
	public View(Controller c){
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		this.add(knapp);
		this.add(felt);
		knapp.addActionListener(c);
		
	}

}
