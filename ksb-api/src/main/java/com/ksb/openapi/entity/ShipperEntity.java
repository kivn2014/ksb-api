package com.ksb.openapi.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value={"address","address_x","address_y","shansong_name","shansong_password","dada_appkey","dada_grantcode","shipper_type","province","city","district"})
public class ShipperEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3679766409341437668L;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getShansong_name() {
		return shansong_name;
	}
	public void setShansong_name(String shansong_name) {
		this.shansong_name = shansong_name;
	}
	public String getShansong_password() {
		return shansong_password;
	}
	public void setShansong_password(String shansong_password) {
		this.shansong_password = shansong_password;
	}
	public String getDada_appkey() {
		return dada_appkey;
	}
	public void setDada_appkey(String dada_appkey) {
		this.dada_appkey = dada_appkey;
	}
	public String getDada_grantcode() {
		return dada_grantcode;
	}
	public void setDada_grantcode(String dada_grantcode) {
		this.dada_grantcode = dada_grantcode;
	}

	public String getShipper_type() {
		return shipper_type;
	}
	public void setShipper_type(String shipper_type) {
		this.shipper_type = shipper_type;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	private String id;
	private String name;
	private String address;
	private String address_x;
	private String address_y;
	private String province;
	private String city;
	private String district;
	private String phone;
	private String tel;
	private String contact;
	private String status;
	private String shipper_type;
	
	private String shansong_name;
	private String shansong_password;
	
	private String dada_appkey;
	private String dada_grantcode;
	
	
	
}
