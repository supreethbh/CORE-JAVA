package com.dxc.filehandling;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {

		File file = new File("c://J2ee/FileHandling/file.txt");
		
		if (file.exists() == false) {
			try {
				file.createNewFile();
				
				System.out.println("File Created....");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("File already exist....");
		}
		
	}
}
