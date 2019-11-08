package com.bridgelabz.practice;
import java.util.*;
public class BinarySearch 
{
	public static void main(String args[])
	{


Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers of Integers");
int n=sc.nextInt();
int a[]=new int[n];

System.out.println("Enter " +n+ "Integers");
for(int i=0;i<n;i++)
 a[i]=sc.nextInt();
System.out.println("enter the numbers to be Searched");
int num=sc.nextInt();
int beg=0;
int end=n-1;
int mid=(beg+end)/2;;

while(beg<=end)
{
	if(a[mid]<num)
	
		beg=mid+1;
	else	if(a[mid]==num)
	{
		System.out.println(num+  " found at " +(mid)); //or +(mid+1)
		break;
	}
	else 

	end=mid-1;
 mid=(beg+end)/2;

	}
		
if(beg>end)
	System.out.println(num+ "is not found");
}
}
