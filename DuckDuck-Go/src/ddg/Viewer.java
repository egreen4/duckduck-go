package ddg;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;


public class Viewer {
	
    JButton b;
    AnimationPanel canvas;
    JPanel buttonPanel;
    JPanel containerPanel;
    Model m;
    
	public Viewer(Model m) {
		
	this.m = m;	
		
	
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    canvas = new AnimationPanel();
    buttonPanel = new JPanel();
    containerPanel = new JPanel();
    containerPanel.setLayout(new BorderLayout());
    buttonPanel.setLayout(new GridLayout(1,1));
    
    b = new JButton("Quack");
    
    buttonPanel.add(b);
    buttonPanel.setPreferredSize(new Dimension(400, 50));

    
    containerPanel.add(canvas, BorderLayout.NORTH);
    containerPanel.add(new JSeparator(), BorderLayout.CENTER);
    containerPanel.add(buttonPanel,BorderLayout.SOUTH);


    frame.getContentPane().add(containerPanel);
    frame.pack();
    frame.setVisible(true);
    
	}
	
	public void registerListener(Controller listener) {
	    b.addActionListener(listener);
	}

	
}

