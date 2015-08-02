package com.ksb.web.service;

import java.util.List;
import java.util.Map;

import com.ksb.openapi.entity.CourierEntity;

public interface WebWaybillService {

	
	/**
	 * 运单分配系统，运单数据展示
	 * @param pm
	 * @param skip
	 * @param size
	 * @return
	 */
	public Map<String, Object> searchWaybillInfo(Map<String, String> pm, int skip, int size);
	
	
	/**
	 * 批量为配送员分配运单
	 * @param cid
	 * @param waybillList
	 */
	public void batchAllocateWaybill2Courier(String cid,List<String> waybillList);
}
