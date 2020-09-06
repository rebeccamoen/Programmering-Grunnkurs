import javax.swing.JOptionPane;

public class fingeravtrykk extends bevis{
	public String finger;
	
	public fingeravtrykk(){
	this.finger = JOptionPane.showInputDialog(null, "Hvilken finger?");
	}
}
