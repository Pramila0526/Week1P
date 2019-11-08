package com.bridgelabz.practice;
import java.util.*;
public class Arm2
{
public static void main(String args[])
{
int num,temp,count=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to check whether it is armstrong or not");
	 num=sc.nextInt();
	temp=num;
	while(temp!=0)
	{
		
		temp=temp/10;
		count=count+1;
		
		}
		int temp2=num;
		int rem;
		int sum=0;
while(temp2!=0)
	{
	
	   rem=temp2%10;
	   int mul=1;
	   for(int i=1;i<=count;i++)
	   {
		   mul=mul*rem;
		  
	   }
	    sum=sum+mul;
	    temp2=temp2/10;
	}

	if(sum==num)
	
		System.out.println("It is armstrong");
		
	
	else
	
		System.out.println("It is not a armstrong");
	
}}

	
	