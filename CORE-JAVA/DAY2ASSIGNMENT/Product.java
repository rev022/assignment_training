package com.sonata.packageEg;

public class Product {



		//variable decleration
		int pid;
		String pname;
		double pprice;
		
		Product(){}
		//constructor with 2 parameters
		Product(int a, String b, double c){
			this.pid=a;
			this.pname=b;
			this.pprice=c;
			
			
		}
	// method to calculate total marks
		public double prodprice(double gst){
			this.pprice=pprice+gst;
			return this.pprice;
		}
		//display method
		public void display() {
			System.out.println("id:" +pid);
			System.out.println("name:" +pname);

			System.out.println("price:" +pprice);
			System.out.println();


			
		}
		// main method
		public static void main(String args[]) {
			Product s1=new Product(10,"jwelery",2000);
			s1.prodprice(200);
			s1.display();
											// passing values 
			Product s2=new Product(14,"phone",40000);
			s2.prodprice(4000);
			s2.display();
			
			
			
		}
		
	}


