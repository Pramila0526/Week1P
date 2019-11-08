package com.bridgelabz.practice;
import java.util.*;
import com.bridgelabz.practice.Utility;
public class searchSort 
{

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		/* System.out.println("Enter the number of integers");

		   int n=sc.nextInt();
		   int a[]=new int[10];

		   System.out.println("Enter" +n+ "elements");
		   for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		   System.out.println("Enter the Element to be searched");
		   int search=sc.nextInt();
System.out.println(Utility.binarySearch(n, a, search));

// ^^^  Binary search for integer

System.out.println("Enter the number of Strings");

int s1=sc.nextInt();
String[] arr = new String[s1];

System.out.println("Enter" +s1+ "elements");
for(int i=0;i<s1;i++)
{
 arr[i]=sc.next();
}
System.out.println("Enter the Element to be searched");
String search1=sc.next();
int result;

 result = Utility.binarySearchp(arr,search1,s1); 
 if (result == -1) 
	    System.out.println("Element not present"); 
	else
	    System.out.println("Element found at" + "index " + result); 
 
// ^^^ Binary search for string
 
 System.out.println("Enter the number of Elements");
 int n1=sc.nextInt();
 int arr1[]=new int[n1];
 System.out.println("Enter" +n1+ "Elements");
 for(int i=0;i<n;i++)
 {
	 arr1[i]=sc.nextInt();
 }
System.out.println(Utility.insertionSort(n1,arr1));*/

//^^^ Insertion sort for integer
 
		 System.out.println("Enter the number of integers");
		 int n2=sc.nextInt();
		 String arr2[]=new String[n2];
		 System.out.println("Enter" +n2+ "Elements");
		 for(int i=0;i<n2;i++)
		 {
			 arr2[i]=sc.next();
		 }
System.out.println(Utility.sort(n2,arr2));
 

}
}
 