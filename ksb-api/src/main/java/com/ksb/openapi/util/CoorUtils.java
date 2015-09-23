package com.ksb.openapi.util;

import java.text.DecimalFormat;

public class CoorUtils {

	/**
	 * 计算两点间距离
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return 返回值单位为米
	 */
	public static double distance(double x1, double y1, double x2, double y2) {
		
		if(!validateCoors(x1, y1)){
			return 0;
		}
		
		if(!validateCoors(x2, y2)){
			return 0;
		}
		
		double latRadians1 = y1 * (Math.PI / 180);
		double latRadians2 = y2 * (Math.PI / 180);
		double latRadians = latRadians1 - latRadians2;
		double lngRadians = x1 * (Math.PI / 180) - x2 * (Math.PI / 180);
		double f = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(latRadians / 2), 2) + Math.cos(latRadians1)
				* Math.cos(latRadians2) * Math.pow(Math.sin(lngRadians / 2), 2)));
		return f * 6378137;
	}
	
	private static boolean validateCoors(double x,double y){
		
		/*经度范围：73°33′E至135°05′E*/
		if(73.33<=x && x<=135.06){
			/*纬度范围：3°51′N至53°33′N*/
			if(3.51<=y && y<=53.33){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 根据距离计算配送费
	 * @param distance
	 * @return
	 */
	public static double getAmountByDistance(double waybillDistance){
	
		/*3公里之内 3元；没超过一公里加1元 不足1公里按一公里算*/
		int baseDistance = 3;
		
		/*超过3公里以后,基数里程数*/
		double increasingDistance = 1;
		
		/*超过公里以后,每个increasingDistance单位,需要增加的费用*/
		double increasingFee = 1;
		
		double diff = waybillDistance - baseDistance;
		
		/*3公里范围内*/
		if(diff <= 0){
			return 3.0;
		}
		
		DecimalFormat df = new DecimalFormat("######0.00");
		
		/*计算商家到实际买家之间的直线距离*/
		String dis = df.format(diff/increasingDistance);
		
		/*额外的计费单元*/
		double extraDistance = Math.ceil(Double.parseDouble(dis));
		
		return 3 + (extraDistance*increasingFee);
		
	}
	
	
	
	public static void main(String[] args) {
		
		double a = 6.1;
		
		System.out.println(getAmountByDistance(a));
		
		
	}
}
