package com.ksb.openapi.mobile.service;

import com.pingplusplus.model.Charge;

public interface ChargeService {

	/**
	 * 商家充值
	 * @param channelName 付费渠道
	 *        (alipay:支付宝APP支付 ; alipay_qr:支付宝扫码支付 ; wx:微信支付 ; wx_pub:微信公众号支付 ; wx_pub_qr:微信公众号扫码 ; bfb:百度钱包支付)
	 * @param amount      充值金额
	 * @param spId        商家编号
	 */
	public Charge shipperRecharge(String channelName,String amount,String spId);
	
	
}
