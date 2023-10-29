package day35;


import java.sql.*;
public class A {
	public static void main(String[] args) {
		
		// Connect to database
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/psa","root","9572");
			System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//perform SQL operations.
		//Close the connection.
		
	}

}

