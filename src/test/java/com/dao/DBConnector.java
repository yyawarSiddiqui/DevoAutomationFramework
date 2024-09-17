package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector { // Main purpose of the Singleton pattern is to create one & Only one
							// object/instance i.e. Memory allocation is only once
							// Use Case--For Logging Framework, Multi Threading and Parallel Testing

	public static DBConnector dBConnector;
	public static Connection connection;

	private DBConnector() {

		try {
			connection = DriverManager.getConnection("jdbc:mysql://139.59.91.96:3306/SR_DEV", "produser", "qweQWe123!");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public static Connection getConnection() {

		if (dBConnector == null) {

			dBConnector = new DBConnector();
		}
		return connection;
	}

}
