package com.iranshao.iranshao.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.ComponentName;
import android.content.Context;

import java.util.List;


public class ServiceStateUtils {

	public static boolean isRunning(Context context,
			String className) {
		ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
		// 得到正在正在运行的服务
		// maxNum 最多得到前面这么多个服务
		List<RunningServiceInfo> runningServices = am.getRunningServices(100);
		for (RunningServiceInfo runningServiceInfo : runningServices) {
			ComponentName service = runningServiceInfo.service;
			String serviceName = service.getClassName();
			
			System.out.println("正在的服务======="+serviceName);
			if(className.equals(serviceName)){
				// 表示服务正在运行
				return true;
			}
		}
		
		return false;
	}

}
