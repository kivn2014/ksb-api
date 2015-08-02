package com.ksb.openapi.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value={"passwd","src_passwd"})
public class ShipperUserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7912599783970955069L;
	
	/*shipper_user 表*/
	private String uid;
	private String name;
	private String nick_name;
	private String real_name;
	private String status;
	private String phone;
	private String passwd;
	private String src_passwd;
	private String sp_id;
	
	/*shippers表(商家名称、商家地址信息)*/
	private String address;
	private String address_detail;
	private String address_x;
	private String address_y;
	private String city_name;
	private String city_code;
	private String province_name;
	private String sp_name;
	private String new_user;
	
	private String enterprise_id;

	public String getEnterprise_id() {
		return enterprise_id;
	}
	public void setEnterprise_id(String enterprise_id) {
		this.enterprise_id = enterprise_id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getProvince_name() {
		return province_name;
	}
	public void setProvince_name(String province_name) {
		this.province_name = province_name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getSrc_passwd() {
		return src_passwd;
	}
	public void setSrc_passwd(String src_passwd) {
		this.src_passwd = src_passwd;
	}
	public String getSp_id() {
		return sp_id;
	}
	public void setSp_id(String sp_id) {
		this.sp_id = sp_id;
	}
	public String getNew_user() {
		return new_user;
	}
	public void setNew_user(String new_user) {
		this.new_user = new_user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress_detail() {
		return address_detail;
	}
	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
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
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getSp_name() {
		return sp_name;
	}
	public void setSp_name(String sp_name) {
		this.sp_name = sp_name;
	}
	public String getCity_code() {
		return city_code;
	}
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}
	
}
