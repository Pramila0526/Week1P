package com.bridgelabz.practice;


import java.util.*;
public class DtoB
{
	public static void main(String args[])
	{
		int num;
		int Binary[]=new int[40];
		int index=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal Number");
		num=sc.nextInt();
		while(num>0)
		{
			Binary[index++]=num%2;
			num=num/2;
			
		}
		for(int i=index-1;i>=0;i--)
		{
			System.out.print(Binary[i]);
		}
			}
				}