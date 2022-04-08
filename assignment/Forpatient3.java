package assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Forpatient3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame= new JFrame("Design for Patient");
		frame.setSize(300, 400);
		
		
		JPanel panel= new JPanel();
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel ID = new JLabel("Patient ID:");
		ID.setBounds(10, 15, 60, 20);
		panel.add(ID);
		
		JTextField textfield = new JTextField("\r");
		textfield.setBounds(90, 15, 150, 20);
		panel.add(textfield);
		
		JLabel name = new JLabel("Full Name:");
		name.setBounds(10, 55, 60, 20);
		panel.add(name);
		
		JTextField textfieldF = new JTextField("\r");
		textfieldF.setBounds(90, 55, 150, 20);
		panel.add(textfieldF);
		
		JLabel gender = new JLabel("Gender:");
		gender.setBounds(10, 95, 60, 20);
		panel.add(gender);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(90, 95, 60, 20);
		panel.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(150, 95, 90, 20);
		panel.add(female);
		
		JLabel address = new JLabel("Address:");
		address.setBounds(10, 135, 60, 20);
		panel.add(address);
		
		JTextField textfieldA = new JTextField("\n\r");
		textfieldA.setBounds(90, 135, 150, 20);
		panel.add(textfieldA);
		
		JLabel contact = new JLabel("Contact:");
		contact.setBounds(10, 175, 60, 20);
		panel.add(contact);
		
		JTextField textfieldC = new JTextField("\n\r");
		textfieldC.setBounds(90, 175, 150, 20);
		panel.add(textfieldC);
		
		JLabel email = new JLabel("Email ID:");
		email.setBounds(10, 215, 60, 20);
		panel.add(email);
		
		JTextField textfieldE = new JTextField();
		textfieldE.setBounds(90, 215, 150, 20);
		panel.add(textfieldE);
		
	    JButton login = new JButton ("ADD");
	    login.setBounds(60, 255, 60, 20);
	    panel.add(login);
	    
        login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(ID.getText().length()==0) {
					System.out.print("please fill the ID box");
				}
				else if(name.getText().length()==0) {
					System.out.print("please fill the name box");
					
				}
				else if(gender.getText().length()==0) {
					System.out.print("choose the gender");
				}
				
				else if(contact.getText().length()==0) {
				System.out.print("choose the department");
				}
			
			
			else if (address.getText().length()==0) {
				System.out.print("fill the phone box");	
			}
			else if(email.getText().length()==0) {
				System.out.print("fill the email box");
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
				
				Text1.setText(textfield.getText().toString());
				Text2.setText(textfieldF.getText().toString());
			
				Text4.setText(textfieldA.getText().toString());
				Text5.setText(textfieldC.getText().toString());
				Text6.setText(textfieldE.getText().toString());
				
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
	    
	    JButton cancel = new JButton ("CANCEL");
	    cancel.setBounds(130, 255, 90, 20);
	    panel.add(cancel);
		
		frame.setVisible(true);


	}

}
