package com.ksb.openapi.mobile.service;

import java.util.List;
import java.util.Map;

import com.ksb.openapi.entity.EnterpriseCityEntity;
import com.ksb.openapi.entity.EnterpriseEntity;
import com.ksb.openapi.entity.ResultEntity;
import com.ksb.openapi.entity.ShipperAddressEntity;
import com.ksb.openapi.entity.ShipperEntity;
import com.ksb.openapi.entity.ShipperUserEntity;

public interface ShipperService {

	/**
	 * 查询商家列表
	 * @param paraMap
	 * @return
	 */
	public List<ShipperEntity> queryShipperList(Map<String, String> paraMap);
	
	/**
	 * 创建一个商家
	 * @param shipperEntity
	 */
	public void createShipper(ShipperEntity shipperEntity);
	
	/**
	 * 根据商家ID检索商家详细信息
	 * @param id
	 */
	public void queryShipperById(String id);
	
	/**
	 * 查询商家常用地址
	 * @param spId
	 * @param cityName
	 */
	public List<Map<String, String>> shipperCommonAddress(String spId,String cityName);
	
	/**
	 * 商家用户身份校验
	 * @param un
	 * @param pwd
	 * @return
	 */
	public ResultEntity authenSpUser(String un,String pwd);
	
	/**
	 * 商家设置 店名以及店的地址
	 * @param pm
	 */
	public ShipperUserEntity updateShipperDefualtAddress(ShipperUserEntity entity);
	
	/**
	 * 
	 * @param entity
	 */
	public void createShipperAndUser(ShipperUserEntity entity);
	
	/**
	 * 商家版APP修改登录密码
	 * @param userName
	 * @param oldPasswd
	 * @param newPasswd
	 * @return
	 */
	public ResultEntity updateShipperUserPasswd(String userName, String oldPasswd,
			String newPasswd);
	
	/**
	 * 电商查看自己发布的O2O订单
	 * @param shipperId
	 * @param waybillId
	 * @param waybillStatus
	 * @param startTime
	 * @param endTime
	 * @param skip
	 * @param size
	 * @return
	 */
	public Map<String, Object> queryWaybillByShipper(String shipperId,
			String waybillId, String waybillStatus,int skip, int size);
	
	/**
	 * 商家APP 运单列表title，不同状态的运单数据
	 * @param shipperId
	 * @return
	 */
	public List<Map<String, String>> currentDayShipperWayBillStatistic(String shipperId);
	
	/**
	 * 商家app，发布配送订单
	 * @param paraMap
	 */
	public void createWaybill(Map<String, String> paraMap);
	
	/**
	 * 查询报社自己生成的电商
	 * @param eid 报社
	 * @param spName 商家名称
	 * @param skip
	 * @param size
	 */
	public Map<String, Object> querySpUser(String eid,String spName,int skip, int size);
	
	/**
	 * 根据城市信息 获取负责该城市配送的企业
	 * @param cityName
	 * @param adcode
	 * @param cityCode
	 * @param district
	 * @return
	 */
	public List<EnterpriseCityEntity> getEnterpriseAreaByCityInfo(String cityName,String adcode,String cityCode,String district);
	
	/**
	 * 创建配送企业
	 * @param enterprise
	 */
	public void createEnterprise(EnterpriseEntity enterprise);
	
	/**
	 * 创建商家
	 * @param spEntity
	 */
	public void createShipper(ShipperEntity spEntity,String eid);
	
	/**
	 * 商家更新订单状态(一般操作为 取消订单)
	 * @param spId  商家编号
	 * @param spUserId 商家用户编号
	 * @param waybillId 运单编号
	 * @param status 运单状态(-3 表示取消)
	 */
	public void shipperHandleWaybill(String spId,String spUserId,String waybillId,String status);
	
	/**
	 * 商家常用发货地址列表
	 * @param sp_id 商家编号
	 * @return
	 */
	public List<ShipperAddressEntity> queryShipperAddressList(String sp_id);
	
	/**
	 * 修改商家默认发货地址
	 * @param sp_id
	 * @param address_id
	 */
	public void shipperDefaultAddress(String sp_id,String address_id);
	
	/**
	 * 修改商家发货地址
	 * @param entity
	 */
	public void editShipperAddress(ShipperAddressEntity entity);
	
	/**
	 * 商家地址删除
	 * @param sp_id
	 * @param address_id
	 */
	public void cancelShipperAddress(String sp_id,String address_id);
	
	/**
	 * 新版商家添加发货地址
	 * @param entity
	 */
	public void addShipperAddress(ShipperAddressEntity entity);
}
