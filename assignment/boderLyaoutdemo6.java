package assignment;

import javax.swing.*;

public class boderLyaoutdemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Boder Lyaout Demo");
		frame.setSize(500, 225);
		
		JPanel panel= new JPanel();
		frame.add(panel);
		
		panel.setLayout(null);
		
		JButton button1= new JButton("Button1");
		button1.setBounds(0, 1, 490, 30);
		panel.add(button1);
		
		JButton button2= new JButton("Button1 LINE START");
		button2.setBounds(1, 31, 149, 125);
		panel.add(button2);
		
		JButton button3= new JButton("Button2 CENTER");
		button3.setBounds(150, 31, 200, 125);
		panel.add(button3);
		
		JButton button4= new JButton("Button3 END");
		button4.setBounds(350, 31, 133, 125);
		panel.add(button4);
		
		JButton button5= new JButton("Button1");
		button5.setBounds(0, 156, 490, 30);
		panel.add(button5);
		
		frame.setVisible(true);

	}

}
