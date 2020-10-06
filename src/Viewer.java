package calc;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class Viewer {
	
    JButton C;
    JButton neg;
    JButton perc;
    JButton div = new JButton("/");
    JButton seven;
    JButton eight;
    JButton nine ;
    JButton mult;
    JButton four;
    JButton five;
    JButton six;
    JButton sub;
    JButton one;
    JButton two;
    JButton three;
    JButton add;
    JButton zero;
    JButton point;
    JButton equals;
    
    Label results;
    
    JPanel resultsP;
    JPanel buttonPanel;
    JPanel containerPanel;
	
	public Viewer(Model m) {

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    results = new Label(m.content());
    resultsP = new JPanel();
    buttonPanel = new JPanel();
    containerPanel = new JPanel();
    containerPanel.setLayout(new BorderLayout());
    buttonPanel.setLayout(new GridLayout(5,4));
    
    C = new JButton("C");
    neg = new JButton("+/-");
    perc = new JButton("%");
    div = new JButton("/");
    seven = new JButton("7");
    eight = new JButton("8");
    nine = new JButton("9");
    mult = new JButton("X");
    four = new JButton("4");
    five = new JButton("5");
    six = new JButton("6");
    sub = new JButton("-");
    one = new JButton("1");
    two = new JButton("2");
    three = new JButton("3");
    add = new JButton("+");
    zero = new JButton("0");
    point = new JButton(".");
    equals = new JButton("=");
    
    
    buttonPanel.add(C);
    buttonPanel.add(neg);
    buttonPanel.add(perc);
    buttonPanel.add(div);
    buttonPanel.add(seven);
    buttonPanel.add(eight);
    buttonPanel.add(nine);
    buttonPanel.add(mult);
    buttonPanel.add(four);
    buttonPanel.add(five);
    buttonPanel.add(six);
    buttonPanel.add(sub);
    buttonPanel.add(one);
    buttonPanel.add(two);
    buttonPanel.add(three);
    buttonPanel.add(add);
    buttonPanel.add(zero);
    buttonPanel.add(point);
    buttonPanel.add(equals);
        
    resultsP.add(results);
    
    buttonPanel.setPreferredSize(new Dimension(200, 300));

    
    containerPanel.add(resultsP, BorderLayout.NORTH);
    containerPanel.add(new JSeparator(), BorderLayout.CENTER);
    containerPanel.add(buttonPanel,BorderLayout.SOUTH);

    frame.getContentPane().add(containerPanel);
    frame.pack();
    frame.setVisible(true);
    
	}
	
	public void registerListener(Controller listener) {
	    C.addActionListener(listener);
	    neg.addActionListener(listener);
	    perc.addActionListener(listener);
	    div.addActionListener(listener);
	    seven.addActionListener(listener);
	    eight.addActionListener(listener);
	    nine.addActionListener(listener);
	    mult.addActionListener(listener);
	    four.addActionListener(listener);
	    five.addActionListener(listener);
	    six.addActionListener(listener);
	    sub.addActionListener(listener);
	    one.addActionListener(listener);
	    two.addActionListener(listener);
	    three.addActionListener(listener);
	    add.addActionListener(listener);
	    zero.addActionListener(listener);
	    point.addActionListener(listener);
	    equals.addActionListener(listener);
	}
	
	
}
