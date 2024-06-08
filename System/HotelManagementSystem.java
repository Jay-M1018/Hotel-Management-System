package System;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HotelManagementSystem extends JFrame implements ActionListener{
	public HotelManagementSystem() {
//		setSize(1366,565);
//		setLocation(0,50);
		setBounds(0,50,1366,565);
		
		ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("images/first.jpg"));
		
		JLabel image = new JLabel(ic);
		image.setBounds(0, 0, 1366, 565);
		
		JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
		text.setBounds(20, 430, 1000, 90);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("serif",Font.PLAIN,50));
		image.add(text);
		
		JButton next = new JButton("Next");
		next.setBounds(1150, 450, 150, 50);
		next.setBackground(Color.WHITE);
		next.setForeground(Color.MAGENTA);
		next.addActionListener(this);
		next.setFont(new Font("serif",Font.PLAIN,24));
		image.add(next);
		
		add(image);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(true) {
			text.setVisible(false);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
			text.setVisible(true);
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		
	}

	public static void main(String[] args) {
		new HotelManagementSystem();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		// new Login();
		
	}

}
