package com.dao;

import java.sql.Connection;

import com.db.pojo.City_POJO_DB;
import com.db.pojo.Job_Head_POJO;

public class Runner {

	public static void main(String[] args) {

		Connection d1 = DBConnector.getConnection();// You cann't create an object of the Singleton class as it has
													// private Constructor

//		System.out.println(d1);
//
//		Connection d2 = DBConnector.getConnection();
//
//		System.out.println(d2);

		city_DAO city_DAO = new city_DAO();

		City_POJO_DB city_POJO_DB = city_DAO.getMST_OEM_Data_ByName(2, "name");
		System.out.println(city_POJO_DB.getName());

		tr_job_head_DAO tr_job_head_DAO = new tr_job_head_DAO();

		System.out.println("===============================================================");

		Job_Head_POJO job_Head_POJO = tr_job_head_DAO.getJobDetails(34408);
		System.out.println(job_Head_POJO.getTr_customer_id());
		System.out.println(job_Head_POJO);

	}

}
