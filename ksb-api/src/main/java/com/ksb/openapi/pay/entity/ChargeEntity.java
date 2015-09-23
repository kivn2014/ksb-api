package com.ksb.openapi.pay.entity;

import com.pingplusplus.model.Charge;

public class ChargeEntity extends Charge{

	private String ksbId;

	public String getKsbId() {
		return ksbId;
	}

	public void setKsbId(String ksbId) {
		this.ksbId = ksbId;
	}
	
	
}
