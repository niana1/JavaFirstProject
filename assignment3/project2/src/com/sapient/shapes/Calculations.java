package com.sapient.shapes;
import java.util.Arrays; 

public class Calculations {
	int s=0;
	double avg=0;
	void sum(int a[]){
		for(int  i=0;i<a.length;i++)
	      {
	        s=s+a[i]
	        		;
	      }
		System.out.printf("sum is %d",s).println();
	}
	void average(int a[])
	{
		s=0;
		
		for(int  i=0;i<a.length;i++)
	      {
	        s=s+a[i];
	      }
		avg=s/a.length;
		System.out.printf("avg is %.2f",avg).println();
	}
	void highest(int a[])
	{
		int max= Arrays.stream(a).max().getAsInt(); 
		System.out.printf("highest num is %d",max).println();
		
		
	}

}
