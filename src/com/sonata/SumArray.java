package com.sonata;

public class SumArray {
	  public static void main(String[] args) {  
	        int [] arr = new int [] {1, 2, 3, 4, 5,6};  
	        int sum = 0;  
	        //Loop to calculate sum of elements  
	        for (int i = 0; i < arr.length; i++) {  
	           sum = sum + arr[i];  
	        }  
	        System.out.println("Sum of all the elements of an array: " + sum);  
	    }  
	}  