import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class forelesning5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//KLASSENAVN variabelnavn = new KLASSENAVN();
		boller mineboller = new boller();
		mineboller.setTitle("Boller til meg");
		
		boller mineboller2 = new boller();		
		mineboller2.setTitle("Boller til deg");
		
		pannekaker minepannekaker = new pannekaker();
		minepannekaker.setTitle("Pannekaker");
		
		for(int i=1;i<=10;i=i+1){
			boller mineboller3 = new boller();
			mineboller3.setTitle("Bolle nr "+i);
		}
		
		int i = 2;
		// Integer i2=new Integer(2); denne kan brukes, men den over er bedre.
		
		JFrame mittvindu = new JFrame();
		mittvindu.setVisible(true);
		mittvindu.setSize(400,400);
		mittvindu.setTitle("Dette er en tittel");
		
		JButton minknapp = new JButton();
		minknapp.setText("Trykk her");
		
		mittvindu.add(minknapp);
		*/
		
		student student1 = new student();
		student1.etternavn = "Moen";
		student1.fornavn = "Rebecca";
		student1.studentnummer = 783914;
		JOptionPane.showMessageDialog(null, student1.fornavn);
		
		student student2 = new student();
		student2.etternavn =  "Lofthus";
		student2.fornavn = "Jenny";
		student2.studentnummer = 123456;
		JOptionPane.showMessageDialog(null, student2.fornavn);
		JOptionPane.showMessageDialog(null, student2.fullførtutdannelse);
		
		int tall = student2.plussTo(10, 15);
		System.out.println("Tallet er: " +tall);
		String helenavnet = student2.getFulltnavn();
		JOptionPane.showMessageDialog(null, helenavnet);
		
		bankkonto minkonto = new bankkonto();
		minkonto.saldo = 1000;
		minkonto.eier = "Rebecca";
		minkonto.kontotype = "Brukskonto";
		JOptionPane.showMessageDialog(null, minkonto.eier);
		
	}

}
