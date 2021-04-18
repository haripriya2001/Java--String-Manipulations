package com.practice.stringmethods;

class B{
	
}
public class Equals {

	public static void main(String[] args) {
     B a= new B();
     B b= new B();
     System.out.println(a.equals(b));//calls object class equals method(Reference Comparison)
	 String s = new String("abc");
     String s2= new String("abc");
     System.out.println(s);
     System.out.println(s2);
     System.out.println(s.equals(s2));//true, calls string class equals method(Content Comparison)
     String s3 = new String("hi");
     String s4 = new String("hello");//false
     System.out.println(s3==s4);


	}

}
