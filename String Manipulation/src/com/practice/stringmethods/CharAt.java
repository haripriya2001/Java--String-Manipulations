package com.practice.stringmethods;

public class CharAt {

	public static void main(String[] args) {
		String str = new String("CharAt is method inside string class");
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(10));
		System.out.println(str.charAt(8));
		//System.out.println(str.charAt(-1)); StringIndexOutOfBoundsException
		
	}

}
