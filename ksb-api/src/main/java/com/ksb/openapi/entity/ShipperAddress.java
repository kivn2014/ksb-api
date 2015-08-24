package com.ksb.openapi.entity;

import java.io.Serializable;

public class ShipperAddress implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1855326748775080009L;
	private String id;
	/*shippers 表主键*/
	private String shippers_id;
	/*商家地址 省市区、街道/道路/小区*/
	private String address;
	/*门牌号*/
	private String address_detail;
	/*经度*/
	private String address_x;
	/*纬度*/
	private String address_y;
	/*地址使用次数*/
	private String use_times;
	/*城市名称*/
	private String city_name;
	/*城市city_code*/
	private String city_code;
	/*是否默认地址*/
	private String is_default;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getShippers_id() {
		return shippers_id;
	}
	public void setShippers_id(String shippers_id) {
		this.shippers_id = shippers_id;
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
	public String getUse_times() {
		return use_times;
	}
	public void setUse_times(String use_times) {
		this.use_times = use_times;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getCity_code() {
		return city_code;
	}
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}
	public String getIs_default() {
		return is_default;
	}
	public void setIs_default(String is_default) {
		this.is_default = is_default;
	}
	
	
}
