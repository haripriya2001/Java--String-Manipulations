package com.practice.stringmethods;

class A{
	
}
public class Equals_Vs_DoubleEquals_Symbol {

	public static void main(String[] args) {
        int i=10;
        int j=10;
        A a1=new A();
        A a2= new A();
        String str1 = new String("abc");
        String str2 = new String("abc");
        
        System.out.println(i==j);//true, primitive values it checks values 
        System.out.println(a1==a2);//false, reference comparison
        System.out.println(str1 == str2);//false,reference comparison
	}

}
