package com.product;

public class ProductNumber {
	int num=123;
	int product=1;
	
	public void m1()
	{
		while(num>0)
		{
			int rem=num%10;
			product=product*rem;
			num=num/10;
		}
		System.out.println(product);
	}
	
	public static void main(String[] args) {
		ProductNumber pn=new ProductNumber();
		pn.m1();
	}

}
