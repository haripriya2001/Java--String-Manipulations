package com.practice.stringbuffer.methods;

public class Delete {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("String Buffer");
		System.out.println(sb.delete(0,7));//Buffer only stored in sb object
		System.out.println(sb.delete(0,4));

	}

}
