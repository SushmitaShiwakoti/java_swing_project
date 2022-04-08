package assignment;

import java.awt.Color;

import javax.swing.*;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame =new JFrame("MY DEMO");
		frame.setSize(250, 150);
		frame.setBackground(Color.blue);
		
		
		JPanel panel= new JPanel();
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel demo =new JLabel("MY DEMO");
		demo.setBounds(100, 50, 100, 20);
		panel.add(demo);
		
		frame.setVisible(true);
		

	}

}

