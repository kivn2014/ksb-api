package com.ksb.openapi.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;


/**
 * 日期工具类，提供与日期相关的常用方法
 * 
 * @Class Name DateUtil
 * @Author sa
 * @Create In 2008-10-6ma
 * @Modify In 2014-12-04 
 */
public class DateUtil {

	public static String datePattern = "yyyy-MM-dd"; 
	public static String timePattern = datePattern + " HH:mm:ss";
	public static String dataPattern_zh = "E MMM dd yyyy HH:mm:ss z";
	public static String dateHourPattern = datePattern+" HH:mm";

	/**
	 * Return default datePattern (yyyy-MM-dd)
	 * 
	 * @return a string representing the date pattern on the UI
	 */
	public static String getDatePattern() {
		return datePattern;
	}

	public static String getTimePattern() {
		return timePattern;
	}

	/**
	 * This method attempts to convert an Oracle-formatted date in the form
	 * dd-MMM-yyyy to yyyy-mm-dd.
	 * 
	 * @param aDate
	 *            date from database as a string
	 * @return formatted string for the ui
	 */
	public static final String getDate(Date aDate) {
		SimpleDateFormat df = null;
		String returnValue = "";

		if (aDate != null) {
			df = new SimpleDateFormat(datePattern);
			returnValue = df.format(aDate);
		}

		return (returnValue);
	}

	public static Date getLastDayOfMonth(Date sDate1) {
		Calendar cDay1 = Calendar.getInstance();
		cDay1.setTime(sDate1);
		final int lastDay = cDay1.getActualMaximum(Calendar.DAY_OF_MONTH);
		cDay1.set(Calendar.DAY_OF_MONTH, lastDay);
		return cDay1.getTime();
	}

	public static Date getFirstDayOfMonth(Date sDate1) {
		Calendar cDay1 = Calendar.getInstance();
		cDay1.setTime(sDate1);
		final int firstDay = cDay1.getActualMinimum(Calendar.DAY_OF_MONTH);
		cDay1.set(Calendar.DAY_OF_MONTH, firstDay);
		return cDay1.getTime();
	}
	
	public static  String TimeStamp2Date(String timestampString, String formats){    
		  Long timestamp = Long.parseLong(timestampString)*1000;    
		  String date = new java.text.SimpleDateFormat(formats).format(new java.util.Date(timestamp));    
		  return date;    
		} 

	public static  String longDate2String(Long longTime){    
		  String date = new java.text.SimpleDateFormat(timePattern).format(new java.util.Date(longTime));    
		  return date;    
		} 
	public static  String longDate2String(Long longTime,String pattern){    
		  String date = new java.text.SimpleDateFormat(pattern).format(new java.util.Date(longTime));    
		  return date;    
		} 	
	
	/**
	 * This method generates a string representation of a date/time in the
	 * format you specify on input
	 * 
	 * @param aMask
	 *            the date pattern the string is in
	 * @param strDate
	 *            a string representation of a date
	 * @return a converted Date object
	 * @see java.text.SimpleDateFormat
	 * @throws ParseException
	 */
	public static final Date convertStringToDate(String aMask, String strDate)
			throws ParseException {
		SimpleDateFormat df = null;
		Date date = null;
		df = new SimpleDateFormat(aMask);

		try {
			date = df.parse(strDate);
		} catch (ParseException pe) {
			// log.error("ParseException: " + pe);
			throw new ParseException(pe.getMessage(), pe.getErrorOffset());
		}

		return (date);
	}

	/**
	 * This method returns the current date time in the format: yyyy-MM-dd HH:MM
	 * a
	 * 
	 * @param theTime
	 *            the current time
	 * @return the current date/time
	 */
	public static String getTimeNow(Date theTime) {
		return getDateTime(timePattern, theTime);
	}

	/**
	 * This method returns the current date in the format: MM/dd/yyyy
	 * 
	 * @return the current date
	 * @throws ParseException
	 */
	public static Calendar getToday() throws ParseException {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat(datePattern);

		// This seems like quite a hack (date -> string -> date),
		// but it works ;-)
		String todayAsString = df.format(today);
		Calendar cal = new GregorianCalendar();
		cal.setTime(convertStringToDate(todayAsString));

		return cal;
	}

	/**
	 * 
	 * 
	 * @return java.util.Date
	 */
	public static java.util.Date getCurrentDate() {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat(datePattern);

		String todayAsString = df.format(today);
		Calendar cal = new GregorianCalendar();
		// try {
		cal.setTime(convertStringToDate(todayAsString));
		// } catch (ParseException e) {
		// e.printStackTrace();
		// }

		return (java.util.Date) cal.getTime();
	}

