package oblig11;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Oblig11 extends JFrame implements DocumentListener {
	JTextPane tekst = new JTextPane();
	JTextPane oversatt = new JTextPane();
	JButton knapp = new JButton("Oversett");
	
	public Oblig11(){
	FlowLayout f = new FlowLayout();
	this.setLayout(f);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(900, 500);
	this.add(tekst);
	this.tekst.setPreferredSize(new Dimension(400,400));
	this.tekst.setContentType("text/html");
	this.tekst.getDocument().addDocumentListener(this);
	this.oversatt.setPreferredSize(new Dimension(400,400));
	this.oversatt.setContentType("text/html");
	this.add(oversatt);
	//this.knapp.addActionListener(this);
	//this.add(knapp);
	this.setVisible(true);
	}
	
	public String oversatt(String input){
		input = input.replace("jeg", "eg");
		input = input.replace("dere", "dokker");
		input = input.replace("ikke", "ikkje");
		return input;
	}
	
	public String markerOrd(String oversatt, String tekst){
		String nyoversatt = tekst.replace(oversatt, "<font color=\"red\">");
		return nyoversatt;
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		String fratekst = this.tekst.getText();
		String nytekst = this.oversatt(fratekst);
		String nyoversatt = this.markerOrd(fratekst,nytekst);
		this.oversatt.setText(nyoversatt);
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}
}
