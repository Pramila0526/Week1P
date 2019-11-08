/***************************************************************************************************
Power of 2
a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.

Name :- Pramila Mangesh Tawari
Date :- 04/11/2019
*******************************************************************************************************/
package com.bridgelabz.practice;
import java.util.*;
public class PowerOf2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the powers ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			int result= (int) Math.pow(2, i);
			System.out.println("2^" +i+ "=" +result);
			
		}

	}

}
