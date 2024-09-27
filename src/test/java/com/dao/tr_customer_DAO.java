package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.pojo.tr_customer_POJO;

public class tr_customer_DAO {

	private Connection connection;
	private Statement statement;
	private tr_customer_POJO data;

	public tr_customer_DAO() {

		try {
			connection = DBConnector.getConnection();
			statement = connection.createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public tr_customer_POJO getDetailByCustomer_ID(int id) {
		ResultSet resultSet;

		try {

			resultSet = statement.executeQuery(
					"SELECT id, first_name, last_name, mobile_number, mobile_number_alt, email_id, email_id_alt, tr_customer_address_id, is_active, created_at, modified_at FROM SR_DEV.tr_customer WHERE id="
							+ id + ";");

			while (resultSet.next()) {

				data = new tr_customer_POJO(resultSet.getInt("id"), resultSet.getString("first_name"),
						resultSet.getString("last_name"), resultSet.getString("mobile_number"),
						resultSet.getString("mobile_number_alt"), resultSet.getString("email_id"),
						resultSet.getString("email_id_alt"), resultSet.getInt("tr_customer_address_id"),
						resultSet.getInt("is_active"), resultSet.getString("created_at"),
						resultSet.getString("modified_at"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return data;

	}

}
