/***************************************************************************************************
Basic Logic to convert String to number without using parse

Name :- Pramila Mangesh Tawari
Date :- 02/11/2019
*******************************************************************************************************/package com.bridgelabz.practice;

public class StringToIntB 
{
public static void main(String args[])
{
int a= '0';

System.out.println(a);
String inputString = "123";
int strcharint= inputString.charAt(0);
System.out.println(strcharint);

int n= (inputString.charAt(0)-'0');
System.out.println(n);

}
}