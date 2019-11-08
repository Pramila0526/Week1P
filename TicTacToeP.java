package com.bridgelabz.practice;
import java.util.*;


class Tictactoe
{
	
	public static final int X=1, O=-1;
	public static final int Empty=0;
	public  int player=X;
	public int[][] board=new int[3][3];
	public Boolean isEmpty=false;
	
	 void putSign(int x,int y)
	{
		if(x<0 || x>2 || y<0 || y>2)
		{
			System.out.println("Invalid Selections");
			
		}
		else if(board[x][y]!=Empty)
		{
			System.out.println("position occupied");
		}
		board[x][y]=player;
		player=-player;
	}
	
	public String toString()
	{
		StringBuilder s=new StringBuilder();
		isEmpty=false;
	int i,j;
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			switch(board[i][j])
			{
			case X:
				s.append(" X ");
				break;
			case O:
				s.append(" O ");
				break;
			case Empty:
				s.append("   ");
				isEmpty=true;
				break;
			}
			if(j<2)
			{
				s.append("|");
				
			}
			
		}
		if(i<2)
		{
			s.append("\n-----------\n");
		}
	}
			return s.toString();
	}
	public void dispWinner()
	{
		if(isWin(X))
		{
			System.out.println("X wins...!!!");
	}
	if(isWin(O))
	{
		System.out.println(" O wins...!!!");
	}
	else
	{
		if(!isEmpty)
		{
			System.out.println("Its a tie");
		}
	}}
	
	boolean isWin(int Player)
	{
		return((board[0][0] + board[0][1] + board[0][2] == player*3) ||
				(board[1][0] + board[1][1] + board[1][2] == player*3) ||
				(board[2][0] + board[2][1] + board[2][2] == player*3) ||
				(board[0][0] + board[1][0] + board[2][0] == player*3) ||
				(board[0][1] + board[1][1] + board[2][1] == player*3) ||
				(board[0][2] + board[1][2] + board[2][2] == player*3) ||
				(board[0][0] + board[1][1] + board[2][2] == player*3) ||
				(board[2][0] + board[1][1] + board[0][2] == player*3));
	}

}
public class TicTacToeP {
	public static void main(String args[])
	{
		Tictactoe t=new Tictactoe();
		Scanner sc=new Scanner(System.in);
		int x=0,y=0;
		do
		{
			System.out.println(t.player==t.X?"X's Turn":"Y's Turn");
			System.out.println("Enter x and y palces");
		
			x=sc.nextInt();
			y=sc.nextInt();
			t.putSign(x, y);
			System.out.println(t.toString());
			System.out.println("_____________________________");
			t.dispWinner();
			
		}while(t.isEmpty);
	}
}