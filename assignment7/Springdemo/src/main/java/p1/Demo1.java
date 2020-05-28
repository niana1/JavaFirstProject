package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Demo1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        List<Employee> A=new ArrayList<Employee>();
		HelloWorld ob = (HelloWorld) context.getBean("firstb");
		ob.display();
		
		Holiday ho = (Holiday) context.getBean("h1");
		
	
		
		for(int i=0;i<3;i++)
    	{
	    	 Employee emp= (Employee) context.getBean("emp"+i);
    		A.add(emp);
    	}
		System.out.println("Enter emp_id");
		int id=scan.nextInt();
		
		System.out.println("emp_id" +" "+ A.get(id).getEmp_id() +"\n" + "emp_name" +" "+A.get(id).getEmp_name()+"\n"+"emp_city"+" " + A.get(id).getEmp_city());




	}

}
