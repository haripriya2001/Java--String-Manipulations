package com.practice.string.tokenization;

import java.util.StringTokenizer;

public class Displaying_Each_Tokens {

	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("Displaying each tokens inside StringTokenizer Object");
		int count = s.countTokens();
		System.out.println("Number of tokens : " +count);
		while(s.hasMoreTokens())
		{
			System.out.println(s.nextToken());
		}
		

	}

}
