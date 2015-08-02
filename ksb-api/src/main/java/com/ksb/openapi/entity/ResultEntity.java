package com.ksb.openapi.entity;

import java.io.Serializable;

public class ResultEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5095648178587582674L;
	private boolean success = false;
	private String errors = null;
	private Object obj = null;

	public ResultEntity(boolean sucess,String errors,Object obj){
	
		this.success = sucess;
		this.errors = errors;
		this.obj = obj;
	}
	public ResultEntity(){}
	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getErrors() {
		return errors;
	}

	public void setErrors(String errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		return "result [success=" + success + ", errors=" + errors + ",data="+obj+"]";
	}
}
