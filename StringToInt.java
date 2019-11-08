/***************************************************************************************************
Program to convert String to number without using parse

Name :- Pramila Mangesh Tawari
Date :- 02/11/2019
*******************************************************************************************************/
package com.bridgelabz.practice;

public class StringToInt {
	
		 
		   public static void main (String args[]) {
		      String str = "6539";
		      System.out.println("String value: " + str);
		 
		      int num = stringToint(str);
		      System.out.println("int value: "+ num);
		   }
		 
		   public static int stringToint( String str ) 
		   {
		      int i = 0; 
		      int number = 0;
		      boolean isNegative = false;
		      int len = str.length();
		      if( str.charAt(0) == '-' )
		      {                       // to check whether the first index of input is negative or not
		         isNegative = true;  //if it is negative
		          i = 1;              // then i will go to the 1st index and start further operation
		      }
		      while( i < len )
		      {
		         number =number* 10;  
		         number =number + ( str.charAt(i++) - '0' ); // Ascii value from index of input is 
		                                                     //subtract with Ascii value of 0 so that 
		         											 //we can get same value in the form of output
		      }
		      if( isNegative ) 
		      {
		        number = -number;
		      }
		      return number;
		   }   
		}
		 


