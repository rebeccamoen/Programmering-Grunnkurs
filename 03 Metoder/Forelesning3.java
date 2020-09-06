import javax.swing.JOptionPane;

public class Forelesning3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String alder_i_tekst = JOptionPane_showInputDialog(null, "Skriv din alder");
		int alder = Integer.parseInt(alder_i_tekst);
		if(alder<14){
			JOptionPane.showMessageDialog(null, "Barnebillett");
		}
		else if(alder>72){
			JOptionPane.showMessageDialog(null, "Pensjonist");
		}
		else{
			JOptionPane.showMessageDialog(null, "Voksenbillett");
		}
		
		String navn = JOptionPane.showInputDialog(null, "Ditt navn");
		JOptionPane.showMessageDialog(null, "Beskjed");
		int tall = Integer.parseInt("23");
		System.out.println("En beskjed");
		
	}

	private static String JOptionPane_showInputDialog(Object object, String string) {
		// TODO Auto-generated method stub
		return null;
	}
		*/
		
		Forelesning3del2 f = new Forelesning3del2();
		String tekstKilometer = JOptionPane.showInputDialog(null, "Skriv km");
		int kilometer = Integer.parseInt(tekstKilometer);
		int meter = f.kmTilMeter(kilometer);
		JOptionPane.showMessageDialog(null, kilometer + " km er " + meter + " meter");

		String krTilDollar = JOptionPane.showInputDialog(null, "Skriv kroner");
		double kroner = Double.parseDouble(krTilDollar);
		double dollar = f.krTilDollar(kroner);
		JOptionPane.showMessageDialog(null, kroner + " kr er " + dollar + " dollar");
		
		double forstetall = 12.2;
		double andretall = 29.12;
		double s = f.storste(forstetall, andretall);
		JOptionPane.showMessageDialog(null, s + " er storst");
	}	
		
}
