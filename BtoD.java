package com.bridgelabz.practice;

import java.util.*;
public class BtoD 
{
	public static void main(String args[])
	{
		int rem;
		int Decimal=0;
		int p=0;  //for power
		int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Binary Number");
num=sc.nextInt();
while(num != 0)
   {  
	rem=num%10;  
	 
	Decimal+=rem*Math.pow(2,p);  //remainder is going to multiply with 2 and its power 
	num=num/10;
	p++;                         //power incremented as per the logic
}
System.out.println("Result is" +Decimal);
}
}
		
/*************
other logic instead of math.pow
decimalNumber = decimalNumber + remainder * j;
j = j * 2;***********/



/****
 Using inbuilt function
 String Binary="1010";
 int decimal=Integer.parseInt(Binary,2);
 System.out.println(decimal);
 
 ***/