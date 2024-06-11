package System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener{
	
	Dashboard(){
		setBounds(0,0,1370,735);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/third.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1370, 735, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 1370, 735);
		add(image);
		
		JLabel text = new JLabel("THE TAJ HOTEL WELCOMES YOU");
		text.setBounds(310, 80, 1000, 50);
		text.setFont(new Font("Tohoma",Font.PLAIN,45));
		text.setForeground(Color.WHITE);
		image.add(text);
		
		JMenuBar mb = new JMenuBar();
		mb.setBounds(0, 0, 1370, 30);
		image.add(mb);
		
		JMenu hotel = new JMenu("HOTEL MANAGEMENT");
		hotel.setForeground(Color.RED);
		mb.add(hotel);
		
		JMenuItem reception = new JMenuItem("RECEPTION");
		hotel.add(reception);
		
		JMenu admin = new JMenu("ADMIN");
		admin.setForeground(Color.BLUE);
		mb.add(admin);
		
		JMenuItem addEmployes = new JMenuItem("ADD EMPLOYEE");
		addEmployes.addActionListener(this);
		admin.add(addEmployes);
		
		JMenuItem addRooms = new JMenuItem("ADD ROOMS");
		addRooms.addActionListener(this);
		admin.add(addRooms);
		
		JMenuItem addDrivers = new JMenuItem("ADD DRIVERS");
		addDrivers.addActionListener(this);
		admin.add(addDrivers);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Dashboard();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("ADD EMPLOYEE")){
			new AddEmployee();
		}else if(e.getActionCommand().equals("ADD ROOMS")){
			new AddRooms();
		}else if(e.getActionCommand().equals("ADD DRIVERS")){
			new AddDriver();
		}
	}

}
