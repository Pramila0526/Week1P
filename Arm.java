package com.bridgelabz.practice;
import java.util.*;


public class Arm 
{
public static void main(String args[])
{
	int a,arm=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	int n=sc.nextInt();
	int temp=n;
	while(n>0)
	{
		a=n%10;
		n=n/10;
		arm=arm+(a*a*a);
	}
	if(temp==arm)
	{
	System.out.println("It is armstrong");
	}
	else
	{
		System.out.println("It is not armstrong");
	}
}
}



