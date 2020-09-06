import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class MittVindu extends JFrame {
	
	JList listen = new JList();
	//ArrayList<Integer> a = new ArrayList<Integer>();
	ArrayList<Person> a = new ArrayList<Person>();
	
	public MittVindu(){
		this.setLayout(new FlowLayout());
		this.add(listen);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//a.add(20);
		//a.add(40);
		//a.add(60);
		//a.add(39);
		Person p1 = new Person("Morten","@mortengoodwin");
		Person p2 = new Person("Julenissen","@julenissen");
		Person p3 = new Person("Dr. Morten","@mortengoodwin");
		a.add(p1);
		a.add(p2);
		a.add(p3);
		
		this.oppdaterGUI(listen, a.toArray());
		this.setVisible(true);
	}
	
	public void oppdaterGUI(JList enliste, Object[] data){
		DefaultListModel m = new DefaultListModel();
		for(Object s:data){
			m.addElement(s);
		}
		enliste.setModel(m);
		
	}

}
