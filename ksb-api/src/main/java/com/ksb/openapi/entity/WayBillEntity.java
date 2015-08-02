package com.ksb.openapi.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value={"third_party_waybill_id","buyer_id"})
public class WayBillEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4312634270255480845L;

	
	
//	sb.append("id,shipper_origin_id,third_party_waybill_id,courier_id,shippers_id,buyer_id,cargo_type,cargo_weight,cargo_price,"
//			+ "cargo_num,create_time,expected_fetch_time,expected_arrival_time,province_name,city_name,pay_type,is_prepay,");
//	sb.append("waybill_status,payment_status,waybill_fee,pay_shipper_fee,fetch_buyer_fee,discount_fee,third_platform_id");
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getShipper_origin_id() {
		return shipper_origin_id;
	}
	public void setShipper_origin_id(String shipper_origin_id) {
		this.shipper_origin_id = shipper_origin_id;
	}
	public String getThird_party_waybill_id() {
		return third_party_waybill_id;
	}
	public void setThird_party_waybill_id(String third_party_waybill_id) {
		this.third_party_waybill_id = third_party_waybill_id;
	}
	public String getCourier_id() {
		return courier_id;
	}
	public void setCourier_id(String courier_id) {
		this.courier_id = courier_id;
	}
	public String getShippers_id() {
		return shippers_id;
	}
	public void setShippers_id(String shippers_id) {
		this.shippers_id = shippers_id;
	}
	public String getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(String buyer_id) {
		this.buyer_id = buyer_id;
	}
	public String getCargo_type() {
		return cargo_type;
	}
	public void setCargo_type(String cargo_type) {
		this.cargo_type = cargo_type;
	}
	public String getCargo_weight() {
		return cargo_weight;
	}
	public void setCargo_weight(String cargo_weight) {
		this.cargo_weight = cargo_weight;
	}
	public String getCargo_price() {
		return cargo_price;
	}
	public void setCargo_price(String cargo_price) {
		this.cargo_price = cargo_price;
	}
	public String getCargo_num() {
		return cargo_num;
	}
	public void setCargo_num(String cargo_num) {
		this.cargo_num = cargo_num;
	}
	public Long getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Long create_time) {
		this.create_time = create_time;
	}
	public Long getExpected_fetch_time() {
		return expected_fetch_time;
	}
	public void setExpected_fetch_time(Long expected_fetch_time) {
		this.expected_fetch_time = expected_fetch_time;
	}
	public Long getExpected_arrival_time() {
		return expected_arrival_time;
	}
	public void setExpected_arrival_time(Long expected_arrival_time) {
		this.expected_arrival_time = expected_arrival_time;
	}
	public String getProvince_name() {
		return province_name;
	}
	public void setProvince_name(String province_name) {
		this.province_name = province_name;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getPay_type() {
		return pay_type;
	}
	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}
	public String getIs_prepay() {
		return is_prepay;
	}
	public void setIs_prepay(String is_prepay) {
		this.is_prepay = is_prepay;
	}
	public String getWaybill_status() {
		return waybill_status;
	}
	public void setWaybill_status(String waybill_status) {
		this.waybill_status = waybill_status;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	public String getWaybill_fee() {
		return waybill_fee;
	}
	public void setWaybill_fee(String waybill_fee) {
		this.waybill_fee = waybill_fee;
	}
	public String getPay_shipper_fee() {
		return pay_shipper_fee;
	}
	public void setPay_shipper_fee(String pay_shipper_fee) {
		this.pay_shipper_fee = pay_shipper_fee;
	}
	public String getFetch_buyer_fee() {
		return fetch_buyer_fee;
	}
	public void setFetch_buyer_fee(String fetch_buyer_fee) {
		this.fetch_buyer_fee = fetch_buyer_fee;
	}
	public String getDiscount_fee() {
		return discount_fee;
	}
	public void setDiscount_fee(String discount_fee) {
		this.discount_fee = discount_fee;
	}
	public String getThird_platform_id() {
		return third_platform_id;
	}
	public void setThird_platform_id(String third_platform_id) {
		this.third_platform_id = third_platform_id;
	}
	public String getImport_batch() {
		return import_batch;
	}
	public void setImport_batch(String import_batch) {
		this.import_batch = import_batch;
	}
	public String getBooking_fetch() {
		return booking_fetch;
	}
	public void setBooking_fetch(String booking_fetch) {
		this.booking_fetch = booking_fetch;
	}
	public Long getBooking_fetch_time() {
		return booking_fetch_time;
	}
	public void setBooking_fetch_time(Long booking_fetch_time) {
		this.booking_fetch_time = booking_fetch_time;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCargo_name() {
		return cargo_name;
	}
	public void setCargo_name(String cargo_name) {
		this.cargo_name = cargo_name;
	}
	public String getIs_topay() {
		return is_topay;
	}
	public void setIs_topay(String is_topay) {
		this.is_topay = is_topay;
	}
	public String getWaybill_type() {
		return waybill_type;
	}
	public void setWaybill_type(String waybill_type) {
		this.waybill_type = waybill_type;
	}

	public String getFinish_time() {
		return finish_time;
	}
	public void setFinish_time(String finish_time) {
		this.finish_time = finish_time;
	}
	public String getError_remarks() {
		return error_remarks;
	}
	public void setError_remarks(String error_remarks) {
		this.error_remarks = error_remarks;
	}
	public String getWaybill_num() {
		return waybill_num;
	}
	public void setWaybill_num(String waybill_num) {
		this.waybill_num = waybill_num;
	}
	public String getCustom_remarks() {
		return custom_remarks;
	}
	public void setCustom_remarks(String custom_remarks) {
		this.custom_remarks = custom_remarks;
	}
	public String getCity_code() {
		return city_code;
	}
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}


	/*运单标号*/
	private String id;
	/*商家自己的订单号*/
	private String shipper_origin_id;
	/*第三方配送平台的运单编号*/
	private String third_party_waybill_id;
	/*配送员编号*/
	private String courier_id;
	/*商家编号*/
	private String shippers_id;
	/*买家编号*/
	private String buyer_id;
	/*货物类型
	 * 订单商品类型 1、餐饮 2、饮 料 3、鲜花 4、票 务 5、其他 8、印刷品 9、便利店 10、学校餐饮 11、校园便利 12、生鲜 13、水果
	 * */
	private String cargo_type;
	/*货物重量(用于计费)*/
	private String cargo_weight;
	/*订单货物价格*/
	private String cargo_price;
	/*订单货物数量*/
	private String cargo_num;
	/*订单货物名称*/
	private String cargo_name;
	/*运单提交时间*/
	private Long create_time;
	/*期望取货时间*/
	private Long expected_fetch_time;
	/*期望到达时间*/
	private Long expected_arrival_time;
	/*运单所在省*/
	private String province_name;
	/*运单所在市*/
	private String city_name;
	
	private String city_code;
	/*支付类型
	 * 0、现金  1、支付宝  2、微信 3、刷银联卡
	 * */
	private String pay_type;
	/*是否需要垫付*/
	private String is_prepay;
	/*当前订单状态
     * 运单状态： 0 运单入库待分配给配送员；1 分配给配送员；2 商家取货; 3 配送中; 5 完成配送
     *          -1 回库；-2 拒收 -3 取消
	 * 
	 * */
	private String waybill_status;
	/*当前支付状态*/
	private String payment_status;
	/*订单费用(可以理解为配送费)*/
	private String waybill_fee;
	/*需要向商家付的钱数*/
	private String pay_shipper_fee;
	/*向买家收取的钱数*/
	private String fetch_buyer_fee;
	/*配送折扣*/
	private String discount_fee;
	/*配送平台
	 * 0、快送宝 1、达达 2、闪送  3、风先生
	 * */
	private String third_platform_id;
	/*导入批次(本次API支持一次性导入多个配送地址)*/
	private String import_batch;
	/*预约取件
	 * 0、立即取件  1、预约取件
	 * */
	private String booking_fetch;
	/*预约取件时间*/
	private Long booking_fetch_time;
	
	/*订单备注/描述信息*/
	private String remarks;
	
	/*异常件备注说明(暂时不启用)*/
	private String error_remarks;
	
	/*是否到付(该字段主要应用在电商配送中 0 表示否；1表示是)*/
	private String is_topay;
	
	/*运单类型 1、电商；2、O2O运单*/
	private String waybill_type;
	
	/*结束时间*/
	private String finish_time;
	
	/*一票多单(一个订单中包含的订单数量)*/
	private String waybill_num;
	
	private String custom_remarks;
}
