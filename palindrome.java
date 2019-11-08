package com.bridgelabz.practice;

import java.util.*;

public class palindrome {
	public static void main(String args[])
	{
	String rev= "";
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter the string");
	String S1=sc.nextLine();	
	int n1=S1.length();
	for (int i=n1-1;i>=0;i--)
	
    rev=rev+ S1.charAt(i);
	
	if(S1.equals(rev))
	
		System.out.println(S1+ " can be a Palindome");
	else
		System.out.println(S1+ " can not be a Palindome");
		
	
	}

	
}