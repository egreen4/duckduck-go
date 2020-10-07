package edu.unca.csci;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


/**
 * Detects input from button press which either starts or stops
 * movement animation.
 *
 */
public class Controller implements ActionListener {

	private int state = -1;
	private Model m;
	
	/**
	 * Constructor for Controller Class
	 * @param m Takes an element of the Type Model
	 */
	public Controller(Model m) {
		
		this.m = m;
		
	}
	
	/**
	 * Detects actions from viewer class, starts or stops
	 * code that moves Image
	 */
	public void actionPerformed(ActionEvent e) {
		
		//String input = (String) e.getActionCommand();
		//System.out.println(input);
		
		 try {
	       		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./src/main/resources/quack.wav").getAbsoluteFile());
	       		 Clip clip = AudioSystem.getClip();
	       		 clip.open(audioInputStream);
	       		 clip.start();
	   	 } catch(Exception ex) {
	       		 System.out.println("Error with playing sound.");
	       		 ex.printStackTrace();
	   	 }
		
		if(state == -1) {
		
			state *= -1;
			m.start();
		
		}
		else if(state == 1) {
			
			state *= -1;
			m.stop();
			
		}
		
	}
	
	
}
