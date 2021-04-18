package com.practice.stringbuffer;

public class StringBuffer_Constructor_2 {
public static void main(String[] args)
{
	StringBuffer sb = new StringBuffer("StringBuffer");
	System.out.println(sb);
	System.out.println(sb.capacity());//default capacity = 16+length of our given data
}
}
