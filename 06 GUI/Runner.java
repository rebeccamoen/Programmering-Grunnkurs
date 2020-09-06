import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		student student1 = new student();
		student1.studentnummer = 12345;
		student1.fornavn = "Darth";
		student1.etternavn = "Vader";
		JOptionPane.showMessageDialog(null, student1.etternavn);
		
		datastudent student2 = new datastudent();
		student2.studentnummer = 12346;
		student2.fornavn = "Kylo";
		student2.etternavn = "Ren";
		JOptionPane.showMessageDialog(null, student2.dat101eksamen);
		
		student2.snakk();
		
		dnabevis d = new dnabevis();
		d.etterforsker = "Sam Vimes";
		JOptionPane.showMessageDialog(null, "Kvaliteten er " + d.kvalitet);
		
		fingeravtrykk f = new fingeravtrykk();
		JOptionPane.showMessageDialog(null, f.finger);
		
		mittvindu m = new mittvindu();
		
	}
}
