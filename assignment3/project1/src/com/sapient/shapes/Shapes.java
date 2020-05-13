package com.sapient.shapes;

public class Shapes {
	void calculateShapeArea(int sh,int l)
	{
		if(sh==1)
		{
			System.out.println("Area of circle is");
			System.out.println(3.14*l*l);
		}
		else if(sh==3)
		{
			System.out.println("Area of triangle is");

			System.out.println(0.433*l*l);
		}
		else if(sh==4)
		{
			System.out.println("Area of square is");

			System.out.println(l*l);
		}
		else {
			System.out.println("No Shapes present");

		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapes s=new Shapes() ;
		s.calculateShapeArea(4, 15);		
		

	}

}
