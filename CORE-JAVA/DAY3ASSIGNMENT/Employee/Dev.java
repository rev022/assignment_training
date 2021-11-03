package com.sonata;

public class Dev extends Employee{

Dev(int id, String name){
		
		super(id,name);
	}
	
	Dev(){}
	
	
	public double salcal(int a) {
		this.esal=a*2.0;
		return this.esal;
	}
	
	
	public static void main(String args [])
	{
		Dev a1 = new Dev();
		a1.eid=21;
		a1.ename="abc";
		a1.esal=345666;
		a1.display();
		
	}
	}
	
