package edu.unca.csci;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnimationPanel extends JPanel
{
	private final int WIDTH = 600, HEIGHT = 600;
	private final int DELAY = 20, IMAGE_SIZE = 60;

	private ImageIcon image;
	private Timer timer;
	private int x, y, moveX, moveY;

	//-----------------------------------------------------------------
	//  Sets up the panel, including the timer for the animation.
	//-----------------------------------------------------------------
	public AnimationPanel()
	{
		timer = new Timer(DELAY, new ReboundListener());

		image = new ImageIcon("./src/main/resources/duck.png");

		x = 285;
		y = 450;
		moveX = moveY = 3;

		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.black);
	}
	
	public void start() {
		
		timer.start();
		
	}
	
	public void stop() {
		
		timer.stop();
		
	}

	//-----------------------------------------------------------------
	//  Draws the image in the current location.
	//-----------------------------------------------------------------
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		image.paintIcon(this, page, x, y);
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
		public void actionPerformed(ActionEvent event)
		{
			x += moveX;
			y += moveY;

			if (x <= 0 || x >= WIDTH-IMAGE_SIZE)
				moveX = moveX * -1;

			if (y <= 0 || y >= HEIGHT-IMAGE_SIZE)
				moveY = moveY * -1;

			repaint();
		}
	}
}
