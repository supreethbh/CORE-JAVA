package com.dxc.strings;

public class StringDemonstration {

	public static void main(String[] args) {
		
		String str1 = "Nava Bharatha";
		
		String str2 = new String("New India");
		
		String str3 = "Nava Bharatha";
		
		String str4 = new String("New IndiA");
		
		System.out.println("Concatination : " + str1.concat(str2));
		System.out.println("Find character: " + str1.charAt(5));
		System.out.println("Find Index : " + str2.indexOf("i"));
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		System.out.println(str2.equals(str4));
		
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str2.equalsIgnoreCase(str4));
		
		/* ASCII value comparision : str1 - str2 */
		int compareTo = str1.compareTo(str2); 
		System.out.println(compareTo);
	}
}
