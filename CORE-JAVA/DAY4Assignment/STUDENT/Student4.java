package com.sonata.CompletExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class Student4 {
	
	int sid;
	String name;
	int age;
	int marks;
	
	
	
	

	public int getSid() {
		return sid;
	}


	public String getName() {
		return name;
	}

	

	public int getAge() {
		return age;
	}

	

	public int getMarks() {
		return marks;
	}
	Student4(int s,String n,int a, int m){
		super();
		this.sid=s;
		this.name=n;
		this.age=a;
		this.marks=m;
	
	}
	@Override
	public String toString() {
		return "Student4 [sid=" + sid + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

public static void main(String args[]) {
	
	List<Student4> studentlist= new ArrayList<Student4>();
	studentlist.add(new Student4(21,"Revathi",16,99));
	studentlist.add(new Student4(22,"Dhanush",17,88));
	studentlist.add(new Student4(23,"Sharan",18,77));
	
	
	studentlist.sort((Student4 s1,Student4 s2)-> s2.getMarks()-s1.getMarks());
	studentlist.forEach((s)-> System.out.println(s));

}
	



}






