/***************************************************************************************************
Selection Sort Program

Name :- Pramila Mangesh Tawari
Date :- 02/11/2019
*******************************************************************************************************/
package com.bridgelabz.practice;
import java.util.*;
public class SelectionSort 
{
public static void main(String args[])
{
	int a[]=new int[10];
	int min,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of Integers to be sorted");
	int n=sc.nextInt();
	System.out.println("Enter " +n+ "Integers");
	for(int i=0;i<n-1;i++)
		a[i]=sc.nextInt();
	
	for(int i=0;i<n;i++)
	{
		min=i;

		for (int j=i+1;j<n;j++)
		{
			if(a[min]>a[j])
			
				min=j;
			
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
	
System.out.println("sorted array is" );
{
	for(int i=0; i < n; i++)
	{
		System.out.print(a[i]+ "\t");
	}
 	
}}
}
