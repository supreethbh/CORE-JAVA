package com.dxc.filehandling;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		File file = new File("c://J2ee/FileHandling");
		
		if (file.exists() == false) {
			file.mkdir();
			System.out.println("Folder Created....");
		} else {
			System.out.println("Folder already exist....");
		}
	}
}
