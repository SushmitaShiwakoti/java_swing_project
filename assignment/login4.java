package assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class login4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Please Login");
		frame.setSize(350, 200);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel username = new JLabel("Username:");
		username.setBounds(10, 20, 80, 20);
		panel.add(username);
		
		JTextField textfieldN = new JTextField();
		textfieldN.setBounds(100, 20, 150, 20);
		panel.add(textfieldN);
		
		JLabel password = new JLabel("Password:");
		password.setBounds(10, 60, 90, 20);
		panel.add(password);
		
		JTextField textfieldp = new JTextField();
		textfieldp.setBounds(100, 60, 150, 20);
		panel.add(textfieldp);
		
		  JButton login = new JButton ("Login");
		    login.setBounds(20, 100, 70, 20);
		    panel.add(login);
		    
		    
		    JButton register = new JButton ("Register User");
		    register.setBounds(100, 100, 120, 20);
		    panel.add(register);
		    
		    register.addActionListener(new ActionListener() {
				
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
						JDialog massage= new JDialog (frame,"Register User");
						massage.setSize(350, 200);
						
						JPanel pan= new JPanel();
						massage.add(pan);
						
						pan.setLayout(null);
						
						JLabel ID= new JLabel("ID:");
						ID.setBounds(10, 5, 80, 20);
						pan.add(ID);
						
						JTextField IDT =new JTextField();
						IDT.setBounds(100, 5,210,20);
						pan.add(IDT);
						
						
						JLabel firstname= new JLabel("Firstname:");
						firstname.setBounds(10, 35, 90, 20);
						pan.add(firstname);
						
						JTextField textfieldF =new JTextField();
						textfieldF.setBounds(100, 35,210 ,20);
						pan.add(textfieldF);
						
						JLabel lastname= new JLabel("Lastname:");
						lastname.setBounds(10, 65, 90, 20);
						pan.add(lastname);
						
						JTextField textfieldL=new JTextField();
						textfieldL.setBounds(100, 65,210 ,20);
						pan.add(textfieldL);
						
						JLabel password= new JLabel("Password:");
						password.setBounds(10, 95, 90, 20);
						pan.add(password);
						
						JTextField passwordT =new JTextField();
						passwordT.setBounds(100, 95,210 ,20);
						pan.add(passwordT);
						
						JButton button1=new JButton("ADD");
						button1.setBounds(70, 125, 60, 20);
						pan.add(button1);
						
						 button1.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									// TODO Auto-generated method stub
									
									if(ID.getText().length()==0) {
										System.out.print("please fill the ID box");
									}
									else if(firstname.getText().length()==0) {
										System.out.print("please fill the name box");
										
									}
									else if(lastname.getText().length()==0) {
										System.out.print("choose the gender");
									}
									
									else if(password.getText().length()==0) {
									System.out.print("choose the department");
									}
								
								
								
								
								else {
									
									JDialog massage= new JDialog(frame,"Massage");
									massage.setSize(200, 300);
									
									
									JPanel pan= new JPanel();
									
									
									
									JLabel Text1 =new JLabel();
									JLabel Text2 =new JLabel();
									JLabel Text3 =new JLabel();
									JLabel Text4 =new JLabel();
									JLabel Text5 =new JLabel();
									JLabel Text6 =new JLabel();
									
									Text1.setText(IDT.getText().toString());
									Text2.setText(textfieldF.getText().toString());
								
									Text4.setText(textfieldL.getText().toString());
									Text5.setText(textfieldp.getText().toString());
								
									
									pan.add(Text1);
									pan.add(Text2);
									pan.add(Text3);
									pan.add(Text4);
									pan.add(Text5);
									pan.add(Text6);
									massage.add(pan);
									
									massage.setVisible(true);
									
									
								}
							 
								}
							
							});
						
						JButton button2=new JButton("RESET");
						button2.setBounds(140, 125, 80, 20);
						pan.add(button2);
						
						JButton button3=new JButton("CLOSE");
						button3.setBounds(230, 125, 80, 20);
						pan.add(button3);
						
						
						massage.setVisible(true);
					}
					
					
					
					
					
					
				}
			 
				
			
			});
		    
		    
		    JButton cancel = new JButton ("Close");
		    cancel.setBounds(230, 100, 90, 20);
		    panel.add(cancel);
		
		frame.setVisible(true);
		

	}

}
