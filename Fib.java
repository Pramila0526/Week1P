package com.bridgelabz.practice;
import java.util.*;
public class Fib 
{


public static void main(String args[])

{
	int first=0,second=0,next=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limit in which you want fib series");
int n=sc.nextInt();


		{
			for(int i=0;i<n;i++)
		
		{
			if(n<1)
			{
				next=n;
		}
		else
		{
			first=second;
			second=next;
			
			next=first+second;

		}
			System.out.println(first);
		}
}
		
}}