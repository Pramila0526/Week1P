package com.bridgelabz.practice;
import java.util.*;
public class Permutation 
{

	
		public static String permutationusingrecusrion(String s,int i,int n)
		{
			
			
			int j;
		   final int count=0;
			if(i==n)
			{
				
				System.out.println(s);
				
				
			}
			else
				for(j=i;j<n;j++)
				{
					s=swap(s,i,j);
					permutationusingrecusrion(s,i+1,n);

					s=swap(s,i,j);
					
				}
			
			return s;
		}


		private static String swap(String a, int i, int j) 
		{
			{ 
		        char temp; 
		        char[] charArray = a.toCharArray(); 
		        temp = charArray[i] ; 
 		        charArray[i] = charArray[j]; 
		        charArray[j] = temp; 
		        return String.valueOf(charArray); 
		    } 
			
		}


public static void main(String[] args)
{

	Scanner sc=new Scanner(System.in);
	System.out.println("Output");
	String s=sc.nextLine();
	String output3=permutationusingrecusrion(s,0,s.length());
}
}
