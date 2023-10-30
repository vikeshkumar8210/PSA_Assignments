package day36;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class B {
	public static void main(String[] args) {
		//Connect to database
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psa","root","password");
			
			//Perform SQL Operation
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("delete from registration where email='stallin@gmail.com'");
			
			//close
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
