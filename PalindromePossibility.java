package com.bridgelabz.practice;

import java.util.*;

public class PalindromePossibility
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1=scn.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2))
		{
			System.out.println("It is a palindrom ");
		}
		else 
		{
			char[] c1=s1.toCharArray();
			String sub1="";
			String sub2="";
			for(int j=0;j<s1.length()/2;j++)
			{
				sub1=sub1+c1[j];
			}
			
			for(int k=s1.length()/2;k<s1.length();k++)
			{
				sub2=sub2+c1[k];
			
			}
			char csub1=' ';
			for(int i=0;i<sub1.length();i++)
			{
				 csub1=(char) (csub1+sub1.charAt(i));
			}
			char csub2=' ';
			for(int j=0;j<sub2.length();j++)
			{
				csub2=(char) (csub2+sub2.charAt(j));
			}
			
			if(csub1==csub2)
			{
				System.out.println("Palindrom is possible");
			}
			else
			{
				System.out.println("not possible");
			}
		}

		/*
		 * else if(s1!=s2) { int a=(s1.length()-1)/2; for(int j=0;j<a;j++) { for(int
		 * k=a;k<s1.length();k++) { if(s1.charAt(j)==s1.charAt(k)) {
		 * System.out.println("palindrom is possible"); } else {
		 * System.out.println("Palindrom is not possible"); } } } }
		 */

	}
}