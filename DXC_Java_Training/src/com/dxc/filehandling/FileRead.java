package com.dxc.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		try {
			
			//FileInputStream fileReader = new FileInputStream("input.txt");	
			//FileOutputStream writer  = new FileOutputStream("output.txt");
			
			FileReader fileReader = new FileReader("input.txt");  //reading from file
			
			FileWriter  writer = new FileWriter("output.txt");
			
			int n =0;
			
			while ((n = fileReader.read()) != -1) { /* IN Java EOF return -1 */
				
				writer.write(n);
				
				writer.flush();
				
				System.out.print((char) n);        /* Printing on console */	
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
