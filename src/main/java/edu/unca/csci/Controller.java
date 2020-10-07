package edu.unca.csci;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


/**
 * Detects input from button press which either starts or stops
 * movement animation.
 *
 */
public class Controller implements MouseListener {

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
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		 try {
       		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./src/main/resources/quack.wav").getAbsoluteFile());
       		 Clip clip = AudioSystem.getClip();
       		 clip.open(audioInputStream);
       		 clip.start();
   	 } catch(Exception ex) {
       		 System.out.println("Error with playing sound.");
       		 ex.printStackTrace();
   	 }
	 
	 m.start();
	

		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
