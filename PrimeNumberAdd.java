/***************************************************************************************************
Program to find the sum of first 1000 prime numbers

Name :- Pramila Mangesh Tawari
Date :- 02/11/2019
*******************************************************************************************************/
package com.bridgelabz.practice;
public class PrimeNumberAdd
{
	public static void main(String args[])
	{
		int num=2;
		int count=0;
		int sum=0;
		while(count<1000)
		{
			if(isPrime(num))
			{
			sum=sum+num;
			count++;
		}
			num++;
		}
		System.out.println(sum);
	}
	public static boolean isPrime(int num)
	{
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	}
