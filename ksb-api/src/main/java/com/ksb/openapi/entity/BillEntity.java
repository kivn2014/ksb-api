package com.ksb.openapi.entity;

import java.io.Serializable;

public class BillEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1312105171795866725L;
	private String id;
	private String waybill_id;
	private String sp_id;
	private String cid;
	private String buyer_id;
	private String waybill_distance;
	private String amount;
	private String create_time;
	private String status;
	
	
	public String getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(String buyer_id) {
		this.buyer_id = buyer_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWaybill_id() {
		return waybill_id;
	}
	public void setWaybill_id(String waybill_id) {
		this.waybill_id = waybill_id;
	}
	public String getSp_id() {
		return sp_id;
	}
	public void setSp_id(String sp_id) {
		this.sp_id = sp_id;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getWaybill_distance() {
		return waybill_distance;
	}
	public void setWaybill_distance(String waybill_distance) {
		this.waybill_distance = waybill_distance;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
