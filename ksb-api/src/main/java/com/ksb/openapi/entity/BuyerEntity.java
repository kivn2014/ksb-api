package com.ksb.openapi.entity;

import java.io.Serializable;
import java.net.URLDecoder;


public class BuyerEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1210105830240217778L;
	
	public String getName() {
		try{
			return URLDecoder.decode(name, "utf-8");
		}catch(Exception e){
			return name;
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		try{
			return URLDecoder.decode(address, "utf-8");
		}catch(Exception e){
			return address;
		}
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
    public String getAddress_x() {
		return address_x;
	}
	public void setAddress_x(String address_x) {
		this.address_x = address_x;
	}
	public String getAddress_y() {
		return address_y;
	}
	public void setAddress_y(String address_y) {
		this.address_y = address_y;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
//	public String getWabill_id() {
//		return wabill_id;
//	}
//	public void setWabill_id(String wabill_id) {
//		this.wabill_id = wabill_id;
//	}

	public String getWbid() {
		return wbid;
	}
	public void setWbid(String wbid) {
		this.wbid = wbid;
	}

	private String id;
	private String name;
	private String phone;
	private String address_x;
	private String address_y;
	private String address;
	private String status;
	private String user_type;
	
	/*冗余字段，运单批量insert的时候(每个客户是一个独立的运单)*/
//	private String wabill_id;
	private String wbid;


}
