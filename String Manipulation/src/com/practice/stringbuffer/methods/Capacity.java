package com.practice.stringbuffer.methods;

public class Capacity {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		StringBuffer sb2= new StringBuffer("StringBuffer");
		System.out.println(sb2.capacity());
		StringBuffer sb3 = new StringBuffer(10);
		System.out.println(sb3.capacity());
		

	}

}
