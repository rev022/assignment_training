package com.sonata;

public class Square {

	int l;
	int b;
	int h;
	int m;
	
	Square(){}
	
	Square(int a){
		this.l=a;
	}
	
	public int area(int l) {
		this.m= l*l;
		return this.m;
	}
	
	public void display() {
		System.out.println("the area of the figure is " + this.m);
	}
	
	public static void main(String args[]) {
		Square s1= new Square();
		s1.area(10);
		s1.display();
	}
	
}
