package com.ksb.openapi.util;

import java.util.regex.Pattern;

public class ToolsUtil {
	
	/**
	 * 判断字符串是否为纯数字
	 * @param str
	 * @return
	 */
	public static boolean isInt(String str){
		String p = "^\\d+$";
		return Pattern.compile(p).matcher(str).find();
	}
	
	public static boolean isFloat(String str){
		String p =  "^\\d+(\\.\\d+)?$";
		return Pattern.compile(p).matcher(str).find();
	}
	
	public static void main(String[] args) {
		
		//System.out.println(isFloat("10.p"));
		
	}
	
	
	
}
