package day35;
import java.sql.*;
public class A {
	public static void main(String[] args) {
		//3 Rules
		//1st Connect to database
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/psa","root","password");
			System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2nd perform SQL operations.
		//3rd Close the connection.
		
	}

}

