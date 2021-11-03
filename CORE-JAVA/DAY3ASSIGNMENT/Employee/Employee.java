package com.sonata;

public class Employee {
//  class and object concept using Employee Details as an example
		int eid;
		String ename;
		double esal;
		
		Employee(){}//empty constructor
		
		Employee(int a,String b){
			//constructor with 2 parameters 
			this.eid=a;
			this.ename=b;
			
		}
				
		public double salcal(int a) {
			
			return this.esal=a;
		}
		
		public void display() {
			System.out.println("Emp Id : "+eid);
			System.out.println("Emp Name : "+ename);
			System.out.println("Emp Sal : "+esal);	
			System.out.println();
		}
		public static void main(String[] args) {
			
			Employee e1= new Employee(10,"revathi");
			e1.salcal(10000);
			e1.display();
			
			
		}
}
