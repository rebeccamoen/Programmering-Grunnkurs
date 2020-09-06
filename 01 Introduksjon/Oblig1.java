package oblig1;

import javax.swing.JOptionPane;

public class Oblig1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// telefon.start();
		// telefon.åpne.Instagram();
		// telefon.åpne.kamera();
		// telefon.kamera.ta(bilde);
		// telefon.velg(neste);
		// telefon.velg(del);
		
		System.out.println("Dette er mitt\nførste program");
		JOptionPane.showMessageDialog(null, "Dette er mitt\nførste program");
		String navn;
		navn = JOptionPane.showInputDialog(null, "Hva heter du?");
		String utskrift;
		utskrift = "Hei " + navn;
		JOptionPane.showMessageDialog(null,  utskrift);

		System.out.println("Dette skal komme til skjermen");
		JOptionPane.showMessageDialog(null, "Dette skal komme som dialogbokser");
		System.out.println("En ny linje som kommer til skjermen");
		System.out.println("En siste linje som kommer til skjermen");
		System.out.println("En aller siste linje til skjermen");
		
	}

}
