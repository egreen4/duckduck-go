package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

	private Model m;
	private Viewer v;
	
	public Controller(Model m, Viewer v) {
		
		this.m = m;
		this.v = v;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String input = (String) e.getActionCommand();
		System.out.println(input);
		m.setContent(input);
		v.results.setText(m.content());
		
	}
	
	
}
