
/******************************************************************************************
Factors
a. Desc -> 
Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.
Name :- Pramila Mangesh Tawari
Date :- 04/11/2019
****************************************************************************************************/
package com.bridgelabz.practice;
import java.util.*;
public class PrimeFactor 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
		}
	/**	if(n>2)
		{
			System.out.println(n);
		}**/
	}

}
