package com.bridgelabz.practice;
import java.util.*;
public class Maxchar {

	public static void main(String[] args) 
	{
		String str;
		int count[]=new int[200];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		
		int n1=str.length();
		for(int i=0;i<n1;i++)
		{
			count[str.charAt(i)]++;
		}
		int max=-1;
		char result=' ';
		for(int i=0;i<n1;i++)
		{
			if(max<count[str.charAt(i)])
			{
				max=count[str.charAt(i)];
				result=str.charAt(i);
			}
		}
System.out.println("Maximum occuring string is " +result);
	}

}
