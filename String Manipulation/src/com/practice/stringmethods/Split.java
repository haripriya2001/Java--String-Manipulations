package com.practice.stringmethods;

public class Split {

	public static void main(String[] args) {
		String s = new String("It will split a string into no of tokens in the form of String[]");
		String[] str=s.split(" ");
		for(String str1: str)
		{
			System.out.println(str1);
		}
				

	}

}
