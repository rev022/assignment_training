package com.sonata;

public class Tri extends Square{

	public int area(int h,int b) {
		this.m=(h*b)/2;
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tri t=new Tri();
		t.area(10,20);
		t.display();
	}

}
	

