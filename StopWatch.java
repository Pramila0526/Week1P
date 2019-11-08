package com.bridgelabz.practice;
import java.util.*;
public class StopWatch 
{
	private long startTime = 0;
	private long stopTime = 0;
	private boolean running = false;


	public void start() {
	    this.startTime = System.currentTimeMillis();
	    this.running = true;
	}


	public void stop() {
	    this.stopTime = System.currentTimeMillis();
	    this.running = false;
	}


	//elaspsed time in milliseconds
	public long getElapsedTime() {
	    long elapsed;
	    if (running) {
	         elapsed = (System.currentTimeMillis() - startTime);
	    }
	    else {
	        elapsed = (stopTime - startTime);
	    }
	    return elapsed;
	}


	//elaspsed time in seconds
	public long getElapsedTimeSeconds() {
	    long elapsed;
	    if (running) {
	        elapsed = ((System.currentTimeMillis() - startTime) / 1000);
	    }
	    else {
	        elapsed = ((stopTime - startTime) / 1000);
	    }
	    return elapsed;
	}




	//sample usage
	public static void main(String[] args) {
	    StopWatch s = new StopWatch();
	    s.start();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Start time");
	    long startTime=sc.nextInt();
	    
	    System.out.println("Enter Stop time");
	    long stopTime=sc.nextInt();
	    s.stop();
	    System.out.println("elapsed time in milliseconds: " + s.getElapsedTime());
	    System.out.println("elapsed time in 1seconds: " + s.getElapsedTimeSeconds());
	
	}
	
}