	/**
	 * 
	 * @Methods Name getCurrentDateTime
	 * @return java.util.Date
	 */
	public static java.util.Date getCurrentDateTime() {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat(DateUtil.timePattern);

		String todayAsString = df.format(today);
		Calendar cal = new GregorianCalendar();
		// try {
		cal.setTime(convertStringToDate(todayAsString));
		// } catch (ParseException e) {
		// e.printStackTrace();
		// }

		return (java.util.Date) cal.getTime();
	}

	public static java.sql.Date getCurrentSQLDate() {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat(datePattern);

		String todayAsString = df.format(today);
		Calendar cal = new GregorianCalendar();
		// try {
		cal.setTime(convertStringToDate(todayAsString));
		// } catch (ParseException e) {
		// e.printStackTrace();
		// }

		return (java.sql.Date) cal.getTime();
	}

	/**
	 * This method generates a string representation of a date's date/time in
	 * the format you specify on input
	 * 
	 * @param aMask
	 *            the date pattern the string is in
	 * @param aDate
	 *            a date object
	 * @return a formatted string representation of the date
	 * 
	 * @see java.text.SimpleDateFormat
	 */
	public static final String getDateTime(String aMask, Date aDate) {
		SimpleDateFormat df = null;
		String returnValue = "";

		if (aDate == null) {
			return "";
		} else {
			df = new SimpleDateFormat(aMask);
			returnValue = df.format(aDate);
		}

		return (returnValue);
	}

	public static final Date formatDate(Date date, String pattern)
			throws Exception {
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		String dateStr = df.format(date);
		return convertStringToDate(pattern, dateStr);
	}

	/**
	 * This method generates a string representation of a date based on the
	 * System Property 'dateFormat' in the format you specify on input
	 * 
	 * @param aDate
	 *            A date to convert
	 * @return a string representation of the date
	 */
	public static final String convertDateToString(Date aDate) {
		return getDateTime(datePattern, aDate);
	}

	public static final String convertDateToString(Date aDate, String pattern) {
		return getDateTime(pattern, aDate);
	}

	/**
	 * @param aDate
	 * @return String
	 */
	public static final String convertDateTimeToString(Date aDate) {
		return getDateTime(timePattern, aDate);
	}

	/**
	 * This method converts a String to a date using the datePattern
	 * 
	 * @param strDate
	 *            the date to convert (in format yyyy-MM-dd/)
	 * @return a date object
	 * 
	 * @throws ParseException
	 */
	public static Date convertStringToDate(String strDate) {
		Date aDate = null;

		try {
			aDate = convertStringToDate(datePattern, strDate);
		} catch (ParseException pe) {
			pe.printStackTrace();
			/*
			 * throw new ParseException(pe.getMessage(), pe.getErrorOffset());
			 */

		}

		return aDate;
	}
	
