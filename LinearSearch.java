package com.bridgelabz.practice;
import java.util.*;

public class LinearSearch
{
	public static void main(String args[])
	{
		int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of Integers");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter " +n+ "Integers");
for( i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("Enter the element to be searched");
int num=sc.nextInt();
for( i=0;i<n;i++)
{
if(a[i]==num)
{
	System.out.println("Number found at" +i );
	break;
}
}
if(i==n)
{
	System.out.println(num+ "is not present");
}

}
}