package com.sonata.CompletExample;


public class Employee implements Comparable <Employee> {
	
	int eid;
	String ename;
	double esal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return this.esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	public int compare(Employee s1, Employee s2) {
		if(s1.eid==s2.eid)
			return 0;
		else return s1.eid>s2.eid ? 1: -1;
	}
	
	
	
	@Override
	public int compareTo(Employee o) {
		if(eid==o.getEid())
		return 0;
	
	else 
		return -1;
	
	
	
	
	}

}
