package ddg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

	private int state = -1;
	private Model m;
	private Viewer v;
	
	
	public Controller(Model m, Viewer v) {
		
		this.m = m;
		this.v = v;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		//String input = (String) e.getActionCommand();
		//System.out.println(input);
		
		if(state == -1) {
		
			state *= -1;
			v.canvas.start();
		
		}
		else if(state == 1) {
			
			state *= -1;
			v.canvas.stop();
			
		}
		
	}
	
	
}