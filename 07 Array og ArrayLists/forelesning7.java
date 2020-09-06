import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class forelesning7 {
	
	public static void main(String[] args) {
		Vindu v = new Vindu();
		
		double loepDeltager1 = 10.21;
		double loepDeltager2 = 10.30;
		double loepDeltager3 = 10.25;
		
		//VARIABELTYPE[] navn = new VARIABELTYPE [STØRRELSE];
		double[] loep = new double[3];
		loep[0] = 10.21;
		loep[1] = 10.30;
		loep[2] = 10.25;
		JOptionPane.showMessageDialog(null, "Første deltager løp på " +loep[0]);
		
		String[] navn = new String[3];
		navn[0] = "Luke";
		navn[1] = "Leia";
		navn[2] = "Anakin";
		
		String[] navn2 = {"Luke", "Leia", "Anakin"}; //Helt lik måte som den ovenfor, bare enklere å skrive
		
		int svar = JOptionPane.showOptionDialog(null, "Hvem er slemmest?", "StarWars-spørsmål", 0, 0, null, navn, navn[0]);
		JOptionPane.showMessageDialog(null, "Du svarte: " +navn[svar]);
		
		//ArrayList<VARIABELTYPE> navn = new ArrayList<VARIABELTYPE>();
		ArrayList<String> navneliste = new ArrayList<String>();
		navneliste.add("Luke");
		navneliste.add("Leia");
		navneliste.add("Han Solo");
		navneliste.remove("Leia");
		String s = JOptionPane.showInputDialog(null, "Skriv et nytt navn");
		navneliste.add(s);
		
		System.out.println(navneliste);
		
		ArrayList<String> handleliste = new ArrayList<String>();
		String vare = JOptionPane.showInputDialog(null, "Skriv en ny vare");
		handleliste.add(vare);
		
		System.out.println(handleliste);
		String forstevare = handleliste.get(0);
		JOptionPane.showMessageDialog(null, "Første på handlelisten er: " +forstevare);
		
		for(int i=0; i<loep.length; i = i+1){
			JOptionPane.showMessageDialog(null, loep[i]);
		}
		
		for(int i=0; i<navneliste.size(); i=i+1){
			String etNavn = navneliste.get(i);
			JOptionPane.showMessageDialog(null, etNavn);
		}
		
		for(int i=0; i<navneliste.size(); i=i+1){
			JOptionPane.showMessageDialog(null, navneliste.get(i));
		}
		
		double minste = 10000;
		for(int i=0; i<loep.length; i=i+1){
			if(loep[i]<minste){
				minste = loep[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, "Minste er: " +minste);
		
		double største = 0;
		for(int i=0; i<loep.length; i=i+1){
			if(loep[i]>største){
				største = loep[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, "Største er: " +største);
		
		Point p = new Point();
		p.x = 13;
		p.y = 29;
		
		ArrayList<Point> punkter = new ArrayList<Point>();
		Point p1 = new Point();
		p1.x = 13;
		p1.y =29;
		punkter.add(p1);
	}

}
