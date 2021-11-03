package com.sonata;


public class Custom {


	public static void main(String args[]) throws MyOwnException{
		int sal =10777;
		if(sal<100000)
			throw new MyOwnException("salary is less 100000");
			else
				System.out.println("salary is more than 100000");
		}
	}
	
	
	

