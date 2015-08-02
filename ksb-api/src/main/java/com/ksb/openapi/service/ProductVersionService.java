package com.ksb.openapi.service;

import com.ksb.openapi.entity.ProductVersionEntity;

public interface ProductVersionService {

	/**
	 * 查询app最新版本信息
	 * @param productType
	 * @return
	 */
	public ProductVersionEntity queryLatestVersion(String productType);
	
	/**
	 * 新增一个app版本信息
	 * @param productVersionEntity
	 */
	public void addAppVersion(ProductVersionEntity productVersionEntity);
	
	
}
