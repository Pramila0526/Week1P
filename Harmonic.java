/***************************************************************************************************
Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.

Name :- Pramila Mangesh Tawari
Date :- 04/11/2019
*******************************************************************************************************/
package com.bridgelabz.practice;
import java.util.*;
public class Harmonic {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		
	float harmonic=(float) 0.0;
		while(n>0)
		{
			harmonic= harmonic+ (float) 1/n;
			n--;
			System.out.print(harmonic +"  ");
        }
      System.out.println("");
      System.out.println("Output of Harmonic Series is "+harmonic);
		
	}

}
	/**	float harmonic=1;
		for(int i=2;i<=n;i++)
		{
			harmonic += (float) 1/i;
		}
	      System.out.println(harmonic);

	}
}*/
