package com.ksb.openapi.service;

import java.util.Map;

public interface StatisticsService {

	/**
	 * 按日期和订单状态，查询指定时间段内每天每个状态数据
	 * @param enterpriseId
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public Map<String, Object> groupQueryDateStatus(String enterpriseId,Long startTime,Long endTime,int skip,int size);
	
	/**
	 * 按日期、订单状态、配送员真实姓名, 查询指定时间段内 每天、每个配送员 各个状态的订单数量
	 * @param enterpriseId
	 * @param courierRealName
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public Map<String, Object> groupQueryCourierStatusByDate(String enterpriseId,String courierRealName,String dayStr,int skip,int size);
	
	/**
	 * 商家用户通过手机app查询自己已经完成或者取消的订单数据(按天)
	 * @param shipperId
	 * @param shipperUserId
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public Map<String, Map<String, String>> groupQueryShipperStatusByDate(String shipperId,String shipperUserId,Long startTime,Long endTime);
	
}
