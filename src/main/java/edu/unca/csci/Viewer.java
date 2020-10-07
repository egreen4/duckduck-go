package edu.unca.csci;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;

/**
 * Gui which is used to render moving duck animation.
 * Uses movement data from Simulation Model to create
 * coordinates for renderer.
 *
 */
public class Viewer {
	
    JButton b;
    AnimationPanel canvas;
    JPanel buttonPanel;
    JPanel containerPanel;
    Model m;
    
    
    /**
     * Constructor for Viewer class, Creates Gui used by program
     * @param m Model which viewer is manipulated by
     */
	public Viewer(Model m) {
		
	this.m = m;	
	
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("IM A BOUNCING DUCK, CLICK ME!!!!");
    
    canvas = new AnimationPanel();

    
    frame.getContentPane().add(canvas);
    frame.pack();
    frame.setVisible(true);
    
	}
	
	/**
	 * Gives Controller class control of instance of viewer
	 * @param listener Controller class to be given control of elements within viewer
	 */
	public void registerListener(Controller listener) {
	    b.addActionListener(listener);
	}

	/**
	 * Custom Jpanel class meant to handle animations
	 * Adapted from chapter six of Java Foundations
	 *
	 */
	public class AnimationPanel extends JPanel
	{
		private final int WIDTH = 600, HEIGHT = 600;

		private ImageIcon image;

		/**
		 * constructor for animation panel
		 */
		public AnimationPanel()
		{
			image = new ImageIcon("./src/main/resources/duck.png");
			setPreferredSize(new Dimension(WIDTH, HEIGHT));
			setBackground(Color.black);
			
		}

		/**
		 * Used to paint image
		 */
		public void paintComponent(Graphics page)
		{
			super.paintComponent(page);
			image.paintIcon(this, page, m.x , m.y);
		}
		
		/**
		 * forces a new render of animation panel
		 */
		public void rpaint() {
			
			repaint();
			Toolkit.getDefaultToolkit().sync();
		}


	}
	
	
}

