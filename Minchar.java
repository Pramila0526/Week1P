package com.bridgelabz.practice;
import java.util.*;
public class Minchar {

	public static void main(String[] args) 
	{
		int count[]=new int[200];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int n1=str.length();
		for(int i=0;i<n1;i++)
		{
			count[str.charAt(i)]++;
		}
		int min=0;
		char result=' ';
		for(int i=0;i<n1;i++)
		{
			if(count[str.charAt(i)]!=0)
			{
				if(min == 0 || count[str.charAt(i)] < min)
				{
					min = count[str.charAt(i)];
					result=str.charAt(i);
				}
			}
		}
System.out.println("Min occuring string is " +result);
	}

}