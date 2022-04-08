package assignment;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class NewAccountRegistation8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame= new JFrame("New Account Registation");
		frame.setSize(450, 530);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(null);
		
		JLabel register =new JLabel("New Account Registation:");
		register.setBounds(10, 20, 250, 30);
		register.setForeground(Color.blue);
		

		panel.add(register);
		
		
		JLabel name =new JLabel("Name:");
		name.setBounds(10, 60, 70, 30);
		panel.add(name);
		
		JTextField nameT = new JTextField();
		nameT.setBounds(150, 60, 250, 30);
		panel.add(nameT);
		
		JLabel email =new JLabel("Email Address:");
		email.setBounds(10, 100, 110, 30);
		panel.add(email);
		
		JTextField emailT = new JTextField();
		emailT.setBounds(150, 100, 250, 30);
		panel.add(emailT);
		
		JLabel password =new JLabel("Create Password:");
		password.setBounds(10, 140, 110, 20);
		panel.add(password);
		
		JTextField passwordT = new JTextField();
		passwordT.setBounds(150, 140, 250, 30);
		panel.add(passwordT);
		
		JLabel cpassword =new JLabel("Confirm Password:");
		cpassword.setBounds(10, 180, 110, 20);
		panel.add(cpassword);
		
		JTextField cpasswordT = new JTextField();
		cpasswordT.setBounds(150, 180, 250, 30);
		panel.add(cpasswordT);
		
		JLabel gender = new JLabel("Gender");
		gender.setBounds(10, 230, 100, 20);
		panel.add(gender);
		
		JRadioButton button1 =new JRadioButton("male");
		button1.setBounds(150, 230, 70, 20);
		panel.add(button1);
		
		JRadioButton button2 =new JRadioButton("female");
		button2.setBounds(220, 230, 90, 20);
		panel.add(button2);
		
		JLabel address =new JLabel("Address:");
		address.setBounds(10, 260, 70, 20);
		panel.add(address);
		
		JTextField addressT = new JTextField();
		addressT.setBounds(150, 260, 250, 30);
		panel.add(addressT);
		
		JLabel state =new JLabel("State:");
		state.setBounds(10, 300, 70, 20);
		panel.add(state);
		
		JComboBox combo = new JComboBox();
		combo.setBounds(150, 300, 250, 30);
		panel.add(combo);
		combo.addItem("Nepal");
		
		
		JLabel country =new JLabel("Country:");
		country.setBounds(10, 340, 70, 20);
		panel.add(country);
		
		JTextField countryT = new JTextField();
		countryT.setBounds(150, 340, 250, 30);
		panel.add(countryT);
		
		JLabel phone =new JLabel("Phone:");
		phone.setBounds(10, 380, 70, 20);
		panel.add(phone);
		
		JTextField phoneT = new JTextField();
		phoneT.setBounds(150, 380, 250, 30);
		panel.add(phoneT);
		
		JButton buttons =new JButton("Submit");
		buttons.setBounds(100, 420, 80, 25);
		panel.add(buttons);
		
		
		
		JButton buttonc =new JButton("Close");
		buttonc.setBounds(200, 420, 70, 25);
		panel.add(buttonc);
		
		
		
		frame.setVisible(true);

	}

}
