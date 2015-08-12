package com.ksb.openapi.mobile.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ksb.openapi.entity.CourierEntity;
import com.ksb.openapi.entity.ResultEntity;
import com.ksb.openapi.error.BaseSupportException;

public interface CourierService {

	
	/**
	 * 登录验证
	 * @param userName
	 * @param password
	 * @param eid 废弃(用户名全局唯一)
	 * @return
	 */
	public ResultEntity authen(String userName,String password,String eid);
	
	/**
	 * 修改自己的登录密码
	 * @param userName
	 * @param oldPasswd
	 * @param newPasswd
	 * @return
	 */
	public ResultEntity updateCourierPasswd(String eid,String userName,String oldPasswd,String newPasswd);
	
	/**
	 * 运单分配，配送员查找(查询status=0,work_status=0)
	 * @param uid
	 * @param realName
	 * @param phone
	 * @return
	 */
	public CourierEntity queryCourier(String uid,String realName,String phone);
	
	/**
	 * 新增一个快递员
	 * @param courierEntity
	 */
	public void createCourier(CourierEntity courierEntity);
	
	/**
	 * 更改快递员配送工作状态(开工、收工)
	 * @param cid
	 * @param eid
	 * @param workStatus
	 */
	public void updateCourierWorkStatus(String cid,String eid,String workStatus,String x,String y);
	
	/**
	 * 更新配送员当前位置
	 * @param cid
	 * @param eid
	 * @param x
	 * @param y
	 */
	public void recordCourierGps(String cid,String eid,String x,String y);
	
	/**
	 * 查询附近的配送员
	 * @param eid
	 * @param x
	 * @param y
	 * @return
	 */
	public List<String> queryNearCourier(String eid,String x,String y);
	
	/**
	 * 
	 * @param entity
	 * @param skip
	 * @param size
	 * @return
	 */
	public Map<String, Object> queryCorierList(CourierEntity entity,int skip,int size);
	
	/**
	 * 导入文件方式，批量创建配送员
	 * @param list
	 */
	public void batchCreateCourier(List<CourierEntity> list);
	
}
