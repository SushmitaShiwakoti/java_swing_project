package assignment;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Bill100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Font font =new Font("Times New Roman",Font.BOLD | Font.ITALIC,34);
		Font fon =new Font("Times New Roman",Font.PLAIN,20);
		Font fon1 =new Font("Times New Roman",Font.BOLD,22);
	JFrame f = new JFrame();
	f.setTitle("Design Preview");
	f.setSize(700,750);
	JPanel p = new JPanel();
	f.add(p);
	p.setLayout(null);


	JLabel title = new JLabel("Bistro Pizza bill Calculator");
	title.setBounds(120,50,400,30);
	p.add(title);
	title.setForeground(Color.blue);
	title.setFont(font);	

	JLabel order = new JLabel("Order No");
	order.setBounds(60,140,100,20);
	p.add(order);
	order.setFont(fon);

	JLabel cust = new JLabel("Customer Name");
	cust.setBounds(60,180,150,20);
	p.add(cust);
	cust.setFont(fon);

	JLabel quantity = new JLabel("Quantity");
	quantity.setBounds(60,220,100,20);
	p.add(quantity);
	quantity.setFont(fon);

	JLabel rate = new JLabel("Rate");
	rate.setBounds(380,140,100,20);
	p.add(rate);
	rate.setFont(fon);

	JLabel amt = new JLabel("Amount");
	amt.setBounds(380,180,100,20);
	p.add(amt);
	amt.setFont(fon);

	JLabel topp = new JLabel("Cost of Toppings");
	topp.setBounds(380,220,150,20);
	p.add(topp);
	topp.setFont(fon);

	JTextField  orderno = new JTextField();
	orderno.setBounds(220, 140, 100, 25);
	p.add(orderno);
	orderno.setFont(fon);


	JTextField  name = new JTextField();
	name.setBounds(220, 180, 100, 25);
	p.add(name);
	name.setFont(fon);



	JTextField  quan = new JTextField();
	quan.setBounds(220, 220, 100, 25);
	p.add(quan);
	quan.setFont(fon);



	JTextField  rateamt = new JTextField();
	rateamt.setBounds(550, 140, 100, 25);
	p.add(rateamt);
	rateamt.setEditable(false);
	rateamt.setBackground(Color.white);
	rateamt.setFont(fon);


	JTextField  amnt = new JTextField();
	amnt.setBounds(550, 180, 100, 25);
	p.add(amnt);
	amnt.setEditable(false);
	amnt.setBackground(Color.white);
	amnt.setFont(fon);


	JTextField  topping = new JTextField();
	topping.setBounds(550, 220, 100, 25);
	p.add(topping);
	topping.setEditable(false);
	topping.setBackground(Color.white);
	topping.setFont(fon);


	JPanel pan = new JPanel();
	Box box1 = Box.createVerticalBox();

	Border border = BorderFactory.createRaisedBevelBorder();
	box1.setBorder(border);

	//
	JLabel toptitle = new JLabel("Toppings (Rs 80 each)");
	toptitle.setBounds(380,270,300,30);
	toptitle.setFont(fon1);
	p.add(toptitle);

	JRadioButton panP = new JRadioButton("Pan Pizza -RS 500");
	box1.add(panP);
	panP.setFont(fon);
	JRadioButton stuff = new JRadioButton("Stuffed Crust- RS 300");
	box1.add(stuff);
	stuff.setFont(fon);
	JRadioButton crust = new JRadioButton("Regular- RS 200");
	box1.add(crust);
	crust.setFont(fon);
	box1.setBounds(60, 300, 220, 150);
	ButtonGroup group = new ButtonGroup();
	group.add(panP);
	group.add(stuff);
	group.add(crust);

	//toppings
	JLabel toptitle1 = new JLabel("Pizza Type");
	toptitle1.setBounds(60,270,300,30);
	toptitle1.setFont(fon1);
	p.add(toptitle1);
	Box box2 = Box.createVerticalBox();
	box2.setBorder(border);
	JCheckBox onion = new JCheckBox("Onion");
	box2.add(onion);
	onion.setFont(fon);

	JCheckBox cheese = new JCheckBox("Cheese");
	box2.add(cheese);
	cheese.setFont(fon);

	JCheckBox tomato = new JCheckBox("Tomato");
	box2.add(tomato);
	tomato.setFont(fon);

	JCheckBox corn = new JCheckBox("Baby corn");
	box2.add(corn);
	corn.setFont(fon);
	box2.setBounds(380, 300, 220, 150);


	JButton gen = new JButton("Generate");
	gen.setBounds(60,500,120,30);
	gen.setFont(fon);
	p.add(gen);

	JButton can = new JButton("Cancel");
	can.setBounds(500,500,100,30);
	can.setFont(fon);
	p.add(can);

	JTextArea output = new JTextArea();
	output.setBounds(60, 550, 550, 120);
	output.setFont(fon);
	output.setEditable(false);
	output.setBackground(Color.white);
	p.add(output);


	p.add(box1);
	p.add(box2);
	f.setVisible(true);

	panP.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg) {
				rateamt.setText("500");
		}
	});

	stuff.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg) {
				rateamt.setText("300");
		}
	});
	crust.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg) {
				rateamt.setText("200");
		}
	});


	gen.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg) {
				int quan1,rat1,am1;
				
				
				int count=0;
				
				String quantity = quan.getText();
				quan1 = Integer.parseInt(quantity); 
				
				if(tomato.isSelected())
					count++;
				if(onion.isSelected())
					count++;
				if(corn.isSelected())
					count++;
				if(cheese.isSelected())
					count++;
				int topp1;
				topp1 = count * 80 *quan1;
				Integer f1 = new Integer(topp1);
				String topp2 = f1.toString();
				topping.setText(topp2); 
				
				
				String rate = rateamt.getText();
				rat1 = Integer.parseInt(rate);
				am1 = (quan1  * rat1 )+ topp1;
				Integer f = new Integer(am1);
				String amn11 = f.toString();
				amnt.setText(amn11);
				
		//Generating bills:
				output.setText("Hello, your order number is: "+orderno.getText()+"\nName: "+name.getText()+"\nNumber of pizza:"+quan1+"\nNumber of toppings:"+count+"\nAmount payable is:"+am1);
					
		}
	});







	}
	}




