package com.sonata;

public class TechEmp extends Employee2 {
	
	
	String skills;
	
	
	
	@Override
	 double salcal() {
		double sal;
		double hra=0.12*Bpay;
		return sal =Bpay+hra;
		
	}
	
	@Override
	public String toString() {
		return "TechEmp [eid=" + eid + ", ename=" + ename +"]";
	}
	
	public static void main (String args[]) {
		TechEmp t= new TechEmp();
		t.Bpay=100;
		t.eid=10;
		t.ename="revathi";
		System.out.println(t.toString());
		System.out.println("salary for tech emp:"+t.salcal());
	}

}
