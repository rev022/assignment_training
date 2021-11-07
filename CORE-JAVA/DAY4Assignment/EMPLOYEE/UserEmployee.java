package com.sonata.CompletExample;


public class UserEmployee extends Employee {
	
	public static void main(String args[]) {
		
		Employee e1= new Employee();
		e1.setEid(333);
		e1.setEname("Revathi");
		e1.setEsal(262666);
		
		
		
		
		EmployeeImpl l1= new EmployeeImpl();
	//	l1.addEmployee(e1);
		//l1.addEmployee(e2);
		l1.setEid(333);
		l1.setEname("Dhanush");
		l1.setEsal(100);
		
		System.out.println(l1);
		
		System.out.println("calculated salary of Dhanush "+ l1.yearSalary(l1));
		System.out.println("incremented salary of Dhanush " +l1.appSalary(l1));

		
		System.out.println(e1);

		
		
		

		
	}

}
