/***************************************************************************************************
Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
Take a, b and c as input values to find the roots of x.

Name :- Pramila Mangesh Tawari
Date :- 02/11/2019
*******************************************************************************************************/


package com.bridgelabz.practice;
import java.util.*;
public class Quadratic {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		System.out.println("Enter the value of c");
		int c=sc.nextInt();
		double delta=Math.sqrt(b*b-4*a*c);
		double root1= (-b + (delta))/(2*a);
		double root2= (-b - (delta))/(2*a);
	//	System.out.println("The roots of Quadratic Equations are  +root1+" and "+root2" );
		System.out.println("The roots of the Quadratic Equation  are "+root1+" and "+root2);
		 
    }
}

