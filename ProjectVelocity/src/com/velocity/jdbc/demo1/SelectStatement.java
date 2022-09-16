package com.velocity.jdbc.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectStatement {

	public static void main(String[] args) {
		try {
			// Load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from user");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("ID :" + rs.getInt(1));
				System.out.println("FIRST NAME :" + rs.getString(3));
				System.out.println("LAST NAME :" + rs.getString(2));
				System.out.println("SALARY :" + rs.getString(6));
			}
			con.close();
			ps.close();
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
