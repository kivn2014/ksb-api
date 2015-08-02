package com.ksb.openapi.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value={"id","product_type"})
public class ProductVersionEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6991879856545882198L;
	
	private String id;
	private Double version_num;
	private String product_type;
	private String version_code;
	private String publish_time;
	private String download_url;
	
	public String getDownload_url() {
		return download_url;
	}
	public void setDownload_url(String download_url) {
		this.download_url = download_url;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getVersion_num() {
		return version_num;
	}
	public void setVersion_num(Double version_num) {
		this.version_num = version_num;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	public String getVersion_code() {
		return version_code;
	}
	public void setVersion_code(String version_code) {
		this.version_code = version_code;
	}
	public String getPublish_time() {
		return publish_time;
	}
	public void setPublish_time(String publish_time) {
		this.publish_time = publish_time;
	}

}
