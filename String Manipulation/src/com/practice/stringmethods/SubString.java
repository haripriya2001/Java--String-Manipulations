package com.practice.stringmethods;

public class SubString {

	public static void main(String[] args) {
		String str = new String("It will return a substring from a string starts from tha specified start index and upto the end of string");
		System.out.println(str);
		System.out.println(str.substring(9));// only start index
		System.out.println(str.substring(3,10));//both start and end index
		
		

	}

}
