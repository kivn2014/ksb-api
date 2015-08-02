package com.ksb.openapi.mobile.service;

import java.util.Map;

public interface MobileWaybillService {

	/**
	 * 查询配送员名下的运单数据
	 * @param courierId
	 * @param waybillId
	 * @param waybillStatus
	 * @param skip
	 * @param size
	 * @return
	 */
	public Map<String, Object> searchWaybillByCourier(String courierId,String waybillId,String waybillStatus,int skip,int size);
	
	
	/**
	 * 配送员修改运单状态
	 * @param waybillId
	 * @param courierId
	 * @param waybillStatus
	 * @return
	 */
	public boolean updateWaybillStatusByCourier(String waybillId,String courierId,String waybillStatus);
	
	
}