	public static long convertStringToLong(String strDate){
		return convertStringToDate(strDate).getTime();
	}
	public static long convertStringToLong(String strDate,String timePattern){
		Date aDate = null;

		try {
			aDate = convertStringToDate(timePattern, strDate);
			return aDate.getTime();
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
		return 0;
	}
	
	public static Date convertStringToDateHour(String strDate) {
		Date aDate = null;

		try {
			aDate = convertStringToDate(dateHourPattern, strDate);
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
		return aDate;
	}
	
	
	public static Date convertStringToDateTime(String strDate) {
		Date aDate = null;

		try {
			aDate = convertStringToDate(timePattern, strDate);
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
		return aDate;
	}

	public static Date addDays(Date date, int days) {
		return add(date, days, Calendar.DATE);
	}

	public static Date addMonths(Date date, int months) {
		return add(date, months, Calendar.MONTH);
	}

	public static Date add(Date date, int amount, int field) {
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(date);
		calendar.add(field, amount);

		return calendar.getTime();
	}

	public static final String getDateBefore() {
		Calendar cDay1 = Calendar.getInstance();
		cDay1.add(Calendar.DATE, -1);
		SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
		sdf.format(cDay1.getTime());
		return sdf.format(cDay1.getTime());
	}
	
	public static final Date getBeforeDay() {
		Calendar cDay1 = Calendar.getInstance();
		cDay1.add(Calendar.DATE, -1);
		SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
		String day=sdf.format(cDay1.getTime());
		try {
			return convertStringToDate(datePattern,day);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 当前日期增加天数
	public static String dateAdd(int days) {

		// 日期处理模块 (将日期加上某些天或减去天数)返回字符串
		Calendar canlendar = Calendar.getInstance(); // java.util包
		canlendar.add(Calendar.DATE, days); // 日期减 如果不够减会将月变动
		String result = (new SimpleDateFormat("yyyy-MM-dd")).format(canlendar
				.getTime());
		return result + " 00:00:00";
	}

	/**
	 * 获取两个Calendar日期的时间差
	 * 
	 * @Methods Name getIntervalDateTimeByCalendar
	 * @Create In 2012-8-29 By hongliang.gao
	 * @param startday
	 * @param endday
	 * @return String
	 */
	public static String getIntervalDateTimeByCalendar(Calendar startday,
			Calendar endday) {
		if (startday.after(endday)) {
			Calendar cal = startday;
			startday = endday;
			endday = cal;
		}
		long sl = startday.getTimeInMillis();
		long el = endday.getTimeInMillis();
		long ei = el - sl;

		return dateTimeFormat(ei);
	}

	/**
	 * 获取两个Date日期的时间差
	 * 
	 * @Methods Name getIntervalDateTimeByDate
	 * @Create In 2012-8-29 By hongliang.gao
	 * @param startday
	 * @param endday
	 * @return String
	 */
	public static String getIntervalDateTimeByDate(Date startday, Date endday) {
		if (startday.after(endday)) {
			Date cal = startday;
			startday = endday;
			endday = cal;
		}
		long sl = startday.getTime();
		long el = endday.getTime();
		long ei = el - sl;

		return dateTimeFormat(ei);
	}

	/**
	 * 获取两个Date日期相差多少天
	 * 
	 * @Methods Name getDaysBetween
	 * @Create In 2012-8-29 By hongliang.gao
	 * @param d1
	 * @param d2
	 * @return int
	 */
	public static int getDaysBetween(Calendar d1, Calendar d2) {
		if (d1.after(d2)) {
			java.util.Calendar swap = d1;
			d1 = d2;
			d2 = swap;
		}
		int days = d2.get(Calendar.DAY_OF_YEAR) - d1.get(Calendar.DAY_OF_YEAR);
		int y2 = d2.get(Calendar.YEAR);
		if (d1.get(Calendar.YEAR) != y2) {
			d1 = (Calendar) d1.clone();
			do {
				days += d1.getActualMaximum(Calendar.DAY_OF_YEAR);// 得到当年的实际天数
				d1.add(Calendar.YEAR, 1);
			} while (d1.get(Calendar.YEAR) != y2);
		}
		return days;
	}

	/**
	 * 格式化milliseconds为 年天月日时分秒毫秒
	 * 
	 * @Methods Name dateTimeFormat
	 * @Create In 2012-8-29 By hongliang.gao
	 * @param milliseconds
	 * @return String
	 */
	public static String dateTimeFormat(long milliseconds) {

		String strDateTime = "";
		long ei = milliseconds;
		// 年
		long years = ei / (1000 * 60 * 60 * 24 * 365);
		// 天
		ei = ei % (1000 * 60 * 60 * 24 * 365);
		long day = ei / (1000 * 60 * 60 * 24);
		// 小时
		ei = ei % (1000 * 60 * 60 * 24);
		long hours = ei / (1000 * 60 * 60);
		// 分钟
		ei = ei % (1000 * 60 * 60);
		long minutes = (ei / (1000 * 60));
		// 秒
		ei = ei % (1000 * 60);
		long seconds = ei / (1000);

		// 毫秒
		ei = ei % (1000);

		strDateTime = years + "years" + day + "day" + hours + "hours" + minutes
				+ "minutes" + seconds + "seconds " + ei + "milliseconds";
		return strDateTime;

	}

	public static String getYear(Date aDate) {

		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(aDate);
		return "" + calendar.get(Calendar.YEAR);
	}

	public static String getMonth(Date aDate) {

		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(aDate);
		return "" + (calendar.get(Calendar.MONTH) + 1);
	}

	public static String getDay(Date aDate) {

		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(aDate);
		return "" + calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * @throws Exception
	 * @return获取上周一时间
	 */
	/*public static Date getLastMonday() {
		try {
			Date date = getByWeekAndDay(-1, Calendar.MONDAY);
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			String dateStr = df.format(date);
			dateStr = dateStr + " 00:00:00";
			return convertStringToDate(timePattern, dateStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}*/

	public static Date getDayZeroClock(Date date) {
		Date temp = null;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr = df.format(date);
		dateStr = dateStr + " 00:00:00";
		try {
			temp = convertStringToDate(timePattern, dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	// 获取上周六
	public static Date getlastSaturday() {
		try {
			Date date = getByWeekAndDay(-1, Calendar.SATURDAY);
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			String dateStr = df.format(date);
			dateStr = dateStr + " 00:00:00";
			return convertStringToDate(timePattern, dateStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 获取上周日
	public static Date getlastSunday() {
		try {
			Date date = getByWeekAndDay(-1, Calendar.SUNDAY);
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			String dateStr = df.format(date);
			dateStr = dateStr + " 00:00:00";
			return convertStringToDate(timePattern, dateStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * // 获取本周日时间 public static Date getLastSunday() { try { Date
	 * date=getByWeekAndDay(0, Calendar.SUNDAY); SimpleDateFormat df = new
	 * SimpleDateFormat("yyyy-MM-dd"); String dateStr = df.format(date);
	 * dateStr=dateStr+" 00:00:00"; return
	 * convertStringToDate(timePattern,dateStr); } catch (Exception e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } return null; }
	 */

	public static Date getThisMonday() {
		return getByWeekAndDay(0, Calendar.MONDAY);
	}

	public static Date getByWeekAndDay(int n, int day) {
		// n为推迟的周数，1本周，-1向前推迟一周，2下周，依次类推
		Calendar cal = Calendar.getInstance();
		Date thatDay;
		cal.add(Calendar.DATE, n * 7);
		// 想周几，这里就传几Calendar.MONDAY（TUESDAY...）
		cal.set(Calendar.DAY_OF_WEEK, day);
		thatDay = cal.getTime();
		return thatDay;
	}

	// 获取当前是年中的第几周
	public static int getNumWeekOfYear() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		return cal.get(Calendar.WEEK_OF_YEAR);
	}
	
	public static void main(String args[]) throws ParseException
	{
//		Date a=DateUtil.convertStringToDate("Thu Jan 24 00:00:00 CST 2013");
//		System.out.print(a);
		
//		System.out.println(getDateBetween("2011-02-20", "2011-03-02","yyyy-MM-dd",Calendar.DATE,1));
//		System.out.println(convertDateToString(add(new Date(), -3, Calendar.MONTH)));
		
		
//		System.out.println(longDate2String(new Date().getTime()));
//		System.out.println(longDate2String(new Date().getTime(),"yyyy-MM-dd"));
//		System.out.println(longDate2String(new Date().getTime(),"HH:mm"));
		
		
		//System.out.println(convertDateToString(getCurrentDate(),"yyyyMMdd"));
		
//		
//		long st = getTodayStartTime();
//		
//		long et = getTodayEndTime();
//		System.out.println(st);
//		System.out.println(et);
//		System.out.println(longDate2String(st, "yyyyMMdd HH:mm:ss"));
//		System.out.println(longDate2String(1442236297000L, "yyyyMMdd HH:mm:ss"));
		
		System.out.println(new Date().getTime());
		
//		System.out.println(getStartTime("2015-09-21"));
//		System.out.println(getEndTime("2015-09-12"));
		
//		   long currentTime = new Date().getTime();
//		   long wt = DateUtil.convertStringToLong("2015-07-23 12:24:19",DateUtil.timePattern);
//		   System.out.println(currentTime+"==="+wt);
//		   System.out.println(currentTime-wt);
//		   double c = currentTime-wt;
//		   java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.0");
//		   String waitTime = df.format(c/1000/60);
//		   System.out.println(waitTime);
		
		
		//getBeforeDay();
		//System.out.println(longDate2String(1438826352000L));
		
//		System.out.println(convertStringToDateTime("2015-08-06 09:59:12").getTime());
		//System.out.println(Integer.MAX_VALUE);
	}
	
	public static Date getBeforeOrAfterByGiven(Date baseDate, String type , int beforeOrAfterNum, int dayOf){
		Date dateReturn = new Date();
		
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(baseDate);
		
		if("year".equalsIgnoreCase(type)){
			calendar.add(Calendar.YEAR, beforeOrAfterNum);
			calendar.set(Calendar.DAY_OF_YEAR, dayOf);
			dateReturn = calendar.getTime();
		}else if("month".equalsIgnoreCase(type)){
			calendar.add(Calendar.MONTH, beforeOrAfterNum);
			calendar.set(Calendar.DAY_OF_MONTH, dayOf);
			dateReturn = calendar.getTime();
		}else if("week".equalsIgnoreCase(type)){
			calendar.add(Calendar.WEEK_OF_YEAR, beforeOrAfterNum);
			calendar.set(Calendar.DAY_OF_WEEK, dayOf);
			dateReturn = calendar.getTime();
		}else if("day".equalsIgnoreCase(type)){
			 calendar.add(Calendar.DATE,  beforeOrAfterNum);
			 dateReturn = calendar.getTime();
		}else{
			dateReturn =  null;
		}
		
		return dateReturn;
	}

	public static Date stringToDate(String s){
		if(s==null || "".equals(s.trim()))
			return null;
		else
			return convertStringToDate(s);
	}
	
	public static List<String> getDateDayBetween(String start, String end){
		Date startdate = DateUtil.convertStringToDate(start);
		Date enddate = DateUtil.convertStringToDate(end);
		List<String> days = new ArrayList<String>(); 
		if(startdate==null || enddate==null){
			return days;
		}
		enddate = DateUtil.getBeforeOrAfterByGiven(enddate, "day", 1, 0);
		while(startdate.before(enddate)){
			days.add(DateUtil.getDate(startdate));
			startdate = DateUtil.getBeforeOrAfterByGiven(startdate, "day", 1, 0);
		}
		return days;
	}
	
	public static List<String> getDateMonBetween(String start, String end){
		Date startdate = null;
		Date enddate  = null;
		try {
			startdate = DateUtil.convertStringToDate("yyyy-MM",start);
			enddate = DateUtil.convertStringToDate("yyyy-MM",end);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> days = new ArrayList<String>(); 
		if(startdate==null || enddate==null){
			return days;
		}
		enddate = DateUtil.getBeforeOrAfterByGiven(enddate, "month", 1, 0);
		System.out.println("结束时间: "+convertDateTimeToString(enddate));
		System.out.println("开始时间1: "+convertDateTimeToString(startdate));
		while(startdate.before(enddate)){
			days.add(DateUtil.getMonth(startdate));
			startdate = DateUtil.getBeforeOrAfterByGiven(startdate, "month", 1, 0);
			System.out.println("开始时间2: "+convertDateTimeToString(startdate));
		}
		return days;
	}
	
	public static int checkDateFormatAndValite(String strDateTime,String dateFormat) {
		
		if(strDateTime==null||strDateTime.equals("")){
			return -1;
		}
		if (dateFormat==null||dateFormat.equals("")) {
			dateFormat = datePattern;
		}
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			Date ndate = format.parse(strDateTime);
			String str = format.format(ndate);
			// success
			if (str.equals(strDateTime))
				return 1;
			// datetime is not validate
			else
				return 0;
		} catch (Exception e) {
			// format error
			return -1;
		}
	}
	
	public static long getTodayStartTime(){
		String currentDate = convertDateToString(getCurrentDate(),"yyyyMMdd");
		
		return convertStringToLong(currentDate+" 00:00:00", "yyyyMMdd HH:mm:ss");
	}

	public static long getYestodayStartTime(){
		String yestodayDate = convertDateToString(getBeforeDay(),"yyyyMMdd");
		
		return convertStringToLong(yestodayDate+" 00:00:00", "yyyyMMdd HH:mm:ss");
	}	
	
	
	public static long getStartTime(String dayStr){
		
		return convertStringToLong(dayStr+" 00:00:00", "yyyy-MM-dd HH:mm:ss");
	}
	
	public static long getEndTime(String dayStr){
		return convertStringToLong(dayStr+" 23:59:59", "yyyy-MM-dd HH:mm:ss");
	}
	
	public static long getTodayEndTime(){
		String currentDate = convertDateToString(getCurrentDate(),"yyyyMMdd");
		
		return convertStringToLong(currentDate+" 23:59:59", "yyyyMMdd HH:mm:ss");
	}
	
	public static long getYesTodayEndTime(){
		String yestodayDate = convertDateToString(getBeforeDay(),"yyyyMMdd");
		
		return convertStringToLong(yestodayDate+" 23:59:59", "yyyyMMdd HH:mm:ss");
	}	
	public static List<String> getDateBetween(String beginDate, String endDate,String dateFormat,int DateType,int step) throws ParseException{
        List<String> dateList = new ArrayList<String>();  
        Calendar cal = Calendar.getInstance();  
        
        Date start = DateUtil.convertStringToDate(dateFormat,beginDate);  
        Date end = DateUtil.convertStringToDate(dateFormat,endDate);
        cal.setTime(start);  
        while (cal.getTime().before(end)||cal.getTime().equals(end)) {  
            dateList.add(DateUtil.convertDateToString(cal.getTime(),dateFormat));
            cal.add(DateType, step);
        }  
        return dateList;  
	}
	
}
