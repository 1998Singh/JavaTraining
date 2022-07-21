package com.evoke.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {
	
	// Initialize the JDBC connection
	Connection connection = null;

	public void connect(String url, String userName, String password, String driverName) {
		try {

			Class.forName(driverName); // Initialize the JDBC driver

			connection = DriverManager.getConnection(url, userName, password); // Establish the connection

			System.out.println("Connection Successfull...");

		} catch (Exception e) {

			e.printStackTrace();
			System.exit(0);
		}
	}

	public void insert(String sql) {
		try {
			PreparedStatement prepared = connection.prepareStatement(sql); // initialiizing prepared statement
			prepared.setInt(1, 10);
			prepared.setString(2, "Singh");
			prepared.setString(3, "ECE");
			prepared.setInt(4, 50000);
			prepared.setInt(5, 70);
			prepared.setString(6, "M");

			int record = prepared.executeUpdate(); // excute prepared statement
			System.out.println("Record inserted");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
