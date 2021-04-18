package com.practice.stringbuffer.methods;

public class EnsureCapacity {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.ensureCapacity(10);
		System.out.println(sb.capacity());//10
		StringBuffer sb2 = new StringBuffer();
		sb2.ensureCapacity(15);
		System.out.println(sb2.capacity());//15
		StringBuffer sb3 = new StringBuffer();
		sb3.ensureCapacity(17);
		System.out.println(sb3.capacity());//34
		StringBuffer sb4 = new StringBuffer();
		sb4.ensureCapacity(33);
		System.out.println(sb4.capacity());//34
		StringBuffer sb5 = new StringBuffer();
		sb5.ensureCapacity(35);
		System.out.println(sb5.capacity());//35
		StringBuffer sb6 = new StringBuffer();
		sb6.ensureCapacity(100);
		System.out.println(sb6.capacity());//100
		

	}

}
