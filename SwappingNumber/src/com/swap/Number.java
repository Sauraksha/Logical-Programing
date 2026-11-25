package com.swap;

public class Number {
	
//	public static void main(String[] args) {
//		
//		int a=10;
//		int b=20;
//		
//		int temp=a;
//		a=b;
//		b=temp;
//		
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		
//	}
//
//}
// Swapping without 3rd variable
	public static void main(String[] args) {
		int a=10;
		int b=50;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
