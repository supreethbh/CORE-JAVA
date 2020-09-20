package com.dxc.strings;

public class StringBufferClass {

	public static void main(String[] args) {
		
		StringBuffer strbuf = new StringBuffer(new String("Nava Bharatha"));
		System.out.println(strbuf.reverse());
		
		StringBuffer sb =new StringBuffer();
		System.out.println(sb.capacity()); //16
		
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity()); //16
		System.out.println(sb.length());
		
		sb.append("q");
		System.out.println(sb.capacity()); //34
	}
}
