package com.practice.stringmethods;

public class Contains {

	public static void main(String[] args) {
		String str = new String("Contains is a Method inside String Class");
		System.out.println(str.contains("is"));
		System.out.println(str.contains("s"));
		System.out.println(str.contains("a"));
		
		System.out.println(str.contains("Method"));
		System.out.println(str.contains("method"));
		System.out.println(str.contains("Start"));
		
		
	}

}
