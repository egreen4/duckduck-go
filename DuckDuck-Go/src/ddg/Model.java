package ddg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Model {

	private final int WIDTH = 400, HEIGHT = 100, IMAGE_SIZE = 35;
	private int x, y, moveX, moveY;
	
	public Model(int x, int y) {
	
		this.x = x;
		this.y = y;
		moveX = moveY = 3;
		
	}
	
	public int getx() {
		
		return x;
		
	}
	
	public int gety() {
		
		return y;
		
		
	}
	
	public void setx(int x) {
		
		this.x = x;
		
	}
	
	public void sety(int y) {
		
		this.y = y;
		
	}
	

	
}