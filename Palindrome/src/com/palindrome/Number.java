package com.palindrome;

public class Number {
	public static void main(String[] args) {
		
	
	int num=121;
	int original_num=num;
	int rev=0;
	while(num>0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println("reverse no is:"+rev);
	
	if(original_num==rev)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not Palindrome");
	}
	
	}
}
