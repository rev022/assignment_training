package com.sonata;

public class Mgr extends Employee{

	
Mgr(int id, String name){
		
		super(id,name);
	}
	
	Mgr(){}
	
	
	public double salcal(int a) {
		this.esal=a*1.18;
		return this.esal;
	}
	
	
	public static void main(String args [])
	{
		Mgr a1 = new Mgr();
		a1.eid=21;
		a1.ename="abc";
		a1.esal=345666;
		a1.display();
		
	}
	}
	