package com.bridgelabz.practice;
import java.util.*;

public class uinput {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter Username");
	String name=sc.nextLine();
	int n1=name.length();
	
	if(name.length()<4)
	{
		String output="Hello" +name+ ",How are you? ";
		System.out.println(output);
	}
	else
	{
		System.out.println("Username should have min 3 characters");
	}
	}

}
