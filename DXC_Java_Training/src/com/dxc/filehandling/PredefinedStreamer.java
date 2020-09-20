package com.dxc.filehandling;

import java.io.IOException;

public class PredefinedStreamer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		char c;
		
		System.out.println("Enter your data : ");
		
		try {
			while ((c = (char) System.in.read()) != '\n') { /* A --> 65 */     
				sb.append(c);                               /* System.in ----> InputStream class object */  
			}		
			System.out.println(c);
			
		} catch (IOException e) {
			e.printStackTrace();
		}                                       
		String data = sb.toString();
		System.out.println(data);
	}
}
