package com.bridgelabz.practice;
import java.util.*;
public class Utility 
{

public static int binarySearch(int n,int a[],int search)
{
	

   
   int beg=0;
   int end=n-1;
   while(beg<=end)
   {
	   int mid=(beg+end)/2;
	   
	   if(a[mid]<search)
	   {
		   beg=mid+1;
	   }
	   else if(a[mid]==search)
	   {
		   System.out.println(search+ "is found at" +(a[mid]-1));
		   break;
	   }
	   else
		   
	   {
		   end=mid-1;
	   }
	   if(beg>end)
	   {
		   System.out.println(search+ "is not there in the array");
	   }
   }
return 0;
   
}
public static int binarySearchp(String arr[], String search1,int s1) 
{ 
    int beg1= 0;
    		int end1 = arr.length - 1; 

    while (beg1 <= end1) { 
        int mid= (beg1 + end1 )/ 2; 

        int res = search1.compareTo(arr[mid]); 

        // Check if x is present at mid 
        if (res == 0) 
            return mid; 

        // If x greater, ignore left half 
        if (res > 0) 
            beg1 = mid + 1; 

        // If x is smaller, ignore right half 
        else
            end1 = mid - 1; 
    } 

    return -1; 
}
public static int insertionSort(int n1,int arr1[])
{
	int j;
	int temp=0;
	for(int i=1;i<n1;i++)
	{
		temp=arr1[i];
		j=i;
		while(j>0 && arr1[j-1]>temp)
		{
		  arr1[j]=arr1[j-1];
		  j=j-1;
		}
		arr1[j]=temp;
	}
	System.out.println("Sorted array is");
	for(int i=0;i<n1;i++)
	{
		System.out.println(arr1[i]+ "\t");
	}
	return temp;
}

public static String sort(int n2,String[] arr2) 
{ 
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter the number of integers"); int n2=sc.nextInt();
		 * String arr2[]=new String[n2]; System.out.println("Enter" +n2+ "Elements");
		 * for(int i=0;i<n2;i++) { arr2[i]=sc.next(); }
		 */
	int n = arr2.length; 
	String key="";
	for (int i = 1; i < n; ++i) { 
		
		 key = arr2[i]; 
		int j = i ; 
			/*
			 * int b=arr2[j-1].compareTo(key);
			 */			
		while ( j >= 0 && arr2[j-1]>key )
		{ 
			arr2[j] = arr2[j-1]; 
			j = j - 1; 
		} 
		arr2[j + 1] = key; 
	}
	System.out.println("Sorted array is");
	for(int i=0;i<n;i++)
	{
		System.out.println(arr2[i]+ "\t");
	}
	return arr2[n]; 
} 

}