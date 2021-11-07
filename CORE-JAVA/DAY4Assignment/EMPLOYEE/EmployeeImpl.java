package com.sonata.CompletExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



	
	
	public class EmployeeImpl extends Employee implements EmployeeInt {
		List<Employee> l1 = new LinkedList<>();
		
		@Override
		public void addEmployee(Employee e) {
			l1.add(e);
		}
		
		@Override
		public List<Employee> getEmployee(){
			
			return null;
		}
		
		@Override
		public void deleteEmployee(Employee e) {
			
			
		}
		
		@Override
		public double yearSalary(Employee e1) {
			return esal;
			

	}
		
		@Override
		public double appSalary(Employee e1) {
			if(esal>10000)
				return esal;
					else
						return esal+5000;
			
		}

		
		

	
	
	}

