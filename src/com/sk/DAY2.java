package com.sk;

public class DAY2 {

	//reverse Array..
	public static void reverseArray(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i< arr.length ;i++)
		{
			System.out.print(arr[arr.length - 1 -i] + " ");
			
		}
		
		int start=0;
		int end=arr.length-1;
		while(start < end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start ++;
			end --;
		}
		System.out.println("Next");
		for(int i=0 ; i < arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
		
	}
	
	//max and min
	public static void MaxMin(int[] arr)
	{
		int min =arr[0];
		int max =arr[0];
		
		//min value
		for(int i=0;i < arr.length;i++)
		{
			if(arr[i]< min)
			{
				min=arr[i];
			}
			if (arr[i] > max ) {
				max=arr[i];
			}
		}
		System.out.println("\nMinimum value:-" +min +"\nMaximum value:- "+max);
		
		
	}
	
	public static void main(String[] args) {
		int [] arr= {1,3,4,7,8,9};
		reverseArray(arr);
		MaxMin(arr);
	}
}
