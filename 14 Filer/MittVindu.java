import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MittVindu extends JFrame implements ActionListener {
	
	JButton knapp = new JButton("Last inn bilde");
	
	public MittVindu(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		//this.add("knapp");
		knapp.addActionListener(this);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try{
			FileInputStream f = new  FileInputStream("bb8.jpf");
			BufferedInputStream bf = new BufferedInputStream(f);
			Image img = ImageIO.read(bf);
			ImageIcon ii = new ImageIcon(img);
			JLabel l = new JLabel(ii);
			this.add(l);
			
		this.validate();
		}
		catch (FileNotFoundException e1){
			 e1.printStackTrace();
		 } catch (IOException e1){
			 e1.printStackTrace();
		 }
	}

}
