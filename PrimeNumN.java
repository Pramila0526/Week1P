/***************************************************************************************************
Program to print n Prime numbers
Name :- Pramila Mangesh Tawari
Date :- 02/11/2019
*******************************************************************************************************/
package com.bridgelabz.practice;
import java.util.*;
public class PrimeNumN 
{

public static void main(String[] args)   
{  
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the limit in which you want prime numbers");
	int t=sc.nextInt();
	int ct=0,n=0,i=1,j=1;  
while(n<t)  
{  
j=1;  
ct=0;  
while(j<=i)  
{  
if(i%j==0)  
ct++;  
j++;   
}  
if(ct==2)  
{  
	System.out.println(i+ "\t");  
n++;  
}  
i++;  
}  
sc.close();

}  
}  