package calc;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;

public class Model {

	private String content;
	
	public Model() {
	
		content = "Null";
		
	}
	
	public String content() {
		
		return content;
		
	}
	
	public void setContent(String s) {
		
		content = s;
		
		
	}
	
	public void appendContent(String s) {
		
		content += s;
		
	}
	
}
