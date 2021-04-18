package com.practice.stringmethods;

public class ToCharArray {

	public static void main(String[] args) {
		String str = new String("It can be used to change String to char Array");
		char[] c=str.toCharArray();
		for(char ch: c)
		{
			System.out.print(ch+" ");
		}
	}

}
