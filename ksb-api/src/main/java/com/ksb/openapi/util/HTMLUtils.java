package com.ksb.openapi.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLUtils {

	private static Map<String, String> statusCodeMap = null;
	
	static{
		statusCodeMap = new HashMap<String, String>();
		statusCodeMap.put("下单时间", "create_time");
		statusCodeMap.put("预约时间", "appointment_time");
		statusCodeMap.put("下单账号", "order_owner");
		statusCodeMap.put("取件时间", "fetch_time");
		statusCodeMap.put("收件时间", "arriver_time");	
		statusCodeMap.put("取件密码", "fetch_code");
	}
	
	
	public static void main(String[] args) {
		

		getTableInfo();
		
	}
	
	
	public static void getTableInfo(){
		
		String htmlFile = "/Users/houshipeng/today_page.html";
		
		Document doc = null;
		try {
			doc = Jsoup.parse(new File(htmlFile),"UTF-8");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements tbodyElemnts = doc.getElementsByTag("tbody");
		Elements trElements = tbodyElemnts.get(0).getElementsByTag("tr");

		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
		for (Element trElment : trElements) {
			Elements tdElements = trElment.getElementsByTag("td");
			
			int i = 1;
			Map<String, String> orderMap = new HashMap<String, String>();
			for(Element tdElement : tdElements){
				getOrderInfo(i, tdElement,orderMap);
				i++;
			}
			list.add(orderMap);
		}
		
		System.out.println(list);
	}
	
	
	public static void getFormInfo(){
		String htmlFile = "/Users/houshipeng/after_submit.html";
		
		
		Document doc = null;
		try {
			doc = Jsoup.parse(new File(htmlFile),"UTF-8");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Element content = doc.getElementById("confirm_order_form");
		Elements links = content.getElementsByTag("input");
		for (Element link : links) {
			  String linkHref = link.attr("id");
			  String linkText = link.val();
			  System.out.println(linkHref+"===="+linkText);
		}
	}
	
	
	public static Map<String, String> converFormParam2Map(String htmlDoc){
		
		Map<String, String> map = new HashMap<String, String>();
		Document doc = null;
		try {
			doc = Jsoup.parse(htmlDoc,"UTF-8");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return map;
		}
		Element content = doc.getElementById("confirm_order_form");
		Elements inputsElements = content.getElementsByTag("input");
		
		for (Element elment : inputsElements) {
			  System.out.println(elment.attr("id")+"-----"+elment.val());
			  map.put(elment.attr("id"), elment.val());
		}
		return map;
	}
	
	public static void getOrderInfo(int flag,Element tableInfo,Map<String, String> orderMap){
		
		switch (flag) {
		case 1:
			/*提取订单基本信息(订单编号、订单相关事件)*/
			
			String[] tdInfo = tableInfo.html().split("<br />");
			for(String info : tdInfo){
				String ks[] = info.trim().split("：");
				if(ks.length==1){
					orderMap.put("id", info);
				}else{
					/*汉字字段转换*/
					orderMap.put(converStatusCode(ks[0]), ks[1]);
				}
			}
			break;
		case 2:
			/*收货、发货地址*/
			
			break;
		case 3:	
		    /*费用信息*/
			
			break;
		case 4:
			/*配送人员信息*/
			try {
				String psInfo = tableInfo.text().split(" ")[0];
				if (psInfo.contains("(")) {
					
					String infos[] = psInfo.split("\\(");
					
                   orderMap.put("ps", infos[0]);
                   orderMap.put("ps_phone", infos[1].substring(0, infos[1].length()-1));
				}
			} catch (Exception e) {}
			break;
		case 5:
			/*取件密码*/
			String[] fetchCodeInfo = tableInfo.text().trim().split("：");
			
			orderMap.put(converStatusCode(fetchCodeInfo[0]), fetchCodeInfo[1].trim());
			break;
		case 6:
			/*状态*/
			orderMap.put("status", tableInfo.text().trim());
			break;
		default:
			break;
		}
		
	}
	
	public static String converStatusCode(String statusCode){
		
		return statusCodeMap.get(statusCode);
		
	}
	
	
}
