package com.bridgelabz.practice;
import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 System.out.println("guess a no between 0 to 127 ");
	
	    int low = 0, high = 127, mid;
		while (low != high) 
		{
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid  );
			System.out.println("Enter 2 if no is between "	+ (mid + 1) + " - " + high);
			int c = sc.nextInt();
			mid = (low + high) / 2;
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		
	            System.out.println("guessed no is " +low);
		
		}
	}
