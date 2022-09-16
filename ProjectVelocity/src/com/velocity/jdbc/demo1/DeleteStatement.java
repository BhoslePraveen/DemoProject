package com.velocity.jdbc.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStatement {

	public static void main(String[] args) {
		try {
			// Step-1 : Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step-2: Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			// Step-3: Create statement
			PreparedStatement ps = con.prepareStatement("delete from user where id =?");
			//ps.setString(1, "3");
			ps.setInt(1, 2);
			int i = ps.executeUpdate();
			System.out.println(i);
			con.close();
			ps.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
