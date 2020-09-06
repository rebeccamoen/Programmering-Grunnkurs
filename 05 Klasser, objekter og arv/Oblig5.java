import javax.swing.JOptionPane;

public class Oblig5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Game g = new Game();
	g.drawStuff();
	
		Character bg = new Character();
		bg.setImage("http://188.138.32.138/dat101/filer/background.jpg");
		g.addCharacter(bg, "background");
		
		Character mario = new Character();
		mario.setImage("http://188.138.32.138/dat101/filer/mario.png");
		g.addCharacter(mario, "hero");
		
		mario.resize(0.3);
		mario.x = 50;
		mario.y = 600;
		
		Character prinsesse = new Character();
		prinsesse.setImage("http://188.138.32.138/dat101/filer/princess.jpg");
		g.addCharacter(prinsesse, "princess");
		
		prinsesse.resize(0.1);
		prinsesse.x = 750;
		prinsesse.y = 450;
		
		for(int FlyttMario = mario.x; FlyttMario >= prinsesse.x; FlyttMario=mario.x +1){
			System.out.println();
		}
	}
}