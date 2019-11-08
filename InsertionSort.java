/***************************************************************************************************
Insertion Sort Program

Name :- Pramila Mangesh Tawari
Date :- 02/11/2019
*******************************************************************************************************/
package com.bridgelabz.practice;
import java.util.*;
public class InsertionSort
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int temp;
		int j;
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the number if Integers to be sorted");
int n=sc.nextInt();
System.out.println("Enter " +n+ "Integers");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();

for(int i=1;i<n;i++)
{
	temp=a[i];
	j=i;	
		while(j>0 && a[j-1]>temp)
		{
			a[j]=a[j-1];
			j=j-1;  //for shifting the element on the prev position if condition is true
		}
		a[j]=temp;  //it will store the temp element at its exact position
	}

System.out.println("sorted array is" );
{
	for(int i=0; i < n; i++)
	{
		System.out.print(a[i]+ "\t");
	}

}
sc.close();
}
}