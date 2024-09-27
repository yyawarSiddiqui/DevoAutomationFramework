package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.db.pojo.mst_role_POJO;

public class mst_role_dao {

	private Connection connection;
	private Statement statement;
	private mst_role_POJO mst_role_POJO;

	public mst_role_dao() {

		connection = DBConnector.getConnection();

		try {

			statement = connection.createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public mst_role_POJO getRoleDetail(int id) {

		try {
			ResultSet resultSet = statement
					.executeQuery("SELECT id, name, code, description, is_active, created_at, modified_at\r\n"
							+ "FROM SR_DEV.mst_role\r\n" + "WHERE id=" + id + ";");

			while (resultSet.next()) {

				mst_role_POJO = new mst_role_POJO(resultSet.getInt("id"), resultSet.getString("name"),
						resultSet.getString("code"), resultSet.getString("description"), resultSet.getInt("is_active"),
						resultSet.getString("created_at"), resultSet.getString("modified_at"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return mst_role_POJO;
	}
}
