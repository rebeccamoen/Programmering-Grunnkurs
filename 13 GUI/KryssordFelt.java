import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JTextField;

public abstract class KryssordFelt extends JTextField implements MouseMotionListener{
	
	public KryssordFelt(){
		this.addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	
	}
	
abstract public void start();

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		this.start();
	}

}
