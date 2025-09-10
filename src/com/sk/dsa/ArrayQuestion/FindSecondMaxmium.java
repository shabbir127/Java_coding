package com.sk.dsa.ArrayQuestion;

public class FindSecondMaxmium {
	
	public static void printArray(int [] arr)
	{
		for(int i=0; i< arr.length ;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	
	public static int findSecondMax(int [] arr)
	{
	   int max=Integer.MIN_VALUE;
	   int secondMax=Integer.MIN_VALUE;
	   for(int i=0; i < arr.length;i++)
	   {
		   if(arr[i] > max)
		   {
			   secondMax=max;
			   max=arr[i];
		   }else if (arr[i] > secondMax && arr[i] != max) {
			
			   secondMax=arr[i];
		}
	   }
	   
	   return secondMax;
	 
	}
	
	public static void main(String[] args) {
		int[] arr= {2,13,35,2,34,33,5};
		printArray(arr);
		int result=findSecondMax(arr);
		System.out.println("Second max Value = "+result);
		
	}

}
