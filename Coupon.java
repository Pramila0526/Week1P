package com.bridgelabz.practice;


import java.util.*;

public class Coupon
{
	public static void main(String[] args) 
	{

		HashSet<String> hs=new HashSet<String>();
		String s="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		char[] c=s.toCharArray();
		Random random=new Random();
		String s1="";
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				char chars=c[random.nextInt(c.length)];
				s1=s1+chars;
			}
			hs.add(s1);
			s1="";
		}
		Iterator itr=hs.iterator();
		int i=1;
		while(itr.hasNext())
		{
			System.out.println("Coupen"+i+" :"+itr.next());
			i++;
		}
	}
}