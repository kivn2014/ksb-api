package com.ksb.openapi.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.ksb.openapi.entity.ResultEntity;


public class HTTPUtils {

	public static void main(String[] args) {
		
		//String url = "http://api.map.baidu.com/place/v2/suggestion?query=abc&region=131&output=json&ak=zNC2uIzYGKnY3V8D7iCBbLsi";
		//System.out.println(executeGet(url));
		
//		String url = "http://www.ishansong.com/user/doLogin?service=&username=13601091216&password=wecook789";
		
//		Systeßm.out.println(executePost(url,new HashMap<String, String>()));
		
		try{
			
			Map<String, String> pm = new HashMap<String, String>();
			
			pm.put("fromCity", "北京市");
			pm.put("fromLatitude", "39.912543788429");
			pm.put("fromLongitude", "116.46997019438");
			pm.put("toAddressObjectList", "[{longitude: 116.312478, latitude: 39.985722}]");
			pm.put("appointType", "1");
			pm.put("weight", "1");
			
			//String url = "http://www.bingex.com/web/order/dynamicfee";
			String url = "http://localhost:9090/openapi/batch_add_waybill";
			executePost(url, pm);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	/*===========================httpclient 4.2.5 部分=======================================*/
	
	public static ResultEntity executeGet(String url) throws Exception{
		
		DefaultHttpClient client = new DefaultHttpClient(new PoolingClientConnectionManager());
	    HttpGet get = new HttpGet(url);
	    HttpResponse response = client.execute(get);
	    
	    int httpCode = response.getStatusLine().getStatusCode();
        String httpRs = EntityUtils.toString(response.getEntity());
		
        return new ResultEntity(true,String.valueOf(httpCode),httpRs);
	}
	
	
	/**
	 * HttpClient 执行Post请求(post参数会经过 urlEncode和utf-8编码)
	 * @param url
	 * @param pm
	 * @return
	 * @throws Exception
	 */
	public static ResultEntity executePost(String url,Map<String, String> pm) throws Exception{
		
		DefaultHttpClient client = new DefaultHttpClient(new PoolingClientConnectionManager());
        
        HttpPost post = new HttpPost(url);

		HttpEntity paramEntity = new UrlEncodedFormEntity(converMap2PairList(pm),"UTF-8");
        post.setEntity(paramEntity);
        HttpResponse response = client.execute(post);
		
        int httpCode = response.getStatusLine().getStatusCode();
        String httpRs = EntityUtils.toString(response.getEntity());
        return new ResultEntity(true,String.valueOf(httpCode),httpRs);
        
	}
	
	/**
	 * Map<String,String> 转换为HttpClient Post识别的nameValuePair对象
	 * 
	 * @param pm
	 * @return
	 */
	public static List<NameValuePair> converMap2PairList(Map<String, String> pm){
		
		List<NameValuePair> paramList = new ArrayList<NameValuePair>();
		
		if(pm==null||pm.size()==0){
			return paramList;
		}
		
		Iterator<Entry<String, String>> it = pm.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, String> entry = it.next();
			paramList.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
		}
		return paramList;
	}
	
	
/*===================================httpclient 3.1 部分====================================================*/	
//	public static void createDaDaOrder(String thrdOrderId) {
//
//		
////		token===>ce03975d2398e356ce03975d2398e356
////				timestamps===>1431500302130
////				sn===>244ced78032c928777418151dbc9c7ac
//		
//		Map<String, String> pm = new HashMap<String, String>();
//		pm.put("token", "ce03975d2398e356ce03975d2398e356");
//		pm.put("timestamp", "1431500302130");
//		pm.put("signature", "244ced78032c928777418151dbc9c7ac");
//		pm.put("origin_id", thrdOrderId);
//		pm.put("city_name", "北京");
//		pm.put("city_code", "010");
//		pm.put("pay_for_supplier_fee", "0");
//		pm.put("fetch_from_receiver_fee", "0");
//		pm.put("deliver_fee", "0");
//		pm.put("create_time", "1431334370856");
//		pm.put("info", "wu");
//
//		pm.put("cargo_type", "1");
//		pm.put("cargo_weight", "1");
//		pm.put("cargo_price", "0");
//		pm.put("cargo_num", "0");
//		pm.put("is_prepay", "1");
//		pm.put("expected_fetch_time", "0");
//		pm.put("expected_finish_time", "0");
//
//		pm.put("supplier_id", "1");
//		pm.put("supplier_name", "月月美食");
//		pm.put("supplier_address", "哈喽哈哈哈哈哈哈哈哈");
//		pm.put("supplier_phone", "12222222222");
//		pm.put("supplier_lat", "0");
//		pm.put("supplier_lng", "0");
//		pm.put("invoice_title", "");
//
//		pm.put("receiver_name", "测试数据");
//		pm.put("receiver_address", "月月美食月月美食");
//		pm.put("receiver_phone", "122222222222");
//		pm.put("receiver_tel", "998888");
//		pm.put("receiver_lat", "0");
//		pm.put("receiver_lng", "0");
//		pm.put("callback", "http://123.57.217.101:8080/demo/ds");
//
//		// order 19437242
//
//
//		String apiUrl = "http://public.ga.dev.imdada.cn/v1_0/addOrder/";
////		 String apiUrl = "http://localhost:9090/demo/ds";
//
//		executePost(apiUrl,pm);
//	}
//
//	
//	/**
//	 * 把Map中得Post参数数据转化为htppclient可识别的NameValuePair对象
//	 * @param pm
//	 * @return
//	 */
//	public static NameValuePair[] converMap2NVPair(Map<String, String> pm) {
//
//		Iterator<Entry<String, String>> it = pm.entrySet().iterator();
//
//		List<NameValuePair> list = new ArrayList<NameValuePair>();
//
//		while (it.hasNext()) {
//			Entry<String, String> entry = it.next();
//			String k = entry.getKey();
//			String v = entry.getValue();
//
//			list.add(new NameValuePair(k, v));
//		}
//
//		return (NameValuePair[]) list.toArray(new NameValuePair[list.size()]);
//	}
//
//
//	/**
//	 * 执行Post请求
//	 * @param url 请求地址
//	 * @param data 请求参数部分
//	 * @return
//	 */
//	public static String executePost(String url, Map<String, String> paramMap) {
//
//		/*要返回的response信息*/
//		String response = ""; 
//
//		  // 创建一个本地上下文信息
////        HttpContext localContext = new BasicHttpContext();
////        // 在本地上下问中绑定一个本地存储
////        localContext.setAttribute(ClientContext.COOKIE_STORE, cs);
//		PostMethod postMethod = null;
//		
//		try {
//			HttpClient httpClient = new HttpClient();
//			postMethod = new PostMethod(url);
//
//			/* 将map对象转化为namevaluepair对象 */
//			NameValuePair[] postParams = converMap2NVPair(paramMap);
//
//			/* 设置post请求的参数为UTF-8编码 */
//			postMethod.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "utf-8");
//
//			/* 将表单的值放入postMethod中 */
//			postMethod.setRequestBody(postParams);
//
//			int statusCode = 0;
//			try {
//
//				/* 执行postMethod */
//				statusCode = httpClient.executeMethod(postMethod);
//			} catch (Exception e) {
//				System.out.println("Post请求[" + url + "] 出现异常: "+ e.getMessage());
//				return "";
//			}
//
//			System.out.println("status code======>>>>"+statusCode);
//			
//			/* 获取请求结果 */
//			response = handleHttpResponse(statusCode, postMethod, paramMap);
//		} finally {
//			if (postMethod != null) {
//				postMethod.releaseConnection();
//			}
//		}
//		return response;
//	}
//
//	/**
//	 * 执行GET请求
//	 * @param url 请求URL
//	 * @return
//	 */
//	public static String executeGet(String url) {
//
//		String content = null;
//		int responseCode = 0;
//		GetMethod getMethod = null;
//		try {
//			/* 定义HttpClient */
//			HttpClient client = new HttpClient();
//
//			/* 实例化HTTP方法 */
//			getMethod = new GetMethod(url);
//
//			try {
//				responseCode = client.executeMethod(getMethod);
//			} catch (Exception e) {
//				System.out.println("get请求[" + url + "] 出现异常: " + e.getMessage());
//				return "";
//			}
//
//			content = handleHttpResponse(responseCode, getMethod, null);
//
//		} finally {
//			if(getMethod!=null){
//				getMethod.releaseConnection();
//			}
//		}
//
//		return content;
//	}
//
//	
//	/**
//	 * 封装处理 POST或GET 请求的结果数据
//	 * @param responseCode http请求结果码
//	 * @param httpMethod   http请求对象接口
//	 * @param data         post请求专用，post请求参数数据
//	 * @return
//	 */
//	public static String handleHttpResponse(int responseCode,
//			HttpMethod httpMethod, Map<String, String> data) {
//
//		String responseStr = null;
//		// HttpClient对于要求接受后继服务的请求，POST和GET等不能自动处理转发
//		// 301或者302
//		if (responseCode == HttpStatus.SC_MOVED_PERMANENTLY
//				|| responseCode == HttpStatus.SC_MOVED_TEMPORARILY) {
//			
//			// 从头中取出转向的地址
//			Header locationHeader = httpMethod.getResponseHeader("location");
//			String location = null;
//			if (locationHeader != null) {
//				location = locationHeader.getValue();
//				System.out.println("The page was redirected to:" + location);
//
//				if (httpMethod.getName().equals("POST")) {
//					responseStr = executePost(location, data);// 用跳转后的页面重新请求。
//				} else if (httpMethod.getName().equals("GET")) {
//					responseStr = executeGet(location);// 用跳转后的页面重新请求。
//				}
//
//			} else {
//				System.err.println("Location field value is null.");
//			}
//		} else if(responseCode == HttpStatus.SC_OK){
//			
//           /*接口请求正常返回(http请求结果值 200)*/
//			try {
//				responseStr = httpMethod.getResponseBodyAsString();
//			} catch (IOException e) {
//				System.out.println("获取接口返回的数据异常: "+e.getMessage());
//			}
//
//		}else if(responseCode == HttpStatus.SC_METHOD_NOT_ALLOWED){
////			if (httpMethod.getName().equals("POST")) {
////				/*不支持post，使用get模拟请求一下*/
////				responseStr = executeGet(location);// 用跳转后的页面重新请求
////			} else if (httpMethod.getName().equals("GET")) {
////				//responseStr = executeGet(location);// 用跳转后的页面重新请求。
////				responseStr = executePost(location, data);// 用跳转后的页面重新请求。
////			}
//		}else{
//			/*http接口请求异常*/
//			try {
//				responseStr = httpMethod.getResponseBodyAsString();
//			} catch (Exception e) {
//				System.out.println("获取接口返回的数据异常: "+e.getMessage());
//			}
//		}
//
//		return responseStr;
//	}

}
