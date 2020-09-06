import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class EtVindu extends JFrame implements ActionListener, MouseListener {
	
	JPopupMenu menuBar = new JPopupMenu();
	//JPopupMenu PopupmenuBar = new JPopupMenu();
	//JMenuBar menuBar = new JMenuBar();
	JMenu fil = new JMenu("Fil");
	JMenuItem aapne = new JMenuItem("Åpne");
	JMenuItem lagre = new JMenuItem("Lagre");
	JMenu rediger = new JMenu("Rediger");
	JMenuItem angre = new JMenuItem("Angre");

	public EtVindu(){
		//this.setJMenuBar(menuBar);
		this.menuBar.add(fil);
		this.fil.add(aapne);
		this.fil.add(lagre);
		this.menuBar.add(rediger);
		this.rediger.add(angre);
		lagre.addActionListener(this);
		this.addMouseListener(this);
		
		FlowLayout f = new FlowLayout();
		//GridLayout f = new GridLayout(2,2); //2,2 er hvor mange rader og kolloner det skal være
		//BorderLayout f = new BorderLayout(); //Med denne må man skrive nord, sør, øst eller vest ved knappene
		//this.setLayout(null); //Må sette inn koordinater og str selv
		this.setLayout(f);
		
		JButton Leonardo = new JButton("Leonardo");
		this.add(Leonardo);
		//Leonardo.setBounds(10, 10, 200, 200); //For Null
		//this.add(Leonardo,f.NORTH); //, f.NORTH pga BorderLayout
		JButton Donatello = new JButton("Donatello");
		this.add(Donatello);
		JButton Raphael = new JButton("Raphael");
		this.add(Raphael);
		JButton Michelangelo = new JButton("Michelangelo");
		this.add(Michelangelo);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(lagre)){
			JOptionPane.showMessageDialog(this, "Du trykket lagre");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton()==e.BUTTON3){ //BUTTON3 gir høyreklikk
			//if(e.getButton()==e.BUTTON3 && e.getClickCount()==2){ - da må man dobbeltklikke for å få den opp
			this.menuBar.show(this, e.getX(), e.getY());
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
