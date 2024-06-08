package System;
import java.sql.*;

public class Conn {
	Connection c;
	Statement s;
	String db = "jdbc:mysql://localhost:3306/hotelmanagementsystem";
	String user = "Your Username";
	String pass = "Your Password";
	Conn(){
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection(db, user, pass);
			s=c.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
