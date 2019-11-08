/***************************************************************************************************
Program to check whether the given number is prime or not

Name :- Pramila Mangesh Tawari
Date :- 02/11/2019
*******************************************************************************************************/

package com.bridgelabz.practice;
import java.util.*;
public class PrimeNumber {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to check whether its is prime or not");
	int num=sc.nextInt();
	int temp=0;
	for(int i=2;i<=num-1;i++)
	{
		if(num%i==0)
		{
		temp=temp+1;
	}
	}
	if(temp>0)
	{
		System.out.println("Not prime");
	}
	else
	{
		System.out.println("Prime number");
	}
	sc.close();
}
}