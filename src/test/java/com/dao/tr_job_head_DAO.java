package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.pojo.Job_Head_POJO;

public class tr_job_head_DAO {

	private Connection connection;
	private Statement statement;
	private Job_Head_POJO data;

	public tr_job_head_DAO() {

		connection = DBConnector.getConnection();
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public Job_Head_POJO getJobDetails(int id) {

		ResultSet resultSet;
		try {
			resultSet = statement.executeQuery(
					"SELECT id, job_number, tr_customer_id, tr_customer_product_id, mst_service_location_id, mst_platform_id, mst_warrenty_status_id, mst_oem_id, repair_start_date, repair_end_date, created_at, modified_at, tr_job_detail_id FROM SR_DEV.tr_job_head WHERE id="
							+ id + " ;");

			while (resultSet.next()) { // Result set doesn't have Has Next instead we have next method

				data = new Job_Head_POJO(resultSet.getInt("id"), resultSet.getString("job_number"),
						resultSet.getInt("tr_customer_id"), resultSet.getInt("tr_customer_product_id"),
						resultSet.getInt("mst_service_location_id"), resultSet.getInt("mst_platform_id"),
						resultSet.getInt("mst_warrenty_status_id"), resultSet.getInt("mst_oem_id"),
						resultSet.getString("repair_start_date"), resultSet.getString("repair_end_date"),
						resultSet.getString("created_at"), resultSet.getString("modified_at"),
						resultSet.getInt("tr_job_detail_id"));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return data;

	}

}
