package com.bridgelabz.practice;

import java.util.Scanner;

public class FibUsingRecursion {
	
	
		   static int n1 = 0, n2 = 0, n3 = 1;
		   static void fibbonacci(int n) {

				
		      if (n > 0) 
		      {
		         
		         n1 = n2;
		         n2 = n3;
		         n3 = n1 + n2;
		         System.out.print(" " + n1);
		         fibbonacci(n-1);
		      }
		   }
		  
		   
		   public static void main(String args[])
		   {
			   Scanner sc=new Scanner(System.in);
			   System.out.println("Enter the limit in which you want fib series");
			   int n=sc.nextInt();
		   
		      fibbonacci(n);
		   }
		}
