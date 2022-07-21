package com.evoke.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConfig {

	// Initialize the JDBC connection
	Connection connection = null;

	public void connect(String url, String userName, String password, String driverName) {

		try {
			// Initialize the JDBC driver
			Class.forName(driverName);

			// Establish the connection
			connection = DriverManager.getConnection(url, userName, password);

			System.out.println("Connectoin is successfully established...");

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

	}

	public void insert(String sql) {

		try {
			Statement statement = connection.createStatement(); // initialiizing statement

			int recordsCount = statement.executeUpdate(sql); // excute statement

			System.out.println("inserted successfully");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	
	public void updateCar(String updatesql) {   

		try {
			Statement statement = connection.createStatement(); // initialiizing statement

			int recordsCount = statement.executeUpdate(updatesql); // excute statement

			System.out.println("Update successfully");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public void delete(String deletesql) {

		try {
			Statement statement = connection.createStatement(); // initialiizing statement

			int recordsCount = statement.executeUpdate(deletesql); // excute statement

			System.out.println("Deleted successfully");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
