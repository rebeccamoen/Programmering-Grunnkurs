package oblig9;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Oblig9 extends JFrame implements ActionListener{
	
	JButton leggTil = new JButton(); 
	JButton sok = new JButton();
	DefaultListModel<Oblig9Brus> listeBrus = new DefaultListModel<Oblig9Brus>();
	DefaultListModel<Oblig9Brus> brusModel = new DefaultListModel<Oblig9Brus>();
	
	public Oblig9(){
		FlowLayout f = new FlowLayout();
		this.setLayout(f);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 400);

		leggTil.setText("Legg til brus");
		this.add(leggTil);
		leggTil.addActionListener(this);
		
		sok.setText("Søk");
		this.add(sok);
		sok.addActionListener(this);
		
		JList liste = new JList(listeBrus);
		this.add(liste);
		
		try {
			URL url = new URL("http://1.vgc.no/drpublish/images/article/2014/12/11/23354051/1/fullbredde/2330493.jpg");
			Image image = ImageIO.read(url);
			ImageIcon i = new ImageIcon(image);
			JLabel l = new JLabel(i);
			this.add(l);
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(leggTil)){
			
			Oblig9Brus f = new Oblig9Brus();
			
			String navn = JOptionPane.showInputDialog(this, "Skriv et merke");
			f.setNavn(navn);
			String poengBrus = JOptionPane.showInputDialog(this, "Skriv inn poengsum");
			int poeng = Integer.parseInt(poengBrus);
			
			f.setPoengBrus(poeng);
			listeBrus.addElement(f);
		}
		if(e.getSource().equals(sok)){
			
			Oblig9Brus f = new Oblig9Brus();
			
			String navn = JOptionPane.showInputDialog(this, "Skriv et merke");
			f.setNavn(navn);
			
			for(int i=0; i<brusModel.getSize(); i++){
				Oblig9Brus enBrus = brusModel.getElementAt(i);
			}
		}
	}
}