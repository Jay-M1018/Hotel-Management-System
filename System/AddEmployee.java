package System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
public class AddEmployee extends JFrame{
	
	AddEmployee(){
		setLayout(null);

    JLabel lblname = new JLabel("Name : ");
    lblname.setBounds(60, 30, 120, 30);
    lblname.setFont(new Font("Tahoma",Font.PLAIN,17));
    add(lblname);

    JTextField tfname = new JTextField();
    tfname.setBounds(200,30,150,30);
    add(tfname);

    JLabel lblage = new JLabel("Age : ");
    lblage.setBounds(60, 80, 120, 30);
    lblage.setFont(new Font("Tahoma",Font.PLAIN,17));
    add(lblage);

    JTextField tfage = new JTextField();
    tfage.setBounds(200,80,150,30);
    add(tfage);

    JLabel lblgender = new JLabel("Gender : ");
    lblgender.setBounds(60, 130, 120, 30);
    lblgender.setFont(new Font("Tahoma",Font.PLAIN,17));
    add(lblgender);

    JRadioButton rbmale = new JRadioButton("Male");
    rbmale.setBounds(200,130,70,30);
    rbmale.setFont(new Font("Tahoma",Font.PLAIN,14));
    rbmale.setBackground(Color.WHITE);
    add(rbmale);

    JRadioButton rbfemale = new JRadioButton("Female");
    rbfemale.setBounds(280,130,70,30);
    rbfemale.setFont(new Font("Tahoma",Font.PLAIN,14));
    rbfemale.setBackground(Color.WHITE);
    add(rbfemale);

    JLabel lbljob = new JLabel("Job : ");
    lbljob.setBounds(60, 180, 120, 30);
    lbljob.setFont(new Font("Tahoma",Font.PLAIN,17));
    add(lbljob);

    String str[] = {"Front Desk Clerk", "Porters","Housekeeping","Kitchen Staff", "Room Service","Chefs","Waiters/Waitress","Manager","Accountant"};
    JComboBox cjbox = new JComboBox(str);
    cjbox.setBounds(200,180,150,30);
    cjbox.setBackground(Color.WHITE);
    add(cjbox);

    JLabel lblsalary = new JLabel("Salary : ");
    lblsalary.setBounds(60, 230, 120, 30);
    lblsalary.setFont(new Font("Tahoma",Font.PLAIN,17));
    add(lblsalary);

    JTextField tfsalary = new JTextField();
    tfsalary.setBounds(200,230,150,30);
    add(tfsalary);

    JLabel lblphone = new JLabel("Phone : ");
    lblphone.setBounds(60, 280, 120, 30);
    lblphone.setFont(new Font("Tahoma",Font.PLAIN,17));
    add(lblphone);

    JTextField tfphone = new JTextField();
    tfphone.setBounds(200,280,150,30);
    add(tfphone);

    JLabel lblemail = new JLabel("Email : ");
    lblemail.setBounds(60, 330, 120, 30);
    lblemail.setFont(new Font("Tahoma",Font.PLAIN,17));
    add(lblemail);

    JTextField tfemail = new JTextField();
    tfemail.setBounds(200,330,150,30);
    add(tfemail);

    JButton submit = new JButton("SUBMIT");
    submit.setBackground(Color.BLACK);
    submit.setForeground(Color.WHITE);
    submit.setBounds(200,430,150,30);
    add(submit);

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/tenth.jpg"));
    Image i2 = i1.getImage().getScaledInstance(450,450,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(380,60,450,370);
    add(image);



		
		getContentPane().setBackground(Color.WHITE);
		setBounds(270,120,850,540);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AddEmployee();

	}

}

