package project3;
import java.util.Arrays; 
public class Calculations {
	void sort(int a[]){
		 Arrays.sort(a);
		 System.out.printf("Modified arr[] : %s", 
                 Arrays.toString(a));
	}
	void find(int a[],int f)
	{
		int check=0;
		for(int  i=0;i<a.length;i++)
	      {
	        if(a[i]==f)
	        {
	        	check=1;
	        	break;
	        }
	        		
	      }
		if(check==1) System.out.println("num found") ;
		else System.out.println("num not found") ;
		
	}
	void display(int a[])
	{
		System.out.printf(" %s", 
                Arrays.toString(a));

	}

}
