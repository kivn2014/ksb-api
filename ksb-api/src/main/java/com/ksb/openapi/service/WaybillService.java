package com.ksb.openapi.service;

import java.util.Map;

public interface WaybillService {

	
	/**
	 * 根据查询条件，检索商家所有在快送宝发的运单数据
	 * @param id
	 * @param orderId
	 * @param buyerName
	 * @param buyerPhone
	 * @return
	 */
	public Map<String, Object> searchShipperOrderInfo(Long id,String orderId,String status,String buyerName,String buyerPhone);
	
	/**
	 * 运单录入(快送宝web页面入库)
	 * @param map
	 * @return
	 */
	public boolean addWaybillByWeb(Map<String, String> map);
	
	/**
	 * 根据快送宝openapi
	 * @param map
	 * @return
	 */
	public boolean addWaybillByOpenApi(Map<String, String> map);
	
	/**
	 * 为配送员分配运单
	 * 根据状态防止重复分配
	 * @param waybillId
	 * @param courierId
	 * @return
	 */
	public boolean allocationWaybill2Courier(String waybillId,String courierId);
	
	/**
	 * 查询运单数据
	 * @param pm
	 * @param skip
	 * @param size
	 * @return
	 */
	public Map<String, Object> searchWaybillInfo(Map<String, String> pm, int skip, int size);
}
