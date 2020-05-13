package project3;

import java.util.Scanner;

public class KeyRead_Line2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();
        }
      Calculations cal=new Calculations();
      cal.sort(arr);
      cal.find(arr, 4);
      cal.display(arr);
      
	}

}
