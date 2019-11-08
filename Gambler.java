/***************************************************************************************************
Gambler
a. Desc -> Simulates a gambler who start with $stake and place fair $1 bets until
he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of
times he/she wins and the number of bets he/she makes. Run the experiment N
times, averages the results, and prints them out.
b. I/P -> $Stake, $Goal and Number of times
c. Logic -> Play till the gambler is broke or has won
d. O/P -> Print Number of Wins and Percentage of Win and Loss.

Name :- Pramila Mangesh Tawari
Date :- 02/11/2019
*******************************************************************************************************/
package com.bridgelabz.practice;

public class Gambler 
{

	public static void main(String[] args)
	{
    int stake=100;
    int goal=500;
    int trials=50;
		int bets=0;
		int win=0;
		for(int i=0;i<trials;i++)
		{
			int cash=stake;
			while(cash>0 && cash<goal)
			{
				bets++;
				if(Math.random() > 0.5)
					cash++;
				else
			 cash--;
	
			}
		if(cash==goal)
			win++;
	
	}
		System.out.println(win+ " wins of " +trials);
		System.out.println("Percentage of game won " +100 * win/trials);
		System.out.println("Avg bets " +1.0*bets/trials);

}
}