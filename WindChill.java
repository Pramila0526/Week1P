package com.bridgelabz.practice;
import java.util.*;
public class WindChill {

	

	public static void main(String[] args) 
	{
	double t=0;     //Double.parseDouble(args[10]);
	double v=1; 	//Double.parseDouble(args[20]);
	double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
	System.out.println("Temperature" +t);
	System.out.println("Wind speed" +v);
	System.out.println("Wind chill" +w);
	}

}

