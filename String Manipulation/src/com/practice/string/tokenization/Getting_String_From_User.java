package com.practice.string.tokenization;

import java.util.Scanner;
import java.util.StringTokenizer;
public class Getting_String_From_User {

	public static void main(String[] args) {
		String string;
		System.out.println("Enter the String");
		Scanner s = new Scanner(System.in);
		string=s.nextLine();
		StringTokenizer tokens = new StringTokenizer(string); 
        System.out.println("Number of Tokens:" +tokens.countTokens());
		while(tokens.hasMoreTokens())
        {
        	System.out.println(tokens.nextToken());
        }
	}

}
