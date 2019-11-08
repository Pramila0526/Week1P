/******************************************************************
 * 2D Array
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
OutputStreamWriter to print the output to the screen.package com.bridgelabz.practice;
Name :- Pramila Mangesh Tawari
Date :- 04/11/2019
*****************************************************************************/
package com.bridgelabz.practice;
import java.util.*;
public class Array2D {

	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int r=sc.nextInt();
		System.out.println("Enter number of columns");
		int c=sc.nextInt();
		
		int a[][]=new int[r][c];
		System.out.print("Enter " + r*c + " Elements to Store in Array :\n");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			
				  a[i][j]=sc.nextInt();						
			
		}

	}
		System.out.println("Elements in an array");

	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
		System.out.print(a[i][j]+ "\t");
		}
		System.out.println();
}
}}