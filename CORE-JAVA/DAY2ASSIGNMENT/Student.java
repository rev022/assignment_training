package com.sonata.packageEg;

public class Student {

	



		//variable declaration
		int stid;
		String sname;
		String sclass;
		
		Student(){}
		//constructor with 2 parameters
		Student(int a, String b, String c){
			this.stid=a;
			this.sname=b;
			this.sclass=c;
			
			
		}
	
		
		//display method
		public void display() {
			System.out.println("id:" +stid);
			System.out.println("name:" +sname);

			System.out.println("class:" +sclass);
			System.out.println();


			
		}
		// main method
		public static void main(String args[]) {
			Student s1=new Student(10,"revathi","SecondPU");
			s1.display();
											// passing values 
			Student s2=new Student(14,"ramesh","FirstPU");
			s2.display();
			
			
			
		}
		
	}


