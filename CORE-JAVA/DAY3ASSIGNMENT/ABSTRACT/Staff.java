package com.sonata;

public class Staff extends Employee2 {

	String title;
	
	@Override
	 double salcal() {
		double sal;
		double hra=0.18*Bpay;
		return sal =Bpay+hra;
		
	}
	
	@Override
	public String toString() {
		return "Staff [eid=" + eid + ", ename=" + ename +"]";
	}
	
	public static void main (String args[]) {
		Staff s= new Staff();
		s.Bpay=200;
		s.eid=16;
		s.ename="ramesh";
		System.out.println(s.toString());
		System.out.println("salary for tech emp:"+s.salcal());
	
	}
	
}
