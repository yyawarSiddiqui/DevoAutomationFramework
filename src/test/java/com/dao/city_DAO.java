package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.pojo.City_POJO_DB;

public class city_DAO {

	Connection connection;
	Statement statement;
	City_POJO_DB data;

	public city_DAO() {

		connection = DBConnector.getConnection();
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public City_POJO_DB getMST_OEM_Data_ByName(int id, String name) {

		ResultSet resultSet;
		try {
			resultSet = statement.executeQuery(
					"SELECT id, name, code, is_active, created_at, modified_at FROM SR_DEV.mst_oem where id=" + id
							+ " and name=" + name + "");

			while (resultSet.next()) { // Result set doesn't have Has Next instead we have next method

				data = new City_POJO_DB(resultSet.getInt("id"), resultSet.getString("name"),
						resultSet.getString("code"));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return data;

	}
}
