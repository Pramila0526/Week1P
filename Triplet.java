package com.bridgelabz.practice;
import java.util.*;

public class Triplet {
	
	public static void main(String[] args) 
	{ 	 
			int l, r; 
			int a[] = { 1, 4, 45, 6, 10, 8 }; 
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your choice");
			int sum =sc.nextInt(); 
			int n = a.length; 

			
			
			for (int i = 0; i < n- 2; i++) { 

				
				for (int j = i + 1; j < n- 1; j++) { 

			
					for (int k = j + 1; k <n; k++) { 
						if (a[i] + a[j] + a[k] == sum) { 
							System.out.print("Triplet is " + i + ", " + j + ", " + k+ ""); 
						} 
					
					} 
				} 
			} 

		
		} 
} 

	
