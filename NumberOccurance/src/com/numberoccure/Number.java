package com.numberoccure;

public class Number {
	public static void main(String[] args) {
		int num=223334456;
		for(int i=1;i<=9;i++)
		{
			int temp=num;
			int count=0;
	
			while(temp>0)
			{
				int rem = temp % 10;

				if (rem == i) 
				{
					count++;
				}

				temp = temp / 10;
			}

			System.out.println(i + " occurs " + count + " times");
		}

	}
}