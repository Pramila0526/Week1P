package com.bridgelabz.practice;

import java.util.Scanner;

public class Lp {
	public static void main(String args[])
	{
	
		int array[]=new int[10];
		int greatest=0;
		int digit=0;
		int test=0;
		
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the number if Integers ");
int n=sc.nextInt();
System.out.println("Enter " +n+ "Integers");
for(int i=0;i<n;i++)
array[i]=sc.nextInt();

		  for (int i = 0; i < array.length - 1; i++) {
		    if ((array[i]) >= digit);
		     {
		      test = (array[i] + array[i+1]);
		        if (test > greatest)
		        { 
		        	greatest = test ;
		        }
		    }
			  System.out.println(greatest);

		  }
		}
		

}
