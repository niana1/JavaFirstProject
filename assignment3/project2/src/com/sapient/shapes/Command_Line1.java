package com.sapient.shapes;
import java.util.Scanner;
import java.util.Arrays;
public class Command_Line1 {
    void displaydata(int a[])
    {
    	for (int i = 0; i < a.length; i++) {  
            System.out.print(a[i] + " ");  
    }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  sum = 0;
		
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();

        }
        Command_Line1 cl=new Command_Line1();
        cl.displaydata(arr);
        Calculations cal=new Calculations();
        cal.sum(arr);
        cal.average(arr);
        cal.highest(arr);
      
	}

}
