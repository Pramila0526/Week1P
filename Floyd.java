package com.bridgelabz.practice;
import java.util.*;
public class Floyd
{
public static void main(String args[])
{
	int num=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of rows and columns in which you want floyd traingle");
	int n=sc.nextInt();
	System.out.println("Floyd Triangle");
	for(int i = 1;i <= n;i++)
	{
		for(int j= 1;j <= i;j++)
		{
			System.out.print(num +" ");
			num++;
		}
		
		System.out.println( );
	}
}
}

