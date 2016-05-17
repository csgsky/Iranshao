package com.iranshao.iranshao.utils;

import android.util.Log;

/**
 * log的工具类
 * @author Administrator
 *
 */
public class LogUtil {
	public static final boolean isShowLog = true;
	/**
	 * log打印操作
	 * @param tag
	 * @param msg
	 */
	public static void i(String tag,String msg){
		if (isShowLog) {
			Log.i(tag, msg);
		}
	}
	
}
