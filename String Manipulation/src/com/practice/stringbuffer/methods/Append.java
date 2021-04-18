package com.practice.stringbuffer.methods;

public class Append {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("String");
		StringBuffer sb2= sb.append("Buffer");
		StringBuffer sb3 = sb2.append("Class");
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println(sb3);

	}

}
