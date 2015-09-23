package com.ksb.openapi.mobile.service;

import java.util.List;
import java.util.Map;

import com.ksb.openapi.entity.BuyerEntity;
import com.ksb.openapi.entity.ResultEntity;

public interface O2oWaybillService {

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
	
	
	/**
	 * 当前O2O运单配送统计
	 * @param courierId
	 */
	public List<Map<String, String>> currentDayWayBillStatistic(String courierId);
	
	/**
	 * 批量收件
	 * @param paraMap
	 */
	public void batchFetchO2OWaybill(Map<String, String> paraMap);
	
	/**
	 * O2O配送情况统计
	 * @param cid
	 * @return
	 */
	public Map<String, String> courierPaymentStat(String cid);
	
	/**
	 * 配送员增加自定义备注信息
	 * @param cid
	 * @param waybillId
	 * @param customRemarks
	 */
	public void updateCustomRemark(String cid,String waybillId,String customRemarks);
	
	/**
	 * 配送员拍外卖小票上传
	 * @param cid 配送员id
	 * @param wbid 订单id
	 * @param imgId 小票照片id
	 */
	public void saveWaybillImgId(String cid,String wbid,String imgId,String pay_sp_fee,String fetch_buyer_fee);
	
	/**
	 * 补录订单中买家信息以及计算订单配送距离
	 * @param entity
	 * @param sp_x
	 * @param sp_y
	 */
	public void saveBuyerInfo(BuyerEntity entity,double sp_x,double sp_y,String sp_id);
}
