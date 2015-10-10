package com.ksb.openapi.pay.entity;

import java.io.Serializable;

/**
 * 
 * @author houshipeng
 * 商家充值实体对象
 */
public class RechargeEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6117026777272204920L;
	public String channel;
	public String amount;
	public String sp_id;
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getSp_id() {
		return sp_id;
	}
	public void setSp_id(String sp_id) {
		this.sp_id = sp_id;
	}
	
	
	
}
