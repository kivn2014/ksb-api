package com.ksb.openapi.mobile.service;

import java.util.List;
import java.util.Map;

import com.ksb.openapi.entity.WayBillEntity;

public interface EretailerService {

	/**
	 * 根据电商运单ID查询运行明细
	 * 
	 * @param shipperOrderId 商家运单ID
	 * @return
	 */
	public WayBillEntity queryOlWaybill(String shipperOrderId);
	
	/**
	 * 根据快送宝运单ID查询运单明细
	 * @param waybillId
	 * @return
	 */
	public WayBillEntity queryOlWayBillByKsbId(String waybillId);
	
	/**
	 * 
	 * @param paraMap
	 */
	public void createOlWaybill(Map<String, String> paraMap);
	
	/**
	 * 当前电商运单配送统计
	 * @param courierId
	 */
	public List<Map<String, String>> currentDayWayBillStatistic(String courierId);
	
	/**
	 * 更新运单配送状态
	 * @param paraMap
	 */
	public void updateWaybillStatus(Map<String, String> paraMap);
	
	/**
	 * 运单扫描()
	 * @param olOrderId
	 * @return
	 */
	public WayBillEntity scanOlWaybill(String courierId,String olOrderId);
	
	/**
	 * 配送员查询当天运单数据列表
	 * @param courierId
	 * @param waybillId
	 * @param waybillStatus
	 * @param skip
	 * @param size
	 * @return
	 */
	public Map<String, Object> queryWaybillByCourier(String courierId,
			String waybillId, String waybillStatus, int skip, int size);
}
