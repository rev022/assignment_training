package com.sonata;

public class Tester extends Employee{


Tester(int id, String name){
		
		super(id,name);
	}
	
	Tester(){}
	
	
	public double salcal(int a) {
		this.esal=a*1.1;
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