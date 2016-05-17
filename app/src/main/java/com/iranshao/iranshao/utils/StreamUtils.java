package com.iranshao.iranshao.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtils {

	public static String steam2str(InputStream is) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			int len = 0;
			byte[] buffer= new byte[1024];
			while((len = is.read(buffer)) != -1){
				baos.write(buffer, 0, len);
			}
			
			String result  = baos.toString();
			baos.close();
			return result;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

}
