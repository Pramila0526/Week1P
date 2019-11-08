package com.bridgelabz.practice;
import java.util.*;
public class armstrong
{
public static void main(String args[])
{
int num,sum=0 ,temp,rem,count=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to check whether it is armstrong or not");
	 num=sc.nextInt();
	temp=num;
	while(temp!=0)
	{
		temp=temp/10;
				
		count++;
		}
		temp=num;

		
		while(temp!=0)
	{
	
	   rem=temp%10;
	   
	  sum=(int) (sum+Math.pow(rem, count));
	   temp=temp/10;
	}

	if(num==sum)
	
		System.out.println("It is armstrong");
		
	
	else
	
		System.out.println("It is not a armstrong");
	
}}

	
	