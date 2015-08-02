package com.ksb.openapi.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value={"pwd","srcPwd"})

public class CourierEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8725188682451009850L;

	private String id;
	private String name;
	private String real_name;
	private String phone;
	private String sid;

	/*仅是创建快递员的时候，使用该参数，所有查询结果 不允许把密码查询查来*/
	private String pwd;
	private String srcPwd;
	private String address_x;
	private String address_y;
	private String delivery_status;
	/**
	 * 0 正常
	 * 1 锁定
	 * -1 注销 
	 * */
	private String status;
	
	/**
	 * 工作状态
	 * 0 开工(可以接受运单推送)
	 * 1 收工(不接受运单推送)
	 */
	private String work_status;
	
	/**星级(1-5)*/
	private String star_level;
	
	/**企业ID(隶属于那个报社)*/
	private String enterprise_id;
	
	private String enterprise_name;

	public String getId() {
//		return String.valueOf(id);
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getWork_status() {
		return work_status;
	}

	public void setWork_status(String work_status) {
		this.work_status = work_status;
	}

	public String getStar_level() {
		return star_level;
	}

	public void setStar_level(String star_level) {
		this.star_level = star_level;
	}

	public String getEnterprise_id() {
		return enterprise_id;
	}

	public void setEnterprise_id(String enterprise_id) {
		this.enterprise_id = enterprise_id;
	}

	public String getEnterprise_name() {
		return enterprise_name;
	}

	public void setEnterprise_name(String enterprise_name) {
		this.enterprise_name = enterprise_name;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSrcPwd() {
		return srcPwd;
	}

	public void setSrcPwd(String srcPwd) {
		this.srcPwd = srcPwd;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = String.valueOf(id);
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

	public String getDelivery_status() {
		return delivery_status;
	}

	public void setDelivery_status(String delivery_status) {
		this.delivery_status = delivery_status;
	}
	
	
//	@Override
//	@JsonIgnore
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "result [name=" + name + ", real_name=" + real_name + ",phone="+phone+",enterprise_name="+enterprise_name+",star_level="+star_level+"]";
//	}
	
}
