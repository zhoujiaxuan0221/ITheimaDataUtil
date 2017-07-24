package com.itheima.util;

import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 * @author Administrator
 *
 */
public class DateUtil {
	
	/**
	 * 返回当前日期的年份 
	 * @return
	 */
	public static int getYear(){
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(new Date());
		return cal.get(Calendar.YEAR);		
	}

}
