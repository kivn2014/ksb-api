package com.ksb.openapi.entity;

import java.io.Serializable;

public class ShipperWaybill implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6946789095748437842L;
	
	private String sp_id;
	private String remarks;
	private String city_code;
	private String city_name;
	private String x;
	private String y;
	
	private String cargo_type;
	private String cargo_num;
	private String num;
	public String getSp_id() {
		return sp_id;
	}
	public void setSp_id(String sp_id) {
		this.sp_id = sp_id;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCity_code() {
		return city_code;
	}
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public String getCargo_type() {
		return cargo_type;
	}
	public void setCargo_type(String cargo_type) {
		this.cargo_type = cargo_type;
	}
	public String getCargo_num() {
		return cargo_num;
	}
	public void setCargo_num(String cargo_num) {
		this.cargo_num = cargo_num;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
}
