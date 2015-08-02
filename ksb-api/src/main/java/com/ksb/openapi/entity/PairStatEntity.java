package com.ksb.openapi.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class PairStatEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4104533696293531261L;
	
	private String name;
	private List<Map<String, String>> list;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Map<String, String>> getList() {
		return list;
	}
	public void setList(List<Map<String, String>> list) {
		this.list = list;
	}
	
	
}
