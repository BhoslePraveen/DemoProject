package com.velocity.jdbc.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStatement {

	public static void main(String[] args) {

		try {
			// Step-1: Load the driver class.
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step-2: Establish the connection.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			// For single update value
			// PreparedStatement ps = con.prepareStatement("update employee set username =?
			// where id =?");
            // For multiple update values
			PreparedStatement ps = con.prepareStatement("update employee set username=?,password=? where id =?");

			ps.setString(1, "Vishal");
			ps.setString(2, "Password");
			ps.setString(3, "1");

			int i = ps.executeUpdate();

			System.out.println("Records updated " + i);

			con.close();
			ps.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
