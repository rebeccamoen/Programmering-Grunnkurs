import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class mittvindu extends JFrame{
	public mittvindu(){
	JOptionPane.showMessageDialog(null, "Nå lager vi vindu");
	
		this.setVisible(true);
		this.setTitle("Mitt supre fine vindu");
	
		FlowLayout l = new FlowLayout();
		this.setLayout(l);
		
		JButton knapp1 = new JButton();
		knapp1.setText("Trykk på meg");
		this.add(knapp1);
		
		JButton knapp2 = new JButton();
		knapp2.setText("Nei, trykk heller på meg");
		this.add(knapp2);
		
		JLabel tekst = new JLabel();
		tekst.setText("Her er en overskrift");
		this.add(tekst);
		
		ImageIcon i = new ImageIcon("src/bb8.gif");
		JLabel L2 = new JLabel();
		L2.setIcon(i);
		this.add(L2);
	}
}
