package com.sonata;

public class CountDuplicates {  
    public static void main(String[] args) {      
          
        int [] arr = new int [] {1,1,2,3,3,4,5,6,6};   
        int k=0;  
        System.out.println(" Count of Duplicate elements in given array: ");  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                k++;
            }  
            
        }  
        System.out.println(k);
    }  
}  