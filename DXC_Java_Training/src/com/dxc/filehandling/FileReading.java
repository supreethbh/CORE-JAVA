package com.dxc.filehandling;

import java.io.File;
import java.io.FileReader;

public class FileReading {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		File file = new File("input.txt");
		
		try {
			FileReader reader = new FileReader(file);
			
			int length = (int) file.length();
			char[] ch = new char[length];
			reader.read(ch);
			System.out.println(ch);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
