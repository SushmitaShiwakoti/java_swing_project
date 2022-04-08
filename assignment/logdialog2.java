package assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class logdialog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Login DIalog");
		frame.setSize(250, 150);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel ID =new JLabel("Employee ID:");
		ID.setBounds(10, 10, 100, 30);
		panel.add(ID);
		
		JTextField textfield = new JTextField();
		textfield.setBounds(110, 10, 120, 20);
		panel.add(textfield);
		
		JLabel password =new JLabel("password:");
		password.setBounds(10, 40, 100, 30);
		panel.add(password);
		
		JTextField textfieldp = new JTextField();
		textfieldp.setBounds(110, 40, 120, 20);
		panel.add(textfieldp);
		

		JButton button1= new JButton("Login");
		button1.setBounds(50, 80, 70, 20);
		panel.add(button1);
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(ID.getText().length()==0) {
					System.out.print("please fill the id box");
					
				}
				
				else if(password.getText().length()==0) {
					System.out.print("please enter your password");
				}
				
				else {
					JDialog dialog= new JDialog(frame,"DashBoard");
					dialog.setSize(500, 400);
					
					
					JPanel panel= new JPanel();
					dialog.add(panel);
					
					panel.setLayout(null);
					
					JMenuBar menubar=new JMenuBar();
					frame.setJMenuBar(menubar);
					
					JMenu view =new JMenu("View");
					menubar.add(view);
					view.setBounds(10, 1, 47, 20);
					panel.add(view);
					
				    JMenuItem byName=new JMenuItem("View By Name");
				    view.add(byName);
				    JMenuItem bydepartment=new JMenuItem("View By Name");
				    view.add(bydepartment);
				    
				    JMenu logout =new JMenu("Logout");
					menubar.add(logout);
				    JMenuItem log=new JMenuItem("Logout");
				    logout.add(log);
				   
					logout.setBounds(50, 1, 60, 20);
					panel.add(logout);
					
					JLabel name = new JLabel("Name:");
					name.setBounds(0, 20, 60, 20);
					panel.add(name);
					
					JTextField textfield = new JTextField();
					textfield.setBounds(180, 15, 300, 30);
					panel.add(textfield);
					
					JLabel address = new JLabel("Address:");
					address.setBounds(0, 50, 60, 20);
					panel.add(address);
					
					JTextField textfielda = new JTextField();
					textfielda.setBounds(180, 45, 300, 30);
					panel.add(textfielda);
					
					JLabel gender = new JLabel("Gender:");
					gender.setBounds(0, 80, 60, 20);
					panel.add(gender);
					
					JRadioButton male =  new JRadioButton("Male");
					male.setBounds(200, 80, 60, 20);
					panel.add(male);
					
					JRadioButton female =  new JRadioButton("Female");
					female.setBounds(270, 80, 90, 20);
					panel.add(female);
					
					JLabel department = new JLabel("Department:");
					department.setBounds(0, 115, 70, 20);
					panel.add(department);
					
					JComboBox combo=new JComboBox();
					combo.setBounds(180, 110, 300, 30);
					combo.addItem("Finance");
					combo.addItem("Admin");
					combo.addItem("Marketing");
					combo.addItem("Human Resource");
					panel.add(combo);
					
					JLabel phone = new JLabel("Phone:");
					phone.setBounds(0, 155, 60, 20);
					panel.add(phone);
					
					JTextField textfieldp = new JTextField();
					textfieldp.setBounds(180, 150, 300, 30);
					panel.add(textfieldp);
					
					JLabel email = new JLabel("Email:");
					email.setBounds(0, 185, 60, 20);
					panel.add(email);
					
					JTextField textfielde = new JTextField();
					textfielde.setBounds(180, 180, 300, 30);
					panel.add(textfielde);
					
					JButton button1 =new JButton("ADD");
					button1.setBounds(130, 220, 60, 20);
					panel.add(button1);
					
					button1.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							if(name.getText().length()==0) {
								System.out.print("please fill the name box");
							}
							else if(address.getText().length()==0) {
								System.out.print("please fill the address box");
								
							}
							else if(gender.getText().length()==0) {
								System.out.print("choose the gender");
							}
							
							else if(department.getText().length()==0) {
							System.out.print("choose the department");
							}
						
						
						else if (phone.getText().length()==0) {
							System.out.print("fill the phone box");	
						}
						else if(email.getText().length()==0) {
							System.out.print("fill the email box");
						}
						else {
							
							JDialog massage= new JDialog (frame,"Massage");
							massage.setSize(300, 200);
							
							
							
							JPanel pan= new JPanel();
							frame.add(pan);
							
							JLabel text1=new JLabel();
							JLabel text2=new JLabel();
							JLabel text3=new JLabel();
							JLabel text4=new JLabel();
							JLabel text5=new JLabel();
							JLabel text6=new JLabel();
							
							text1.setText(name.getText().toString());
							text2.setText(address.getText().toString());
							text3.setText(gender.getText().toString());
							text4.setText(department.getText().toString());
							text5.setText(phone.getText().toString());
							text6.setText(email.getText().toString());
							
							pan.add(text1);
							pan.add(text2);
							pan.add(text3);
							pan.add(text4);
							pan.add(text5);
							pan.add(text6);
							
							massage.setVisible(true);
						
							
						}
					 
						}
					
					});
					
					JButton button2 =new JButton("RESET");
					button2.setBounds(200, 220, 90, 20);
					panel.add(button2);
					
					JButton button3 =new JButton("CANCEL");
					button3.setBounds(300, 220, 90, 20);
					panel.add(button3);
					
					dialog.setVisible(true);
					
				}
			}
			});
		JButton button2= new JButton("cancel");
		button2.setBounds(130, 80, 80, 20);
		panel.add(button2);
		
		
		
		
		frame.setVisible(true);

	}

}
