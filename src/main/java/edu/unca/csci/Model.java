package edu.unca.csci;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Simulation Model for moving duck, tied to viewer to render changes
 * and controller to start and stop sim.
 *
 */

public class Model
{
	private final int WIDTH = 600, HEIGHT = 600;
	private final int DELAY = 20, IMAGE_SIZE = 60;

	private Viewer v;
	private Timer timer;
	public int x, y, moveX, moveY;

	//-----------------------------------------------------------------
	//  Sets up the panel, including the timer for the animation.
	//-----------------------------------------------------------------
	
	/**
	 * Constructor for Model class
	 */
	public Model()
	{
		
		timer = new Timer(DELAY, new ReboundListener());


		x = 285;
		y = 450;
		moveX = moveY = 3;
		
		
	}
	
	/**
	 * Sets viewer to be used by Model class
	 * @param v Viewer element
	 */
	public void setv(Viewer v) {
		
		this.v = v;
	}
	
	/**
	 * Starts Animation
	 */
	public void start() {
		
		timer.start();
		
	}
	
	/**
	 * Stops animation
	 */
	public void stop() {
		
		timer.stop();
		
	}


	//*****************************************************************
	//  Represents the action listener for the timer.
	//*****************************************************************
	private class ReboundListener implements ActionListener
	{
		//--------------------------------------------------------------
		//  Updates the position of the image and possibly the direction
		//  of movement whenever the timer fires an action event.
		//--------------------------------------------------------------
		/**
		 * Determines new position of Duck and then calls for 
		 * the Viewer to update.
		 */
		public void actionPerformed(ActionEvent event)
		{
			x += moveX;
			y += moveY;

			if (x <= 0 || x >= WIDTH-IMAGE_SIZE)
				moveX = moveX * -1;

			if (y <= 0 || y >= HEIGHT-IMAGE_SIZE)
				moveY = moveY * -1;

			v.canvas.rpaint();
		}
	}
}
