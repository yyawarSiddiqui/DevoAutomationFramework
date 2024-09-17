package com.db.pojo;

public class Job_Head_POJO {

	private int id;
	private String job_number;
	private int tr_customer_id;
	private int tr_customer_product_id;
	private int mst_service_location_id;
	private int mst_platform_id;
	private int mst_warrenty_status_id;
	private int mst_oem_id;
	private String repair_start_date;
	private String repair_end_date;
	private String created_at;
	private String modified_at;
	private int tr_job_detail_id;

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

	public int getTr_job_detail_id() {
		return tr_job_detail_id;
	}

	public void setTr_job_detail_id(int tr_job_detail_id) {
		this.tr_job_detail_id = tr_job_detail_id;
	}

	public Job_Head_POJO(int id, String job_number, int tr_customer_id, int tr_customer_product_id,
			int mst_service_location_id, int mst_platform_id, int mst_warrenty_status_id, int mst_oem_id,
			String repair_start_date, String repair_end_date, String created_at, String modified_at,
			int tr_job_detail_id) {
		super();
		this.id = id;
		this.job_number = job_number;
		this.tr_customer_id = tr_customer_id;
		this.tr_customer_product_id = tr_customer_product_id;
		this.mst_service_location_id = mst_service_location_id;
		this.mst_platform_id = mst_platform_id;
		this.mst_warrenty_status_id = mst_warrenty_status_id;
		this.mst_oem_id = mst_oem_id;
		this.repair_start_date = repair_start_date;
		this.repair_end_date = repair_end_date;
		this.created_at = created_at;
		this.modified_at = modified_at;
		this.tr_job_detail_id = tr_job_detail_id;
	}

	@Override
	public String toString() {
		return "Job_Head_POJO [id=" + id + ", job_number=" + job_number + ", tr_customer_id=" + tr_customer_id
				+ ", tr_customer_product_id=" + tr_customer_product_id + ", mst_service_location_id="
				+ mst_service_location_id + ", mst_platform_id=" + mst_platform_id + ", mst_warrenty_status_id="
				+ mst_warrenty_status_id + ", mst_oem_id=" + mst_oem_id + ", repair_start_date=" + repair_start_date
				+ ", repair_end_date=" + repair_end_date + ", created_at=" + created_at + ", modified_at=" + modified_at
				+ ", tr_job_detail_id=" + tr_job_detail_id + "]";
	}

}
