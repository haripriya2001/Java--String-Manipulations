package com.practice.string.tokenization;

import java.util.StringTokenizer;

public class Creating_StringTokenizer_Object {

	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("The process of a dividing a string into number of peices or tokens is called as String Tokenizer");
		int count = s.countTokens();
		System.out.println(count);
	}

}
