package com.practice.stringmethods;

public class CompareTo {

	public static void main(String[] args) {

      String str1 = new String("abc");
      String str2= new String("def");
      String str3= new String("abc");
      System.out.println(str1.compareTo(str2));//-3
      System.out.println(str2.compareTo(str3));//+3
      System.out.println(str3.compareTo(str1));//0

	}

}
