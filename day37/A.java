package day37;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class A {
	public static void main(String[] args) {
		try {
			// Connect to DataBase
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psa","root","9572");
			
			//Perform SQL Operation
			Statement stmnt= con.createStatement();
			ResultSet result=stmnt.executeQuery("select * from registration");
			while(result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));
			}
			
			//Close
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}


//OutPut:-
