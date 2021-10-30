package com.sonata.packageEg;

public class TShirt {
	//Create a T-Shirt  class with the following fields. String color 
	//String material String design Create three instances of object based on different sizes like small, large ,  xtra-large.
		String color;
		String material;
		String design;
		
		public TShirt(String a) {
			this.color=a;
			System.out.println("Inside small constructor");
		}
		public TShirt(String a,String b) {
			this.color=a;
			this.material=b;
			System.out.println("Inside large constructor");
		}
		
		public TShirt(String a,String b,String c) {
			this.color=a;
			this.material=b;
			this.design=c;
			System.out.println("Inside x-large constructor");
		}
		
		public void display() {
			System.out.println("Tshirt Color: "+color);
			System.out.println("Tshirt Material: "+material);
			System.out.println("Product Price : "+design);	
			System.out.println();
		}
		public static void main(String[] args) {
			
			TShirt small=new TShirt("red");
			small.display();
			TShirt large=new TShirt("pink","cotton");
			large.display();
			TShirt xl=new TShirt("blue","nylon","sleveless");
			xl.display();

		}

	}