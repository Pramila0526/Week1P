/******************************************************************
Distance
Write a program Distance.java that takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
Name :- Pramila Mangesh Tawari
Date :- 04/11/2019
*****************************************************************************/
package com.bridgelabz.practice;
import java.util.*;
public class Distance 
{

	public static void main(String args[]) 
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of x");
	int x=sc.nextInt();
	System.out.println("Enter the value of y");
	int y=sc.nextInt();
	double dist = Math.sqrt(x*x + y*y);	
	System.out.println(dist);
}
}

/**
public class Distance {
public static void main(String[] args) {

    

	int x = 3;
    int y = 2;

    
                int dist = (int) Math.pow(x,2);
      int dist1 = (int) Math.pow(y,2);

double res=dist+dist1;
    // output distance
    System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " +res);
}   
}**/