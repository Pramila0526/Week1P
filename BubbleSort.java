/***************************************************************************************************
Bubble Sort Program

Name :- Pramila Mangesh Tawari
Date :- 02/11/2019
*******************************************************************************************************/
package com.bridgelabz.practice;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) 
	{
		int a[]=new int[15];
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers of integers to  sorted");
		int n=sc.nextInt();
		System.out.println("Enter " +n+ " integers");

		for(int i=0;i<n;i++)
		
		a[i]=sc.nextInt();
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			
			}
		}
		
		System.out.print("sorted array is" );
		{
			for(int i=0; i < n; i++)
			{
				System.out.print(a[i]+ "\t");
			}
		
}
		}
}