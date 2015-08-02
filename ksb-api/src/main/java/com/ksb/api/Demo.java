package com.ksb.api;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.ksb.openapi.util.HTTPUtils;


public class Demo {

	public static void main(String[] args) {
		
		/*闪送根据距离计费*/
//		ssPay();
		
		/*预提交订单*/
		//ssPrecommit();
		
		//commitSS();
		//System.out.println(new Date().getTime());
		
//		List<String> p = new ArrayList<String>();
//		p.add("1");
//		p.add("2");
//		
//		int index = new Random().nextInt(p.size()-1);
//		System.out.println(index+"==="+p.get(index));
		
		for(;;){
			System.out.println(new Random().nextInt(2));
			
		}
		
	}
	
	
	public static void commitSS(){
		
		
		Map<String, String> pm = new HashMap<String, String>();
		
		pm.put("orderNumber", "TDH1010000187446");
		pm.put("city_code", "010");
		pm.put("bindUser", "13241887706");
		pm.put("token", "OGVLTm1rV0lvd0hpSHEwc0s4R3kyY1c4MTQzMjY5NDUzMjEyNzY=");
		pm.put("total", "2900.00");
		pm.put("balance", "100400");
		pm.put("mustPay", "2900");
		
		String url = "http://www.bingex.com/web/order/submit";
		
		try {
			System.out.println(HTTPUtils.executePost(url, pm).getObj().toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void ssPrecommit(){
		
		Map<String, String> pm = new HashMap<String, String>();
		
		
		String deliver_list = null;
		try {
			deliver_list = "[{name: \""+URLEncoder.encode("测试", "utf-8")+"\", mobile: \""+URLEncoder.encode("13483048990", "utf-8")+"\", longitude: 116.312478, latitude: 39.912543788429, address: \""+URLEncoder.encode("北京市海淀区中关村图书大厦", "utf-8") + "\"}]";
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pm.put("fromProvince", "北京市");
		pm.put("fromCity", "北京市");
		pm.put("fromName", "买菜帮手");

		
		pm.put("fromMobile", "13466588577");
		pm.put("fromAddress", "北京市海淀区苏州街大恒科技大厦南座18层");
		pm.put("fromAddressTail", "0");
		
		pm.put("fromLongitude", "116.31198944614");
		pm.put("fromLatitude", "39.988517521803");
		
		pm.put("toAddressObjectList", deliver_list);
		
		pm.put("distance", "2");
		pm.put("appointType", "1");
		pm.put("weight", "1");
		
		pm.put("goodsName", "cai");
		pm.put("demo", "demo");
		
		
//		String url = "http://www.ishansong.com/web/order/precommit";
		String url = "http://www.bingex.com/web/order/precommit";
		
		
		try {
			System.out.println(HTTPUtils.executePost(url, pm).getObj().toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void ssPay(){
		
		//银科大厦 116.31291486161;39.987911010404
		
		//大恒科技大厦 116.31198944614;39.988517521803
		
		
		Map<String, String> pm = new HashMap<String, String>();
		
		pm.put("fromCity", "北京市");
		pm.put("fromLatitude", "39.987911010404");
		pm.put("fromLongitude", "116.31291486161");
		pm.put("toAddressObjectList", "[{longitude: 116.31198944614, latitude: 39.988517521803}]");
		pm.put("appointType", "1");
		pm.put("weight", "1");
		
		String pay_url = "http://www.ishansong.com/web/order/dynamicfee";
		
//		String pay_url = "http://www.bingex.com/web/order/dynamicfee";
		
		try {
			System.out.println(HTTPUtils.executePost(pay_url, pm).getObj().toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	 
}
