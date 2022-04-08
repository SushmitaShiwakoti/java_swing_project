package assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class loginForm9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Login Form");
		frame.setSize(350, 400);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel username = new JLabel("Username:");
		username.setBounds(10, 90, 80, 30);
		panel.add(username);
		
		JTextField textfieldN = new JTextField();
		textfieldN.setBounds(100, 90, 150, 30);
		panel.add(textfieldN);
		
		JLabel password = new JLabel("Password:");
		password.setBounds(10, 150, 90, 30);
		panel.add(password);
	
		
		JTextField textfieldp = new JTextField();
		textfieldp.setBounds(100, 150, 150, 30);
		panel.add(textfieldp);
		
		JCheckBox button =new JCheckBox("Show Password");
		button.setBounds(100, 200, 130, 20);
		panel.add(button);
		
		 JButton login = new JButton ("Login");
		    login.setBounds(60, 240, 70, 20);
		    panel.add(login);
		    
		    
	
		    login.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					if(username.getText().length()==0) {
						System.out.print("please fill the name box");
					}
					else if(password.getText().length()==0) {
						System.out.print("please fill the address box");
						
					}
					
					else {
						JDialog massage= new JDialog (frame,"Massage");
						massage.setSize(350, 200);
						
						JPanel pan= new JPanel();
						massage.add(pan);
						
						pan.setLayout(null);
						
						JLabel massages =new JLabel("Invaliad Username or Password");
						massages.setBounds(30, 150, 300, 30);
						pan.add(massages);
						
						JButton button =new JButton("OK");
						button.setBounds(90, 180, 30, 20);
						pan.add(button);
						
						
						massage.setVisible(true);
					}
			
				}
			
			});
		    
		    
		    JButton cancel = new JButton ("RESET");
		    cancel.setBounds(150, 240, 90, 20);
		    panel.add(cancel);
		
		frame.setVisible(true);
		

	}

}
