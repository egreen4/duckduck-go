package edu.unca.csci;

import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

import edu.unca.csci.bumpsim.BounceSim;
import edu.unca.csci.bumpsim.HorizontalDirection;
import edu.unca.csci.bumpsim.HorizontalVelocity;
import edu.unca.csci.bumpsim.VerticalDirection;
import edu.unca.csci.bumpsim.VerticalVelocity;

/**
 * Simulation Model for moving duck, tied to viewer to render changes
 * and controller to start and stop sim.
 *
 */

public class Model
{
	private final int WIDTH = 600, HEIGHT = 600;
	private final int DELAY = 20, IMAGE_SIZE = 60;
	private final double DECAY_RATE = 2;

	private Viewer v;
	private Timer timer;
	public int x, y, moveX, moveY;

	private BounceSim bounceSim;

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

		bounceSim = new BounceSim(WIDTH, HEIGHT, IMAGE_SIZE, IMAGE_SIZE, DECAY_RATE, x, y);
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
		var random = new Random();
		var horizontalVelocity = new HorizontalVelocity(random.nextInt(1) == 1 ? HorizontalDirection.Right : HorizontalDirection.Left, random.nextInt(50));
		var verticalVelocity = new VerticalVelocity(random.nextInt(1) == 1 ? VerticalDirection.Up : VerticalDirection.Down, random.nextInt(50));
		
		bounceSim.bump(horizontalVelocity, verticalVelocity);
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
			var position = bounceSim.nextPosition();
			x = (int)position.xCoordinate;
			y = (int)position.yCoordinate;

			// x += moveX;
			// y += moveY;

			// if (x <= 0 || x >= WIDTH-IMAGE_SIZE)
				// moveX = moveX * -1;

			// if (y <= 0 || y >= HEIGHT-IMAGE_SIZE)
				// moveY = moveY * -1;

			v.canvas.rpaint();
		}
	}
}
