package com.ksb.openapi.mobile.service;

import java.util.List;

public interface RedisService {

	/**
	 * 经纬度写入到redis中
	 * @param cid
	 * @param eid
	 * @param x
	 * @param y
	 */
	public abstract void recordCourierGps(String cid, String eid, String x,
			String y);

	/**
	 * 更新redis中得工作状态
	 * @param cid
	 * @param workStatus
	 */
	public abstract void updateWorkStatus(String cid, String workStatus);

	/**
	 * 更新配送员配送状态
	 * @param cid
	 * @param deliveryStauts
	 */
	public abstract void updateDeliveryStatus(String cid, String deliveryStauts);

	/**
	 * 从redis中查询最近的配送员
	 * @param eid
	 * @param x
	 * @param y
	 * @return  null表示redis宕机
	 */
	public abstract List<String> queryNearCourier(String eid, String x, String y);
	
	/**
	 * redis是否正常
	 * @return
	 */
	public boolean redisIsWork();

}