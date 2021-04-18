package com.practice.stringmethods;

public class GetBytes {

	public static void main(String[] args) {
		String str = new String("Converting String to byte Array");
		byte[] b = str.getBytes();
		for(byte x:b)
		{
			System.out.println(x+"---------->"+(char)x);
		}

	}

}
