package com.velocity.jdbc.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//Insert the data using statement.
public class InsertData {

	public static void main(String[] args) {
		try {
			String sql = "insert into user (LastName,FirstName,Address,City,Salary)"
					+ "values('Dhumal','sachin','shaven','pune',8000)";

			// Step-1 : Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step-2 : Establish the connection.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			// Step-3 : Create the statement
			Statement statement = con.createStatement();

			// Step-4 : Submit the SQL statement

			 statement.execute(sql);

			System.out.println("Insertion is executed properly");

			con.close();
			statement.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
