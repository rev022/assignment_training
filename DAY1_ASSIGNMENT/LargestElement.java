package com.sonata;

public class LargestElement
{

     public static void main(String []args)
     {
         
         int arr[]=new int[] {33,55,22,11,66,99,88};   //Declare array 
        
               
        int lar1=arr[0];   // first largest element
        int lar2=arr[1];   // second largest element

         //Check by swapping elements
        
               if(lar1<lar2)
                {
                    int temp=lar1;
                    lar1=lar2;
                    lar2=temp;
                }
                
        for(int i=2;i<arr.length;i++)
        {
            if (arr[i] > lar1)
			{
				lar2 = lar1;
				lar1 = arr[i];
			}
			else if (arr[i] > lar2 && arr[i] != lar1)
			{
				lar2 = arr[i];
			}
        }
        System.out.println("First Largest"+lar1);    //Display the first largest
        System.out.println("Second Largest "+lar2);  //Display the second largest
        
       
    }
}