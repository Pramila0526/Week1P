package com.bridgelabz.practice;
import java.util.*;
public class SecondLargest {

	public static void main(String[] args) 
	{
     int a[]= {5,6,7,8,19,12};
     int largest=a[0];
     int Slargest=a[0];
     System.out.println("Elements are");
     for(int i=0;i<a.length;i++)
     {
    	 System.out.print(a[i]+ "\t");
     }
     
     for(int i=0;i<a.length;i++)
     {
    	 
       if(a[i]>largest)
    	 {
    		 Slargest=largest;
    		 largest=a[i];
    	 }
    	 else if(a[i]>Slargest )
    	 {
    		 Slargest=a[i];
    	 }
     }
     
System.out.println("\nSecond Largest Element is" + Slargest );
	}

}