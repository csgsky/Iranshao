package com.iranshao.iranshao.utils;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

public class MeasureUtil {
	public static int[] getScreenSize(Context context) {
		WindowManager wm = (WindowManager) context
				.getSystemService(Context.WINDOW_SERVICE);
		int measure[] = new int[2];
		Display display = wm.getDefaultDisplay();
		int height = display.getHeight();
		int width = display.getWidth();
		measure[0] = height;
		measure[1] = width;
		return measure;
	}

}
