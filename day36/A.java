package day36;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class A {
	public static void main(String[] args) {
		try {
			// Connect to Database
			Connection con = DriverManager.getConnection("jdbc:mysql:127.0.0.1:3306/psa","root","password");
			// Perform SQL Operations
			Statement stmnt= con.createStatement();
			stmnt.executeUpdate("insert into registration values('vikesh','jharkhand','vikesh@gmail.com'");
			
			//close
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
