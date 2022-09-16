package com.velocity.jdbc.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//Insert The data using prepared Statement
public class InsertInfo {

	public static void main(String[] args) {

		try {
			//Step-1: Load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step-2: Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			//Step-3: Create the prepared statement
			PreparedStatement pStatement = con.prepareStatement("insert into employee (username,password) values (?,?)");
			
			//Step-4: Prepare the sql
			pStatement.setString(1, "Amol");
			pStatement.setString(2, "Diwali");
			
			int i = pStatement.executeUpdate();
			
			System.out.println("Record is inserted or not"+i);
			//Step-5: release the resource.
			con.close();
			pStatement.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
