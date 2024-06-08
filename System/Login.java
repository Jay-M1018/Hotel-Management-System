package System;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
public class Login extends JFrame{
	
	JTextField username;
	JPasswordField password;
	JButton login,cancel;
	
	Login(){
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		setBounds(400,200,600,300);
		JLabel user = new JLabel("Username : ");
		user.setBounds(40, 20, 100, 30);
		add(user);
		
		username = new JTextField();
		username.setBounds(150, 20, 150, 30);
		
		add(username);
		
		JLabel pass = new JLabel("Password : ");
		pass.setBounds(40, 70, 100, 30);
		add(pass);
		
		password = new JPasswordField();
		password.setBounds(150, 70, 150, 30);
		add(password);
		
		login = new JButton("Login");
		login.setBounds(40,150,124,30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		
		add(login);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(180,150,124,30);
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		
		add(cancel);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/second.jpg"));
		Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(370, 10, 200, 200);
		add(image);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Login();
	}


}
