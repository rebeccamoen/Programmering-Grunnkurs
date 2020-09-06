package oblig14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Oblig14 extends JFrame implements ActionListener {

	JButton trekktall = new JButton("Trekk tall");
	JButton sjekk = new JButton("Sjekk om riktig");
	
	DefaultListModel m1 = new DefaultListModel();
	JList l1 = new JList();
	ArrayList<Integer> a = new ArrayList<Integer>();
	
	DefaultListModel m2 = new DefaultListModel();
	JList l2 = new JList();
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	
	DefaultListModel m3 = new DefaultListModel();
	JList l3 = new JList();
	ArrayList<Integer> a3 = new ArrayList<Integer>();
	
	//ArrayList l = new ArrayList();
	//l.add(29);
	//l.add(35);
	//oppdaterGUI(this.minliste,l.toArray());
	
	public Oblig14(){
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(800,400);
		
		this.add(trekktall);
		trekktall.addActionListener(this);
		this.add(sjekk);
		sjekk.addActionListener(this);
		
		this.add(new JLabel("Lottotall:"));
		this.add(l1);
		this.add(new JLabel("Unike lottotall:"));
		this.add(l2);
		this.add(new JLabel("Sorterte:"));
		this.add(l3);
		
		oppdaterGUI(l1, a.toArray());
		oppdaterGUI(l2, a.toArray());
		oppdaterGUI(l3, a.toArray());
	}
	
	public void oppdaterGUI(JList enliste, Object[] tall){
		DefaultListModel m = new DefaultListModel();
		for (Object s : tall){
			m.addElement(s);
		}
		enliste.setModel(m);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(trekktall)){
			for(int i = 0; i < 20; i++){
				Random rg = new Random();
				int ettall = rg.nextInt(20)+1;
				//tall.add(ettall);
				//tall2.add(ettall);
				//tall3.add(ettall);
			}
		}
	}
}
