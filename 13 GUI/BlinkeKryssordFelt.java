import java.awt.Color;
import java.util.Random;

public class BlinkeKryssordFelt extends KryssordFelt{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		if(this.isEditable()){
			Random rg = new Random();
			this.setBackground(new Color(rg.nextInt(255),rg.nextInt(255),rg.nextInt(255)));
		}
	}

}
