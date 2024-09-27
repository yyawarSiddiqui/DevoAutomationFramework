package com.pojo;

import java.util.Arrays;


public class EngMyJobsAPIRequestdata {

	private int id;
	private String job_number;
	private int tr_customer_id;
	private int tr_customer_product_id;
	private int mst_service_location_id;
	private int mst_platform_id;
	private int mst_action_status_id;
	private int mst_warrenty_status_id;
	private int mst_oem_id;
	private String repair_start_date;
	private String repair_end_date;
	private String created_at;
	private String modified_at;
	private String name;
	private String mobile_number;
	private String email_id;
	private String dop;
	private String serial_number;
	private String imei1;
	private String imei2;
	private String popurl;
	private int mst_model_id;
	private int mst_product_id;
	private String mst_model_name;
	private String mst_product_name;
	private String mst_service_location_name;
	private String mst_action_status_code;
	private String mst_platform_name;
	private String mst_warrenty_status;
	private String mst_oem_name;
	private String mst_action_status;
	private int assigned_by;
	private String assigned_on;
	private int assigned_to;
	private String mst_warrenty_status_code;
	
	private problemsEngMyJobsAPIRequest[] problems;
	private  quatationsdata [] quatations;
	
	public EngMyJobsAPIRequestdata(int id, String job_number, int tr_customer_id, int tr_customer_product_id,
			int mst_service_location_id, int mst_platform_id, int mst_action_status_id, int mst_warrenty_status_id,
			int mst_oem_id, String repair_start_date, String repair_end_date, String created_at, String modified_at,
			String name, String mobile_number, String email_id, String dop, String serial_number, String imei1,
			String imei2, String popurl, int mst_model_id, int mst_product_id, String mst_model_name,
			String mst_product_name, String mst_service_location_name, String mst_action_status_code,
			String mst_platform_name, String mst_warrenty_status, String mst_oem_name, String mst_action_status,
			int assigned_by, String assigned_on, int assigned_to, String mst_warrenty_status_code,
			problemsEngMyJobsAPIRequest[] problems, quatationsdata[] quatations) {
		super();
		this.id = id;
		this.job_number = job_number;
		this.tr_customer_id = tr_customer_id;
		this.tr_customer_product_id = tr_customer_product_id;
		this.mst_service_location_id = mst_service_location_id;
		this.mst_platform_id = mst_platform_id;
		this.mst_action_status_id = mst_action_status_id;
		this.mst_warrenty_status_id = mst_warrenty_status_id;
		this.mst_oem_id = mst_oem_id;
		this.repair_start_date = repair_start_date;
		this.repair_end_date = repair_end_date;
		this.created_at = created_at;
		this.modified_at = modified_at;
		this.name = name;
		this.mobile_number = mobile_number;
		this.email_id = email_id;
		this.dop = dop;
		this.serial_number = serial_number;
		this.imei1 = imei1;
		this.imei2 = imei2;
		this.popurl = popurl;
		this.mst_model_id = mst_model_id;
		this.mst_product_id = mst_product_id;
		this.mst_model_name = mst_model_name;
		this.mst_product_name = mst_product_name;
		this.mst_service_location_name = mst_service_location_name;
		this.mst_action_status_code = mst_action_status_code;
		this.mst_platform_name = mst_platform_name;
		this.mst_warrenty_status = mst_warrenty_status;
		this.mst_oem_name = mst_oem_name;
		this.mst_action_status = mst_action_status;
		this.assigned_by = assigned_by;
		this.assigned_on = assigned_on;
		this.assigned_to = assigned_to;
		this.mst_warrenty_status_code = mst_warrenty_status_code;
		this.problems = problems;
		this.quatations = quatations;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJob_number() {
		return job_number;
	}

	public void setJob_number(String job_number) {
		this.job_number = job_number;
	}

	public int getTr_customer_id() {
		return tr_customer_id;
	}

	public void setTr_customer_id(int tr_customer_id) {
		this.tr_customer_id = tr_customer_id;
	}

	public int getTr_customer_product_id() {
		return tr_customer_product_id;
	}

	public void setTr_customer_product_id(int tr_customer_product_id) {
		this.tr_customer_product_id = tr_customer_product_id;
	}

	public int getMst_service_location_id() {
		return mst_service_location_id;
	}

	public void setMst_service_location_id(int mst_service_location_id) {
		this.mst_service_location_id = mst_service_location_id;
	}

	public int getMst_platform_id() {
		return mst_platform_id;
	}

	public void setMst_platform_id(int mst_platform_id) {
		this.mst_platform_id = mst_platform_id;
	}

	public int getMst_action_status_id() {
		return mst_action_status_id;
	}

	public void setMst_action_status_id(int mst_action_status_id) {
		this.mst_action_status_id = mst_action_status_id;
	}

	public int getMst_warrenty_status_id() {
		return mst_warrenty_status_id;
	}

	public void setMst_warrenty_status_id(int mst_warrenty_status_id) {
		this.mst_warrenty_status_id = mst_warrenty_status_id;
	}

	public int getMst_oem_id() {
		return mst_oem_id;
	}

	public void setMst_oem_id(int mst_oem_id) {
		this.mst_oem_id = mst_oem_id;
	}

	public String getRepair_start_date() {
		return repair_start_date;
	}

	public void setRepair_start_date(String repair_start_date) {
		this.repair_start_date = repair_start_date;
	}

	public String getRepair_end_date() {
		return repair_end_date;
	}

	public void setRepair_end_date(String repair_end_date) {
		this.repair_end_date = repair_end_date;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getModified_at() {
		return modified_at;
	}

	public void setModified_at(String modified_at) {
		this.modified_at = modified_at;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getDop() {
		return dop;
	}

	public void setDop(String dop) {
		this.dop = dop;
	}

	public String getSerial_number() {
		return serial_number;
	}

	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}

	public String getImei1() {
		return imei1;
	}

	public void setImei1(String imei1) {
		this.imei1 = imei1;
	}

	public String getImei2() {
		return imei2;
	}

	public void setImei2(String imei2) {
		this.imei2 = imei2;
	}

	public String getPopurl() {
		return popurl;
	}

	public void setPopurl(String popurl) {
		this.popurl = popurl;
	}

	public int getMst_model_id() {
		return mst_model_id;
	}

	public void setMst_model_id(int mst_model_id) {
		this.mst_model_id = mst_model_id;
	}

	public int getMst_product_id() {
		return mst_product_id;
	}

	public void setMst_product_id(int mst_product_id) {
		this.mst_product_id = mst_product_id;
	}

	public String getMst_model_name() {
		return mst_model_name;
	}

	public void setMst_model_name(String mst_model_name) {
		this.mst_model_name = mst_model_name;
	}

	public String getMst_product_name() {
		return mst_product_name;
	}

	public void setMst_product_name(String mst_product_name) {
		this.mst_product_name = mst_product_name;
	}

	public String getMst_service_location_name() {
		return mst_service_location_name;
	}

	public void setMst_service_location_name(String mst_service_location_name) {
		this.mst_service_location_name = mst_service_location_name;
	}

	public String getMst_action_status_code() {
		return mst_action_status_code;
	}

	public void setMst_action_status_code(String mst_action_status_code) {
		this.mst_action_status_code = mst_action_status_code;
	}

	public String getMst_platform_name() {
		return mst_platform_name;
	}

	public void setMst_platform_name(String mst_platform_name) {
		this.mst_platform_name = mst_platform_name;
	}

	public String getMst_warrenty_status() {
		return mst_warrenty_status;
	}

	public void setMst_warrenty_status(String mst_warrenty_status) {
		this.mst_warrenty_status = mst_warrenty_status;
	}

	public String getMst_oem_name() {
		return mst_oem_name;
	}

	public void setMst_oem_name(String mst_oem_name) {
		this.mst_oem_name = mst_oem_name;
	}

	public String getMst_action_status() {
		return mst_action_status;
	}

	public void setMst_action_status(String mst_action_status) {
		this.mst_action_status = mst_action_status;
	}

	public int getAssigned_by() {
		return assigned_by;
	}

	public void setAssigned_by(int assigned_by) {
		this.assigned_by = assigned_by;
	}

	public String getAssigned_on() {
		return assigned_on;
	}

	public void setAssigned_on(String assigned_on) {
		this.assigned_on = assigned_on;
	}

	public int getAssigned_to() {
		return assigned_to;
	}

	public void setAssigned_to(int assigned_to) {
		this.assigned_to = assigned_to;
	}

	public String getMst_warrenty_status_code() {
		return mst_warrenty_status_code;
	}

	public void setMst_warrenty_status_code(String mst_warrenty_status_code) {
		this.mst_warrenty_status_code = mst_warrenty_status_code;
	}

	public problemsEngMyJobsAPIRequest[] getProblems() {
		return problems;
	}

	public void setProblems(problemsEngMyJobsAPIRequest[] problems) {
		this.problems = problems;
	}

	public quatationsdata[] getQuatations() {
		return quatations;
	}

	public void setQuatations(quatationsdata[] quatations) {
		this.quatations = quatations;
	}

	@Override
	public String toString() {
		return "EngMyJobsAPIRequestdata [id=" + id + ", job_number=" + job_number + ", tr_customer_id=" + tr_customer_id
				+ ", tr_customer_product_id=" + tr_customer_product_id + ", mst_service_location_id="
				+ mst_service_location_id + ", mst_platform_id=" + mst_platform_id + ", mst_action_status_id="
				+ mst_action_status_id + ", mst_warrenty_status_id=" + mst_warrenty_status_id + ", mst_oem_id="
				+ mst_oem_id + ", repair_start_date=" + repair_start_date + ", repair_end_date=" + repair_end_date
				+ ", created_at=" + created_at + ", modified_at=" + modified_at + ", name=" + name + ", mobile_number="
				+ mobile_number + ", email_id=" + email_id + ", dop=" + dop + ", serial_number=" + serial_number
				+ ", imei1=" + imei1 + ", imei2=" + imei2 + ", popurl=" + popurl + ", mst_model_id=" + mst_model_id
				+ ", mst_product_id=" + mst_product_id + ", mst_model_name=" + mst_model_name + ", mst_product_name="
				+ mst_product_name + ", mst_service_location_name=" + mst_service_location_name
				+ ", mst_action_status_code=" + mst_action_status_code + ", mst_platform_name=" + mst_platform_name
				+ ", mst_warrenty_status=" + mst_warrenty_status + ", mst_oem_name=" + mst_oem_name
				+ ", mst_action_status=" + mst_action_status + ", assigned_by=" + assigned_by + ", assigned_on="
				+ assigned_on + ", assigned_to=" + assigned_to + ", mst_warrenty_status_code="
				+ mst_warrenty_status_code + ", problems=" + Arrays.toString(problems) + ", quatations="
				+ Arrays.toString(quatations) + "]";
	}
	
	

}
