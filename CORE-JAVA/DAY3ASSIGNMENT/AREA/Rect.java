package com.sonata;

public class Rect extends Square {

	public int area(int l,int b) {
		this.m=l*b;
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r=new Rect();
		r.area(10,20);
		r.display();
	}

}
