package oblig17;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Oblig17DarligEpler {

	Random rg = new Random();
	
	private int x = rg.nextInt(700);
	private int y = rg.nextInt(200);
	private int bredde = 10;
	private int hoyde = 10;
	private Color farge = Color.ORANGE;
	
	public void drawMe(Graphics de){
		de.setColor(farge);
		de.fillRect(this.x, this.y, this.bredde, this.hoyde);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getBredde() {
		return bredde;
	}

	public void setBredde(int bredde) {
		this.bredde = bredde;
	}

	public int getHoyde() {
		return hoyde;
	}

	public void setHoyde(int hoyde) {
		this.hoyde = hoyde;
	}

	public Color getFarge() {
		return farge;
	}

	public void setFarge(Color farge) {
		this.farge = farge;
	}
}
